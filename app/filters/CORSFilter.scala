package filters

import javax.inject.Inject
import akka.stream.Materializer
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}

class CORSFilter @Inject() (implicit val mat: Materializer, ec: ExecutionContext) extends Filter {

  def apply(nextFilter: RequestHeader => Future[Result])
           (requestHeader: RequestHeader): Future[Result] = {

    println(requestHeader)
    nextFilter(requestHeader).map { result =>
      result.withHeaders(
        "Access-Control-Allow-Origin" -> "https://morning-taiga-56897.herokuapp.com",
        "Access-Control-Allow-Methods" -> "GET, POST, OPTIONS, DELETE, PUT",
        "Access-Control-Allow-Headers" -> "Accept, Origin, Content-type, X-Json, X-Prototype-Version, X-Requested-With, X-XSRF-TOKEN",
        "Access-Control-Allow-Credentials" -> "true"
      )
    }
  }
}