Feature: Desktop Test
  as a user I want to check Desktop menu
  @smoke
  @regression
  Scenario: verifyProductAddedToShoppingCartSuccessFully()
    Given I am on Home page
    When Click on currency link
    And chane currency to pound
    And Mouse hover on Desktops Tab and click
    And Click on Show All Desktops
    And Select Sort By position Name A to Z
    And Select product HP LP3065
    And Verify the Text HP LP3065
    And Select Delivery Date 2022-11-30
    And Enter Qty 1 using Select class
    And Click on Add to Cart button
    And Verify the Message Success: You have added HP LP3065 to your shopping cart
    And Click on link shopping cart display into success message
    And Verify the text Shopping Cart
    And Verify the Product name HP LP3065
    And Verify the Delivery Date 2022-11-30
    And Verify the Model Product21
    Then Verify the Total £74.73
