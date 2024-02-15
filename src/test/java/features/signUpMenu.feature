Feature: Sign Up Menu

  @WEB
  Scenario: Verify that if Sign Up Menu is clicked, pop-up window will be displayed
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    Then Verify that Sign Up Menu Pop-up window will be displayed

  @WEB
  Scenario: Verify that user can sign up with username and password
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the new Sign Up username
    And User fills in the Sign Up password "12345"
    And User clicks the Sign Up button
    Then Verify the alert message "Sign up successful."

  @WEB
  Scenario: Verify that user can't sign up with existing username
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the Sign Up username "amie123"
    And User fills in the Sign Up password "12345"
    And User clicks the Sign Up button
    Then Verify the alert message "This user already exist."

  @WEB
  Scenario: Verify that user can sign up with >99 characters on username
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the Sign Up username with more than 99 characters
    And User fills in the Sign Up password "12345"
    And User clicks the Sign Up button
    Then Verify the alert message "Sign up successful."

  @WEB
  Scenario: Verify that user can sign up with >= 1 characters on password
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the new Sign Up username
    And User fills in the Sign Up password "1"
    And User clicks the Sign Up button
    Then Verify the alert message "Sign up successful."

  @WEB
  Scenario: Verify that user can sign up with >99 characters on password
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the new Sign Up username
    And User fills in the Sign Up password "wnhPVNmVa3DTdK7hb33JcjQzvaCRNMFUXZryGGPYFUdwTw5RQ7fmL18u9xh2BJqucum25VwZvUrNuCxDcjdwi8dywMm7RPTtcBkJ"
    And User clicks the Sign Up button
    Then Verify the alert message "Sign up successful."

  @WEB
  Scenario: Verify that user can't sign up with blank Sign Up form
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the Sign Up username ""
    And User fills in the Sign Up password ""
    And User clicks the Sign Up button
    Then Verify the alert message "Please fill out Username and Password."

  @WEB
  Scenario: Verify that user can't sign up with blank username
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the Sign Up username ""
    And User fills in the Sign Up password "123"
    And User clicks the Sign Up button
    Then Verify the alert message "Please fill out Username and Password."

  @WEB
  Scenario: Verify that user can't sign up with blank password
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User fills in the Sign Up username "amie123"
    And User fills in the Sign Up password ""
    And User clicks the Sign Up button
    Then Verify the alert message "Please fill out Username and Password."

  @WEB
  Scenario: Verify that user can close the Sign Up pop-up window with X button
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User clicks the X button on Sign Up pop-up window
    Then Verify that the Sign Up Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can close the Sign Up pop-up window with Close button
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Sign up"
    And Verify that Sign Up Menu Pop-up window will be displayed
    And User clicks the Close button on Sign Up pop-up window
    Then Verify that the Sign Up Pop-up window is not displayed