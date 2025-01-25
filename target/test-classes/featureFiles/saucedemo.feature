Feature: Test Sauce demo Application

  Scenario: validate the Login Functionality
    Given user is on login Page
    And user enter username and password
    And user click on login button

  Scenario: validate the add to products
    When user click on Sauce Labs Backpack product
    When user click on Sauce Labs bike light product
