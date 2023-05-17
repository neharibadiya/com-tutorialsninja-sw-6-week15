package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LaptopAndNoteBooksStep {
    @When("^Mouse hover on “Laptops & Notebooks” Tab and click$")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
        new LaptopsAndNoteBooksPage().clickOnLaptoptopLink();
    }

    @When("^call selectMenu method and pass the menu = Show All Laptops & Notebooks$")
    public void clickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNoteBooksPage().clickOnAllLaptopAndNotebooksLink();
    }

    @When("^Select Sort By Price \\(High > Low\\)$")
    public void selectSortByPriceHighLow() {
        new LaptopsAndNoteBooksPage().shortPriceLowToHigh();
    }

    @When("^Click on currency link1$")
    public void clickOnCurrencyLink1() {
        new DesktopsPage().clickOnCurrencyLink();
    }

    @And("^chane currency to pound1$")
    public void chaneCurrencyToPound1() {
        new LaptopsAndNoteBooksPage().changeCurrency();
    }

    @When("^Mouse hover on Laptops & NotebooksTabandclick(\\d+)$")
    public void mouseHoverOnLaptopsNotebooksTabAndClick1() {
        new LaptopsAndNoteBooksPage().clickOnLaptoptopLink();
    }


    @When("^Click on Show All Laptops & Notebooks(\\d+)$")
    public void clickOnShowAllLaptopsNotebooks1() {
        new LaptopsAndNoteBooksPage().clickOnAllLaptopAndNotebooksLink();
    }

    @When("^Select Product MacBook$")
    public void selectProductMacBook() {
        new LaptopsAndNoteBooksPage().clickOnMacbookLink();

    }

    @When("^Verify the text MacBook$")
    public void verifyTheTextMacBook() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifyMacbook(), "MacBook", "Error Message not displayed");
    }

    @When("^Click on Add To Cart button$")
    public void clickOnAddToCartButton() {
        new LaptopsAndNoteBooksPage().clickOnAddToCart();
    }

    @When("^Verify the message Success: You have added MacBook to your shopping cart$")
    public void verifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifySuccess(), "Success: You have added MacBook to your shopping cart!\n" +
                "×", "Error Message not displayed");
    }

    @When("^Click on link shopping cart display into success message$")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage1() {
        new DesktopsPage().clickOnShppingCart();

    }


    @When("^Verify the text \"Shopping Cart$")
    public void verifyTheTextShoppingCart() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifyCart(), "shopping cart", "Error Message not displayed");

    }

    @When("^Verify the Product name \"MacBook$")
    public void verifyTheProductNameMacBook() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifyProductMacbook(), "MacBook", "Error Message not displayed");

    }

    @And("^Clear text")
    public void cleareText(int arg0) {
        new LaptopsAndNoteBooksPage().clearTextInQuantityField();
    }

    @When("^Change Quantity two$")
    public void changeQuantity(int arg0) {
        new LaptopsAndNoteBooksPage().sendTextToQuantityField();
    }

    @When("^Click on Update Tab$")
    public void clickOnUpdateTab() {
        new LaptopsAndNoteBooksPage().clickOnUpdateCart();
    }

    @When("^Verify the message Success: You have modified your shopping cart$")
    public void verifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifyCarttext(), "Success: You have added MacBook to your shopping cart!\n" +
                "×", "Error Message not displayed");
    }

    @When("^Verify the Total$")
    public void verifyTheTotal() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifyTotal(), "£1,472.45", "Error Message not displayed");
    }

    @When("^Click on Checkout button$")
    public void clickOnCheckoutButton() {
        new LaptopsAndNoteBooksPage().clickOnCheckoutCart();
    }

    @And("^Click on Final Checkout button$")
    public void clickOnFinalCheckout() {
        new LaptopsAndNoteBooksPage().clickOnFinalCheckout();
    }

    @When("^Verify the text Checkout$")
    public void verifyTheTextCheckout() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifyCheckout(), "Checkout", "Error Message not displayed");
    }

    @When("^Verify the Text New Customer$")
    public void verifyTheTextNewCustomer() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifyNewCustomer(), "New Customer", "Error Message not displayed");
    }

    @When("^Click on Guest Checkout radio button$")
    public void clickOnGuestCheckoutRadioButton() {
        new LaptopsAndNoteBooksPage().clickOnGuestCheckout();
    }

    @When("^Click on Continue tab$")
    public void clickOnContinueTab() {
        new LaptopsAndNoteBooksPage().clickOnContinueTab();
    }

    @When("^Name$")
    public void enterName() {
        new LaptopsAndNoteBooksPage().enterName("Prime");
    }

    @And("^Last Name$")
    public void enterLastName() {
        new LaptopsAndNoteBooksPage().enterLastName("testing");
    }

    @And("^Email field$")
    public void enterEmail() {
        new LaptopsAndNoteBooksPage().enterEmail("prime123@gmail.com");
    }

    @And("^Phone$")
    public void enterPhoneNumber() {
        new LaptopsAndNoteBooksPage().enterTelephone("123634568425");
    }

    @And("^address$")
    public void enterAddress() {
        new LaptopsAndNoteBooksPage().enterAddress("cucumber");
    }

    @And("^City$")
    public void enterCityName() {
        new LaptopsAndNoteBooksPage().enterCity("adtala");
    }

    @And("^Pastcode$")
    public void enterPostcode() {
        new LaptopsAndNoteBooksPage().enterPostcode("365430");
    }

    @And("^County Name$")
    public void enterCountyName() {
        new LaptopsAndNoteBooksPage().enterName("Iceland");
    }

    @And("^State Name$")
    public void enterStateName() {
        new LaptopsAndNoteBooksPage().enterState("Austurland");
    }

    @And("^Click on Continue Button$")
    public void clickOnContinueButton() {
        new LaptopsAndNoteBooksPage().clickOnCheckout();
    }

    @And("^Add Comments About your order into text area$")
    public void addCommentsAboutYourOrderIntoTextArea() {
        new LaptopsAndNoteBooksPage().enterText("thank you very much");
    }

    @And("^Check the Terms & Conditions check box$")
    public void checkTheTermsConditionsCheckBox() {
        new LaptopsAndNoteBooksPage().clickOnTerms();
    }

    @And("^Click on Continue button$")
    public void clickOnContinueButton2() {
        new LaptopsAndNoteBooksPage().clickContinue();
    }

    @Then("^Verify the message Warning: Payment method required$")
    public void verifyTheMessageWarningPaymentMethodRequired() {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().getVerifyWarningMsg(), "Warning: Payment method required!\n" +
                "×", "Error Message not displayed");
    }

}

