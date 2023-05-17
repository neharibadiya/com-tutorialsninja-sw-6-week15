Feature: Laptop And Notebooks Test
  as a user I want to check LaptopAndNotebooks Tab
  @smoke
  @regression
  Scenario: verifyProductsPriceDisplayHighToLowSuccessfully()
    Given I am on Home page
    When Mouse hover on Laptops & NotebooksTabandclick
    And Click on Show All Laptops & Notebooks
    Then Select Sort By Price (High > Low)
  @sanity
  @regression
  Scenario: verifyThatUserPlaceOrderSuccessfully()
    When Mouse hover on Laptops & NotebooksTabandclick1
    And Click on Show All Laptops & Notebooks1
    And Select Sort By Price (High > Low)
    And Select Product MacBook
    And Verify the text MacBook
    And Click on Add To Cart button
    And Verify the message Success: You have added MacBook to your shopping cart
    And Click on link shopping cart display into success message
    And Verify the text "Shopping Cart
    And Verify the Product name "MacBook
    And Change Quantity two
    And Click on Update Tab
    And Verify the message Success: You have modified your shopping cart
    And Verify the Total
    And Click on Checkout button
    And Verify the text Checkout
    And Verify the Text New Customer
    And Click on Guest Checkout radio button
    And Click on Continue tab
    And Click on Continue Button
    And Add Comments About your order into text area
    And Check the Terms & Conditions check box
    And Click on Continue button
    Then Verify the message Warning: Payment method required