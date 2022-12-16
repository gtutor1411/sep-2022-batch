$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features\\Login.feature");
formatter.feature({
  "name": "Login features",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Invalid Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Run"
    }
  ]
});
formatter.step({
  "name": "I enter invalid username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I should be not be successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "user1",
        "password1"
      ]
    },
    {
      "cells": [
        "user2",
        "password2"
      ]
    },
    {
      "cells": [
        "user3",
        "password3"
      ]
    }
  ]
});
formatter.background({
  "name": "This is a background",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch a chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_launch_a_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open the ecommerce website",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_open_the_ecommerce_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Invalid Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Run"
    }
  ]
});
formatter.step({
  "name": "I enter invalid username \"user1\" and password \"password1\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be not be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_should_be_not_be_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "This is a background",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch a chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_launch_a_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open the ecommerce website",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_open_the_ecommerce_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Invalid Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Run"
    }
  ]
});
formatter.step({
  "name": "I enter invalid username \"user2\" and password \"password2\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be not be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_should_be_not_be_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "This is a background",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch a chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_launch_a_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open the ecommerce website",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_open_the_ecommerce_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying Invalid Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Run"
    }
  ]
});
formatter.step({
  "name": "I enter invalid username \"user3\" and password \"password3\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_invalid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be not be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_should_be_not_be_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});