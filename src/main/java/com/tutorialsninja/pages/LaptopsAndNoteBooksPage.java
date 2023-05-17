package com.tutorialsninja.pages;

import com.tutorialsninja.browserfactory.ManageBrowser;
import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNoteBooksPage.class.getName());

    public LaptopsAndNoteBooksPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopLink;

    @CacheLookup
    @FindBy(linkText = "Show All Laptops & Notebooks")
    WebElement allLaptopAndNotebooksLink;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPriceHighToLow;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macbookLink;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement varifyMacbook;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement varifySusccess;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement varifyCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement varifyProductMacbook;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-product']/div[1]")
    WebElement varifyCartText;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement sendTextToQuantity;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement varifyTotal;
    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
    WebElement clickonCart;
    @CacheLookup
    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]")
    WebElement clickonCheckout;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement varifyCheckout;
    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-6']//h2")
    WebElement varifyNewCustomer;
    @CacheLookup
    @FindBy(xpath = "//label[text()[normalize-space()='Guest Checkout']]")
    WebElement guestCheckout;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueTab;
    @CacheLookup
    @FindBy(name = "firstname")
    WebElement nameField;
    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastnameField;

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emaileField;
    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telePhone;
    @CacheLookup
    @FindBy(name = "address_1")
    WebElement addressLine;
    @CacheLookup
    @FindBy(name = "city")
    WebElement cityName;
    @CacheLookup
    @FindBy(name = "postcode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement countryName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement zoneName;
    @CacheLookup
    @FindBy(xpath = "(//input[@value='Continue'])[2]")
    WebElement continueCheckout;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement passtext;
    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement termsCondition;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement verifyText1;
    @CacheLookup
    @FindBy(xpath = "//div[contains(@class,'alert alert-danger')]")
    WebElement warningMsg;

    public void clickOnLaptoptopLink() {
        clickOnElement(laptopLink);
    }

    public String shortPriceLowToHigh() {
        List<WebElement> products = ManageBrowser.driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (Low > High)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = ManageBrowser.driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        // Assert.assertEquals("Product not sorted by price High to Low",
        // originalProductsPrice, afterSortByPrice);

        return null;
    }

    public void changeCurrency() {

        List<WebElement> currencyList = ManageBrowser.driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }


    public void clickOnAllLaptopAndNotebooksLink() {
        log.info("clickOnAllLaptopAndNotebooksLink" + allLaptopAndNotebooksLink.toString());
        clickOnElement(allLaptopAndNotebooksLink);
    }

    public void sortByPriceHighToLowfromDropdown() {
        log.info("sortByPriceHighToLowfromDropdown" + sortByPriceHighToLow.toString());
        sendTextToElement(sortByPriceHighToLow, "Price (High > Low)");
    }

    public void clickOnMacbookLink() {
        log.info("clickOnMacbookLink" + macbookLink.toString());
        clickOnElement(macbookLink);
    }

    public String getVerifyMacbook() {
        log.info("getVerifyMacbook" + varifyMacbook.toString());
        return getTextFromElement(varifyMacbook);
    }

    public void clickOnAddToCart() {
        log.info("clickOnAddToCart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getVerifySuccess() {
        log.info("getVerifySuccess" + varifySusccess.toString());
        return getTextFromElement(varifySusccess);
    }

    public void clickOnShoppingCart() {
        log.info("clickOnShoppingCart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getVerifyCart() {
        log.info("getVerifyCar" + varifyCart.toString());
        return getTextFromElement(varifyCart);
    }

    public String getVerifyProductMacbook() {
        log.info("getVerifyProductMacbook" + varifyProductMacbook.toString());
        return getTextFromElement(varifyProductMacbook);
    }

    public void clickOnUpdateCart() {
        log.info("clickOnUpdateCart" + updateCart.toString());
        clickOnElement(updateCart);
    }

    public String getVerifyCarttext() {
        log.info("getVerifyCarttext" + varifyCartText.toString());
        return getTextFromElement(varifyCartText);
    }

    By clearText = By.xpath("//input[contains(@name, 'quantity')]");

    public void clearTextInQuantityField() {
        Actions actions = new Actions(ManageBrowser.driver);
        WebElement quantity = ManageBrowser.driver.findElement(clearText);
        quantity.clear();
    }

    public void sendTextToQuantityField() {
        log.info("sendTextToQuantityField" + sendTextToQuantity.toString());
        sendTextToElement(sendTextToQuantity, "2");
    }

    public String getVerifyTotal() {
        log.info("getVerifyTotal" + varifyTotal.toString());
        return getTextFromElement(varifyTotal);
    }

    public void clickOnCheckoutCart() {
        log.info("clickOnCheckoutCart" + clickonCart.toString());
        clickOnElement(clickonCart);
    }

    public void clickOnFinalCheckout() {
        log.info("clickOnFinalCheckout" + clickonCheckout.toString());
        clickOnElement(clickonCheckout);
    }

    public String getVerifyCheckout() {
        log.info("getVerifyCheckout" + varifyCheckout.toString());
        return getTextFromElement(varifyCheckout);
    }

    public String getVerifyNewCustomer() {
        log.info("getVerifyNewCustomer" + varifyNewCustomer.toString());
        return getTextFromElement(varifyNewCustomer);
    }

    public void clickOnGuestCheckout() {
        log.info("clickOnGuestCheckout" + guestCheckout.toString());
        clickOnElement(guestCheckout);
    }

    public void clickOnContinueTab() {
        log.info("clickOnContinueTab" + continueTab.toString());
        clickOnElement(continueTab);
    }

    public void enterName(String name) {
        log.info("enterNam" + nameField.toString());
        sendTextToElement(nameField, name);
    }

    public void enterLastName(String lastname) {
        log.info("enterLastName" + lastnameField.toString());
        sendTextToElement(lastnameField, lastname);
    }

    public void enterEmail(String email) {
        log.info("enterEmail" + emaileField.toString());
        sendTextToElement(emaileField, email);
    }

    public void enterTelephone(String phone) {
        log.info("enterTelephone" + telePhone.toString());
        sendTextToElement(telePhone, phone);
    }

    public void enterAddress(String street) {
        log.info("enterAddress" + addressLine.toString());
        sendTextToElement(addressLine, street);
    }

    public void enterCity(String city) {
        log.info("enterCity" + cityName.toString());
        sendTextToElement(cityName, city);
    }

    public void enterPostcode(String code) {
        log.info("enterPostcode" + postCode.toString());
        sendTextToElement(postCode, code);
    }

    public void enterCountry(String country) {
        log.info("enterCountry" + countryName.toString());
        sendTextToElement(countryName, country);
    }

    public void enterState(String state) {
        log.info("enterState" + zoneName.toString());
        sendTextToElement(zoneName, state);
    }


    public void clickOnCheckout() {
        log.info("clickOnCheckout" + continueCheckout.toString());
        clickOnElement(continueCheckout);
    }

    public void enterText(String msg) {
        log.info("enterText" + passtext.toString());
        sendTextToElement(passtext, msg);
    }

    public void clickOnTerms() {
        log.info("clickOnTerms" + termsCondition.toString());
        clickOnElement(termsCondition);
    }

    By lastContinue = By.xpath("//input[@id='button-payment-method']");

    public void clickContinue() {
        log.info("clickContinue" + lastContinue.toString());
        clickOnElement(lastContinue);
    }

    public String getVerifyWarningMsg() {
        log.info("getVerifyWarningMsg" + warningMsg.toString());
        return getTextFromElement(warningMsg);
    }
}
