Feature: About Us Menu

  @WEB
  Scenario: Verify that if About Us Menu is clicked, pop-up window will be displayed
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "About us"
    Then Verify that About Us Pop-up window will be displayed

  @WEB
  Scenario: Verify that user can play the video on the About Us pop-up window
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "About us"
    And Verify that About Us Pop-up window will be displayed
    And User clicks the play video button
    Then Verify the video is played

  @WEB
  Scenario: Verify that user can pause the video on the About Us pop-up window
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "About us"
    And Verify that About Us Pop-up window will be displayed
    And User clicks the play video button
    And Verify the video is played
    And User clicks the pause video button
    Then Verify the video is paused

  @WEB
  Scenario: Verify that user can mute the video on the About Us pop-up window
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "About us"
    And Verify that About Us Pop-up window will be displayed
    And User clicks the play video button
    And Verify the video is played
    And User clicks on the mute button
    Then Verify the audio is on mute

  @WEB
  Scenario: Verify that user can unmute the video on the About Us pop-up window
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "About us"
    And Verify that About Us Pop-up window will be displayed
    And User clicks the play video button
    And Verify the video is played
    And User clicks on the mute button
    And Verify the audio is on mute
    And User clicks on the unmute button
    Then Verify the audio is on unmute

  @WEB
  Scenario: Verify that user can close the About Us pop-up window with X button
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "About us"
    And Verify that About Us Pop-up window will be displayed
    And User clicks the X button on About Us pop-up window
    Then Verify that the About Us Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can close the About Us pop-up window with Close button
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "About us"
    And Verify that About Us Pop-up window will be displayed
    And User clicks the Close button on About Us pop-up window
    Then Verify that the About Us Pop-up window is not displayed