Feature: My Account Test
  as a user I want to check My Account
  @smoke
  @regression
  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully()
    Given I am on Home page
    When  I Click on My Account Link
    And Call the method selectMyAccountOptions method and pass the parameter Register
    Then Verify the text Register Account
  @sanity
  @regression
  Scenario: verifyUserShouldNavigateToLoginPageSuccessfully()
    Given I am on Home page
    When I Click on My Account Link
    And Call the method selectMyAccountOptions method and pass the parameter Login
    Then Verify the text Returning Customer
  @regression
  Scenario: verifyThatUserRegisterAccountSuccessfully()
    Given I am on Home page
    When I Click on My Account Link
    And Call the method “selectMyAccountOptions method and pass the parameter Register
    And Enter First Name
    And Enter Last Name
    And Enter Email
    And Enter Telephone
    And Enter Password
    And Enter Password Confirm
    And Select Subscribe Yes radio button
    And Click on Privacy Policy check box
    And Click on Continue button
    And Verify the message “Your Account Has Been Created
    And Click on Continue button
    And Clickr on My Account Link.
    And Call the method “selectMyAccountOptions” method and pass the parameter Logout
    And Verify the text “Account Logout”
    Then Click on Continue button

  Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully()
    Given I am on Home page
    When Click on MyAccount Link4
    And Call the method selectMyAccountOptions method and pass the parameter Login
    And Enter Email address
#    And Enter LastName
    And Enter Pass word
    And Click on Login button
#    And Verify text My Account
    And Click on My Account Link5
    And Call the method selectMyAccountOptions method and pass the parameter Logout
    And Verify the text Account Logout
    And Click on Continue button1