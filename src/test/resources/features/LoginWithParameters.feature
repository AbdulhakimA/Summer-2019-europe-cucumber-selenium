@login
  Feature: Login with parameters

    Background:
      Given the user is on the login page
        #if you use common scenario you can put it under Background

    Scenario: Login as a driver
      When user logs in using "user11" and "UserUser123"
      Then the user should be able to login



      Scenario: Login as a sales manager
        When user logs in using "salesmanager123" and "UserUser123"
        Then the user should be able to login

