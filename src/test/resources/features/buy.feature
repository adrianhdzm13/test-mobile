#language: en

Feature: As a user, I want to make purchases of multiple products.

  Background: : Log in with correct data
    Given Swaglabs User is on the site
    When input the credentials login form
      | username      | password     |
      | standard_user | secret_sauce |
    Then Enter the sales screen for items

  Scenario: Add product to cart and make a purchase after logging in.
    Given Swaglabs User is on the site buy
    When select a product Camisa Sauce Labs Bolt and adds it to the cart
    And selects another product Mochila Sauce Labs and adds it to the cart
    Then the products must be in the shopping cart
    And proceed to pay and complete the checkout information with your Adrian, Rico, and 10111
    And thank you for your order





