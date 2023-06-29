#language: en

@LOGIN
Feature: As a user, I want to log in

  Scenario: Log in with correct data
    Given Swaglabs User is on the site
    When input the credentials login form
      | username      | password     |
      | standard_user | secret_sauce |
    Then Enter the sales screen for items


