# PROTOTYPE API OF LOCALIZATION MANAGER

## Prerequisities:
- Node v 5.0.0 or higher

## Run JIRA integrations:
- npm run jira -> from the root folder

## Run TESTS:
- npm test

## Run GUI application for configuring deployment:
- cd deployment && npm start


## Deployment to HEROKU
- Create account on heroku
- Install heroku locally - tutorial is here https://devcenter.heroku.com/articles/heroku-cli
- Enter `heroku login` from the command line and enter credentials
- In the root folder enter `heroku create` (and save the url of deployed application, it will be printed out to standard output -e.g. terminal)
- Then make sure everything is added to git -> `run git add . && git commit -m "Heroku deployment"`
- `git push heroku master`
- Application should be deployed :)
