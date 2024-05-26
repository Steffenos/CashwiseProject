Feature: Login functionality for Cashwise Website

  As a user of the Cashwise website
  User wants to be able to log in with their credentials
  So that I can access my account-related features and manage

  Background:
  Given they are on the Cashwise login page

  Scenario: Check login is successful with valid credentials
    Given user enters valid username and password
    And user clicks on login button
    Then user should be logged in successfully


  Scenario Outline: Unsuccessful login with invalid credentials
    Given user enters invalid "<userName>" and <password>"
    When user clicks on the login button
    Then user should see an error message indicating <"error_message">

    Examples:
      | userName                  | password     | error_message                                       |
      | steffensnurkyz1@gmail.com | Cashwise@123 | warning: no match for email address and/or password |
      | invalid@gmail.com         | invalid@1    | warning: no match for email address and/or password |









