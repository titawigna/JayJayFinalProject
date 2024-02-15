Feature: Log In Menu

  @WEB
  Scenario: Verify that if Log In Menu is clicked, pop-up window will be displayed
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    Then Verify that Log In Menu Pop-up window will be displayed

  @WEB
  Scenario: Verify that user can login with newly created account
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the Sign Up username
    And User fills in the Sign Up password "12345"
    And User clicks the Sign Up button
    And Verify the alert message "Sign up successful."
    And User clicks on the Global Navigation Menu "Log in"
    And User fills the Log In username for newly created account
    And User fills the Log In password "12345"
    And User clicks on the Log In button
    Then Verify user has been logged in for newly created account


  @WEB
  Scenario: Verify that user can login with existing account
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User fills the Log In username "amie123"
    And User fills the Log In password "123"
    And User clicks on the Log In button
    Then Verify user has been logged in as "amie123"

  @WEB
  Scenario: Verify that user can't login with incorrect username
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User fills the Log In username "amie124"
    And User fills the Log In password "123"
    And User clicks on the Log In button
    Then Verify the alert message "User does not exist."

  @WEB
  Scenario: Verify that user can't login with incorrect password
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User fills the Log In username "amie123"
    And User fills the Log In password "0812"
    And User clicks on the Log In button
    Then Verify the alert message "Wrong password."

  @WEB
  Scenario: Verify that user can't login with inexistent account
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User fills the Log In username "salahsalah"
    And User fills the Log In password "asdfghjkl"
    And User clicks on the Log In button
    Then Verify the alert message "User does not exist."

  @WEB
  Scenario: Verify that user can't login with blank Log In form
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User fills the Log In username ""
    And User fills the Log In password ""
    And User clicks on the Log In button
    Then Verify the alert message "Please fill out Username and Password."

  @WEB
  Scenario: Verify that user can't login with blank username
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User fills the Log In username ""
    And User fills the Log In password "123"
    And User clicks on the Log In button
    Then Verify the alert message "Please fill out Username and Password."

  @WEB
    Scenario: Verify that user can't login with blank password
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User fills the Log In username "amie123"
    And User fills the Log In password ""
    And User clicks on the Log In button
    Then Verify the alert message "Please fill out Username and Password."

  @WEB
  Scenario: Verify that user can close the Log In pop-up window with X button
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User clicks the X button on Log In pop-up window
    Then Verify that the Log In Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can close the Log In pop-up window with Close button
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User clicks the Close button on Log In pop-up window
    Then Verify that the Log In Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can Log Out from the account
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Log in"
    And Verify that Log In Menu Pop-up window will be displayed
    And User fills the Log In username "amie123"
    And User fills the Log In password "123"
    And User clicks on the Log In button
    And Verify user has been logged in as "amie123"
    And User clicks on the Global Navigation Menu "Log out"
    Then Verify user has been logged out
