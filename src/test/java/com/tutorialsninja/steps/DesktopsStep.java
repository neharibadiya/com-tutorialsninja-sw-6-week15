package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsStep {
    @When("^Click on currency link$")
    public void clickOnCurrencyLink() {
        new DesktopsPage().clickOnCurrencyLink();
    }

    @And("^chane currency to pound$")
    public void chaneCurrencyToPound() {
        new LaptopsAndNoteBooksPage().changeCurrency();
    }

    @When("^Mouse hover on Desktops Tab and click$")
    public void mouseHoverOnDesktopsTabAndClick() {
        new HomePage().clickOnDesktopLink();
    }

    @And("^Click on Show All Desktops$")
    public void clickOnShowAllDesktops() {
        new DesktopsPage().clickOnAllDesktop();
    }

    @And("^Select Sort By position Name A to Z$")
    public void selectSortByPositionNameAToZ() {
        new DesktopsPage().SortByNameZtoAfromDropdown();
    }

    @And("^Select product HP LP(\\d+)$")
    public void selectProductHPLP() {
        new DesktopsPage().clickOnHPlp3065();
    }

    @And("^Verify the Text HP LP(\\d+)$")
    public void verifyTheTextHPLP() {
        Assert.assertEquals(new DesktopsPage().getVerifyTextHp(), "HP LP3065", "Error Message not displayed");
    }

    @And("^Select Delivery Date (\\d+)-(\\d+)-(\\d+)$")
    public void selectDeliveryDate() {
        new DesktopsPage().selectDeliveryDate();
    }

    // @And("^Enter Qty (\\d+) using Select class$")
    // public void enterQtyUsingSelectClass() {
    // }

    @And("^Click on Add to Cart button$")
    public void clickOnAddToCartButton() {
        new DesktopsPage().clickOnAdToCart();
    }

    @And("^Verify the Message Success: You have added HP LP(\\d+) to your shopping cart$")
    public void verifyTheMessageSuccessYouHaveAddedHPLPToYourShoppingCart() {
        Assert.assertEquals(new DesktopsPage().getVerifyMessage(), "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×", "Error Message not displayed");
    }

    @And("^Click on link shopping cart display into success message2$")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage2() {
        new DesktopsPage().clickOnShppingCart();

    }

    @And("^Verify the text Shopping Cart$")
    public void verifyTheTextShoppingCart() {
        Assert.assertEquals(new DesktopsPage().getVerifyShoppingCart(), "Shopping Cart  (1.00kg)", "Error Message not displayed");
    }

    @And("^Verify the Product name HP LP(\\d+)$")
    public void verifyTheProductNameHPLP() {
        Assert.assertEquals(new DesktopsPage().getVerifyProductName(), "HP LP3065", "Error Message not displayed");
    }

//    @And("^Verify the Delivery Date (\\d+)-(\\d+)-(\\d+)$")
//    public void verifyTheDeliveryDate() {
//    Assert.assertEquals(new DesktopsPage.getVerifyDeliveryDate(), "2023-11-30", "Error Message not displayed");
//    }

    @And("^Verify the Model Product(\\d+)$")
    public void verifyTheModelProduct() {
        Assert.assertEquals(new DesktopsPage().getVerifyModel(), "Product 21", "Error Message not displayed");
    }

    @Then("^Verify the Total £(\\d+)\\.(\\d+)$")
    public void verifyTheTotal£() {
        Assert.assertEquals(new DesktopsPage().getVerifyTotal(), "£74.73", "Error Message not displayed");
    }
}
