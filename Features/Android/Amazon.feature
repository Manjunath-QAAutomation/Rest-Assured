#@TVPurchase_Amazon
Feature: Purchase a TV in Amazon mobile application
  Description: Login to amazon mobile application and search for an item and add to cart and purchase it

   #@TestID_01_Login
   Scenario: Login into app
    Given user launches the app

   #@TestID_02_SearchProduct
   Scenario: Search the product
    And User clicks on Sign-In Button
    Given Hamburger Menu is Displayed
    Then  User clicks on hamburger Menu
    And User moves to setting submenu
    And User select the country as 'Australia'
    When User logged in using username, password and click signIn Button
    Then User should see that home page is displayed
    And User navigates back to Home Page   
    When User searches for '65-inch TV'
    And User click on one of the TV's displays except first and Last
    And User Add the Product to cart
    
    #@TestID_03_CheckoutProduct
    Scenario: Checkout the product 
    Given CartPageHeader is Displayed
    Then  User verify the name, Price and description of the product
    
