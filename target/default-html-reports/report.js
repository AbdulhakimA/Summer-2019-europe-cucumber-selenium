$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Navigation Menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@hello"
    }
  ]
});
formatter.scenario({
  "name": "Fleet --\u003e Vehicles",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hello"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter the sales manager information",
  "keyword": "And "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_enter_the_sales_manager_information()"
});
