Feature: Home Page

@WEB
Scenario: Verify that user is directed to the landing page
  Given User is on the Home Page
  Then Verify the URL is "https://www.demoblaze.com/"

 @WEB
 Scenario: Verify that user can click the Phones category
   Given User is on the Home Page
   And User sees Categories box menu
   And User clicks one of the category "Phones"
   Then Verify user sees "Sony xperia z5"

 @WEB
 Scenario: Verify that user can click the Laptops category
   Given User is on the Home Page
   And User sees Categories box menu
   And User clicks one of the category "Laptops"
   Then Verify user sees "MacBook air"

  @WEB
  Scenario: Verify that user can click the Monitors category
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Monitors"
    Then Verify user sees "Apple monitor 24"

  @WEB
  Scenario: Verify that user can navigate through categories using Next button
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks the Next button
    Then Verify user sees "Apple monitor 24"

  @WEB
  Scenario: Verify that user can navigate through categories using Previous button
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks the Previous button
    Then Verify user sees "Nokia lumia 1520"

  @WEB
  Scenario: Verify that user can click the button to slide right the carousel
    Given User is on the Home Page
    And User sees the carousel
    And User clicks on the slide right carousel
    Then Verify user sees the picture is changing

  @WEB
  Scenario: Verify that user can click the button to slide left the carousel
    Given User is on the Home Page
    And User sees the carousel
    And User clicks on the slide left carousel
    Then Verify user sees the picture is changing

  @WEB
  Scenario: Verify that user can click the first bar on the carousel display
    Given User is on the Home Page
    And User sees the carousel
    And User clicks on the first bar of carousel picture
    Then Verify user sees the first picture

  @WEB
  Scenario: Verify that user can click the second bar on the carousel display
    Given User is on the Home Page
    And User sees the carousel
    And User clicks on the second bar of carousel picture
    Then Verify user sees the second picture

  @WEB
  Scenario: Verify that user can click the third bar on the carousel display
    Given User is on the Home Page
    And User sees the carousel
    And User clicks on the third bar of carousel picture
    Then Verify user sees the third picture

  @WEB
  Scenario: Verify user can click on the Phones item listed
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s6"
    Then Verify user is on the detail page of "Samsung galaxy s6"

  @WEB
  Scenario: Verify user can click on the Laptops item listed
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Laptops"
    And User clicks on the item title name "Sony vaio i7"
    Then Verify user is on the detail page of "Sony vaio i7"

  @WEB
  Scenario: Verify user can click on the Monitors item listed
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Monitors"
    And User clicks on the item title name "ASUS Full HD"
    Then Verify user is on the detail page of "ASUS Full HD"

  @WEB
  Scenario: Verify the global navigation menu
    Given User is on the Home Page
    And User sees the Global Navigation Menu
    Then Verify the menus of Global Navigation Menu

  @WEB
  Scenario: Verify the Home Menu will direct user to the home page
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Home "
    Then Verify user is on the Home Page

  @WEB
  Scenario: Verify that user can go to the Home page by clicking the logo icon
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Cart"
    And User clicks the logo icon
    Then Verify the URL is "https://www.demoblaze.com/index.html"


