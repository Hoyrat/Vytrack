$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Contacts.feature");
formatter.feature({
  "name": "Contacts Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Menu options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@menu"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as a \"driver\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logged_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see following menu options",
  "rows": [
    {
      "cells": [
        "Fleet",
        "Customers",
        "Activities",
        "System"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefs.the_user_should_see_following_menu_options(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});