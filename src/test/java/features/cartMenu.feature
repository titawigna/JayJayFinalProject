Feature: Cart Menu

  @WEB
  Scenario: Verify that if Cart Menu is clicked, it will direct user to the cart page
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Cart"
    Then Verify the URL is "https://www.demoblaze.com/cart.html"

  @WEB
  Scenario: Verify that user can add one item to the cart
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    Then Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items

  @WEB
  Scenario: Verify that user can add more than one items to the cart
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Home "
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Nexus 6"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    Then Verify the list of item on Cart Menu "Samsung galaxy s7, Nexus 6"
    And Verify the total price of the items

  @WEB
  Scenario: Verify that user can add the same item multiple times to the cart
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    Then Verify the list of item on Cart Menu "Samsung galaxy s7, Samsung galaxy s7, Samsung galaxy s7"
    And Verify the total price of the items

  @WEB
  Scenario: Verify that user can delete an item from the cart page
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And User clicks the Delete button for "Samsung galaxy s7"
    Then Verify the list of item on Cart Menu is empty

  @WEB
  Scenario: Verify that user can delete more than one items from the cart page in order
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Home "
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Nexus 6"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7, Nexus 6"
    And User clicks the Delete button for "Samsung galaxy s7"
    And User clicks the Delete button for "Nexus 6"
    Then Verify the list of item on Cart Menu is empty


  @WEB
  Scenario: Verify that user can delete more than one items from the cart page in random order
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Home "
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Iphone 6 32gb"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Home "
    And User clicks one of the category "Phones"
    And User clicks on the item title name "HTC One M9"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7, Iphone 6 32gb, HTC One M9"
    And User clicks the Delete button for "HTC One M9"
    And User clicks the Delete button for "Samsung galaxy s7"
    And User clicks the Delete button for "Iphone 6 32gb"
    Then Verify the list of item on Cart Menu is empty

  @WEB
  Scenario: Verify that user can place an order with one item
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form "Alina"
    And User fills in the Country for Order Form "Brazil"
    And User fills in the City for Order Form "Rio"
    And User fills in the Credit Card for Order Form "90909090909090"
    And User fills in the Month for Order Form "03"
    And User fills in the Year for Order Form "2025"
    And User clicks Purchase button
    Then User sees the pop-up confirmation of order
    And User clicks OK button on the pop-up confirmation


  @WEB
  Scenario: Verify that user can place an order with more than one items
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Home "
    And User clicks one of the category "Laptops"
    And User clicks on the item title name "Sony vaio i7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7, Sony vaio i7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form "A"
    And User fills in the Country for Order Form "B"
    And User fills in the City for Order Form "C"
    And User fills in the Credit Card for Order Form "k"
    And User fills in the Month for Order Form "M"
    And User fills in the Year for Order Form "R"
    And User clicks Purchase button
    Then User sees the pop-up confirmation of order
    And User clicks OK button on the pop-up confirmation

  @WEB
  Scenario: Verify that user can place an order with no item at all
    Given User is on the Home Page
    And User clicks on the Global Navigation Menu "Cart"
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And User fills in the Name for Order Form "1234"
    And User fills in the Country for Order Form "564564"
    And User fills in the City for Order Form "32434"
    And User fills in the Credit Card for Order Form "324234"
    And User fills in the Month for Order Form "ry45g"
    And User fills in the Year for Order Form "34t4f4ef"
    And User clicks Purchase button
    Then User sees the pop-up confirmation of order
    And User clicks OK button on the pop-up confirmation

  @WEB
  Scenario: Verify that user can't place an order with blank order form
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form ""
    And User fills in the Country for Order Form ""
    And User fills in the City for Order Form ""
    And User fills in the Credit Card for Order Form ""
    And User fills in the Month for Order Form ""
    And User fills in the Year for Order Form ""
    And User clicks Purchase button
    Then Verify the alert message "Please fill out Name and Creditcard."

  @WEB
  Scenario: Verify that user can't place an order with blank Name
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form ""
    And User fills in the Country for Order Form "India"
    And User fills in the City for Order Form "Mumbai"
    And User fills in the Credit Card for Order Form "Mastercard"
    And User fills in the Month for Order Form "January"
    And User fills in the Year for Order Form "2025"
    And User clicks Purchase button
    Then Verify the alert message "Please fill out Name and Creditcard."

  @WEB
  Scenario: Verify that user can place an order with blank Country
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form "Muhammad"
    And User fills in the Country for Order Form ""
    And User fills in the City for Order Form "Rio"
    And User fills in the Credit Card for Order Form "090"
    And User fills in the Month for Order Form "0"
    And User fills in the Year for Order Form "0"
    And User clicks Purchase button
    Then User sees the pop-up confirmation of order
    And User clicks OK button on the pop-up confirmation

  @WEB
  Scenario: Verify that user can place an order with blank City
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form "Ilham"
    And User fills in the Country for Order Form "The Netherlands"
    And User fills in the City for Order Form ""
    And User fills in the Credit Card for Order Form "888"
    And User fills in the Month for Order Form "A"
    And User fills in the Year for Order Form "LL"
    And User clicks Purchase button
    Then User sees the pop-up confirmation of order
    And User clicks OK button on the pop-up confirmation

  @WEB
  Scenario: Verify that user can't place an order with blank Credit Card
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form "Nina"
    And User fills in the Country for Order Form "India"
    And User fills in the City for Order Form "Mumbai"
    And User fills in the Credit Card for Order Form ""
    And User fills in the Month for Order Form "January"
    And User fills in the Year for Order Form "2025"
    And User clicks Purchase button
    Then Verify the alert message "Please fill out Name and Creditcard."

  @WEB
  Scenario: Verify that user can place an order with blank Month
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form "Ilham"
    And User fills in the Country for Order Form "The Netherlands"
    And User fills in the City for Order Form "Amsterdam"
    And User fills in the Credit Card for Order Form "888"
    And User fills in the Month for Order Form ""
    And User fills in the Year for Order Form "Zx"
    And User clicks Purchase button
    Then User sees the pop-up confirmation of order
    And User clicks OK button on the pop-up confirmation

  @WEB
  Scenario: Verify that user can place an order with blank Year
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form "Ilham"
    And User fills in the Country for Order Form "The Netherlands"
    And User fills in the City for Order Form "Amsterdam"
    And User fills in the Credit Card for Order Form "888"
    And User fills in the Month for Order Form "Dec"
    And User fills in the Year for Order Form ""
    And User clicks Purchase button
    Then User sees the pop-up confirmation of order
    And User clicks OK button on the pop-up confirmation

  @WEB
  Scenario: Verify that user can place an order with Name and Credit Card details only
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Phones"
    And User clicks on the item title name "Samsung galaxy s7"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "Samsung galaxy s7"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User fills in the Name for Order Form "Victor"
    And User fills in the Country for Order Form ""
    And User fills in the City for Order Form ""
    And User fills in the Credit Card for Order Form "0812312121"
    And User fills in the Month for Order Form ""
    And User fills in the Year for Order Form ""
    And User clicks Purchase button
    Then User sees the pop-up confirmation of order
    And User clicks OK button on the pop-up confirmation

  @WEB
  Scenario: Verify that user can close the order form pop-up window with X button
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Monitors"
    And User clicks on the item title name "ASUS Full HD"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "ASUS Full HD"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User clicks the X button on Order Form pop-up window
    Then Verify that the Order Form Pop-up window is not displayed

  @WEB
  Scenario: Verify that user can close the order form pop-up window with Close button
    Given User is on the Home Page
    And User sees Categories box menu
    And User clicks one of the category "Monitors"
    And User clicks on the item title name "ASUS Full HD"
    And User clicks Add To Cart button
    And Verify the alert message "Product added"
    And User clicks on the Global Navigation Menu "Cart"
    And Verify the list of item on Cart Menu "ASUS Full HD"
    And Verify the total price of the items
    And User clicks Place Order button
    And Verify that Order Form Pop-up window will be displayed
    And Verify the total Price on the Order Form
    And User clicks the Close button on Order Form pop-up window
    Then Verify that the Order Form Pop-up window is not displayed