package com.tutorialsninja.steps;

import com.tutorialsninja.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountStep {
    @When("^I Click on My Account Link$")
    public void iClickOnMyAccountLink() {
        new MyAccountPage().clickonMyAccount();
    }

    @And("^Call the method selectMyAccountOptions method and pass the parameter Register$")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister() {
        new MyAccountPage().selectMyAccountOptions("Register");
    }

    @Then("^Verify the text Register Account$")
    public void verifyTheTextRegisterAccount() {
        Assert.assertEquals(new MyAccountPage().getVerifyRegister(), "Register Account", "Error Message not displayed");
    }

    @When("^I Click on My Account Link1$")
    public void iClickOnMyAccountLink1() {
        new MyAccountPage().clickonMyAccount();
    }

    @And("^Call the method selectMyAccountOptions method and pass the parameter Login$")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogin() {
        new MyAccountPage().selectMyAccountOptions("Login");
    }

    @Then("^Verify the text Returning Customer$")
    public void verifyTheTextReturningCustomer() {
        Assert.assertEquals(new MyAccountPage().getVerifyReturning(), "Returning Customer", "Error Message not displayed");
    }

    @When("^I Click on My Account Link2$")
    public void iClickOnMyAccountLink2() {
        new MyAccountPage().clickonMyAccount();
    }

    @And("^Call the method “selectMyAccountOptions method and pass the parameter Register$")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister1() {
        new MyAccountPage().selectMyAccountOptions("Register");
    }

    @And("^Enter First Name$")
    public void enterFirstName() {
        new MyAccountPage().enterFirstName("Manan");

    }

    @And("^Enter Last Name$")
    public void enterLastName() {
        new MyAccountPage().enterLastName("Shah");
    }

    @And("^Enter Email$")
    public void enterEmail() {
        new MyAccountPage().enterEmailAdd("123manan@gmail.com");
    }

    @And("^Enter Telephone$")
    public void enterTelephone() {
        new MyAccountPage().enterPhone("02029223");
    }

    @And("^Enter Password$")
    public void enterPassword() {
        new MyAccountPage().enterPassword("password1");
    }

    @And("^Enter Password Confirm$")
    public void enterPasswordConfirm() {
        new MyAccountPage().enterConfirmPass("password1");
    }

    @And("^Select Subscribe Yes radio button$")
    public void selectSubscribeYesRadioButton() {
        new MyAccountPage().clickYesonNewsLetter();
    }

    @And("^Click on Privacy Policy check box$")
    public void clickOnPrivacyPolicyCheckBox() {
        new MyAccountPage().clickOnPrivacy();
    }

    @And("^Verify the message “Your Account Has Been Created$")
    public void verifyTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountPage().getVerifyMessage(), "Your Account Has Been Created!", "Error Message not displayed");
    }

    @And("^Clickr on My Account Link\\.$")
    public void clickrOnMyAccountLink() {
        new MyAccountPage().clickOnContinueButton();
    }

    @And("^Call the method “selectMyAccountOptions” method and pass the parameter Logout$")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() {
        new MyAccountPage().selectMyAccountOptions("Logout");
    }

    @And("^Verify the text “Account Logout”$")
    public void verifyTheTextAccountLogout() {
        Assert.assertEquals(new MyAccountPage().getVerifyLogout(), "Account Logout", "Error Message not displayed");
    }

    @And("^Click on Comtinie Link\\.$")
    public void clickrOnContinueLink() {
        new MyAccountPage().clickOnContinueTab();
    }
    //******************************************************************************
    @When("^Click on MyAccount Link4$")
    public void clickOnMyAccountLink4() {
        new MyAccountPage().clickonMyAccount();
    }

    @And("^Call the method “selectMyAccountOptions” method and pass the parameter Login$")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogin2() {
        new MyAccountPage().selectMyAccountOptions("Login");
    }

    @And("^Enter Email address$")
    public void enterEmailAddress() {
        new MyAccountPage().enterEmailAdd("123manan@gmail.com");
    }

    // @And("^Enter LastName$")
    // public void enterLastName() {
    //}

    @And("^Enter Pass word$")
    public void enterPassWord() {
        new MyAccountPage().enterPassword("password1");
    }

    @And("^Click on Login button$")
    public void clickOnLoginButton() {
        new MyAccountPage().clickOnLogin();
    }

      @And("^Verify text My Account$")
      public void verifyTextMyAccount() {
       Assert.assertEquals(new MyAccountPage().getVerifyMessage(), "My Account", "Error Message not displayed");
     }

    @And("^Click on My Account Link5$")
    public void clickOnMyAccountLink5() {
        new MyAccountPage().clickOnLogin();
    }

    @And("^Call the method selectMyAccountOptions method and pass the parameter Logout$")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout2() {
        new MyAccountPage().selectMyAccountOptions("Logout");
    }

    @And("^Verify the text Account Logout$")
    public void verifyTheTextAccountLogout2() {
        Assert.assertEquals(new MyAccountPage().getVerifyLogout(), "Account Logout", "Error Message not displayed");
    }

    @And("^Click on Continue button(\\d+)$")
    public void clickOnContinueButton(int arg0) {
        new MyAccountPage().clickOnContinueTab();
    }
}
