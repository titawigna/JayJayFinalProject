Feature: Contact Menu

  @WEB
  Scenario: Verify that if Contact Menu is clicked, pop-up window will be displayed
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    Then Verify that Contact Menu Pop-up window will be displayed

  @WEB
  Scenario: Verify that user can Send Message of Contact Menu
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User fills the contact email "hala@email.com"
    And User fills the contact name "Nihala"
    And User fills the message "Hello everyone"
    And User clicks the Send Message button
    Then Verify the alert message "Thanks for the message!!"
    And Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can Send Message of an empty Contact Menu
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User fills the contact email ""
    And User fills the contact name ""
    And User fills the message ""
    And User clicks the Send Message button
    Then Verify the alert message "Thanks for the message!!"
    And Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can Send Message of Contact Menu with Contact Email only
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User fills the contact email "ria@email.com"
    And User fills the contact name ""
    And User fills the message ""
    And User clicks the Send Message button
    Then Verify the alert message "Thanks for the message!!"
    And Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can Send Message of Contact Menu with Contact Email only (1 character)
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User fills the contact email "@"
    And User fills the contact name ""
    And User fills the message ""
    And User clicks the Send Message button
    Then Verify the alert message "Thanks for the message!!"
    And Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can Send Message of Contact Menu with Contact Name only
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User fills the contact email ""
    And User fills the contact name "Luna"
    And User fills the message ""
    And User clicks the Send Message button
    Then Verify the alert message "Thanks for the message!!"
    And Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can Send Message of Contact Menu with Contact Name only (1 character)
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User fills the contact email ""
    And User fills the contact name "W"
    And User fills the message ""
    And User clicks the Send Message button
    Then Verify the alert message "Thanks for the message!!"
    And Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can Send Message of Contact Menu with Message only
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User fills the contact email ""
    And User fills the contact name ""
    And User fills the message "Goodbye"
    And User clicks the Send Message button
    Then Verify the alert message "Thanks for the message!!"
    And Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can Send Message of Contact Menu with Message only (1 character)
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User fills the contact email ""
    And User fills the contact name ""
    And User fills the message "G"
    And User clicks the Send Message button
    Then Verify the alert message "Thanks for the message!!"
    And Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can close the Contact Menu pop-up window with X button
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User clicks the X button
    Then Verify that the Contact Menu Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can close the Contact Menu pop-up window with Close button
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Contact"
    And Verify that Contact Menu Pop-up window will be displayed
    And User clicks the Close button
    Then Verify that the Contact Menu Pop-up window is not displayed