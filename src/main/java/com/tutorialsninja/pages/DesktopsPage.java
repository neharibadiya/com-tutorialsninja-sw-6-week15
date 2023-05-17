package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
    WebElement clickOnShowAllDeskTop;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByNameZtoA;
    @CacheLookup
    @FindBy(css = "div.container:nth-child(4) div.row div.col-sm-9 div.row:nth-child(7) div.product-layout.product-grid.col-lg-4.col-md-4.col-sm-6.col-xs-12:nth-child(5) div.product-thumb div:nth-child(2) div.caption h4:nth-child(1) > a:nth-child(1)")
    WebElement clickOnHpLp3065;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement verifyText;
    @CacheLookup
    @FindBy(name = "quantity")
    WebElement selectQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyHPlp3065;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement verifyTextHPlp3065;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickShoppingCart;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement verifymessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement verifyShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]\")).contains(\"2023-11-30")
    WebElement verifyDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement verifyModel;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement verifyTotal;


    public void clickOnCurrencyLink() {
        log.info("clickOnCurrencyLink" + currencyLink.toString());
        clickOnElement(currencyLink);
    }

    public void clickOnAllDesktop() {
        log.info("clickOnAllDesktop" + clickOnShowAllDeskTop.toString());
        clickOnElement(clickOnShowAllDeskTop);
    }

    public void SortByNameZtoAfromDropdown() {
        log.info("SortByNameZtoAfromDropdown" + sortByNameZtoA.toString());
        sendTextToElement(sortByNameZtoA, "Name (Z - A)");
    }

    public void clickOnHPlp3065() {
        log.info("clickOnHPlp3065" + clickOnHpLp3065.toString());
        clickOnElement(clickOnHpLp3065);
    }

    public String getVerifyText() {
        log.info("getVerifyText" + verifyText.toString());
        return getTextFromElement(verifyText);
    }

    public void changeQuantity(String quantity) {
        log.info("changeQuantity" + selectQuantity.toString());
        sendTextToElement(selectQuantity, quantity);
    }

    public void clickOnAdToCart() {
        log.info("clickOnAdToCart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getVerifyProductName() {
        log.info("getVerifyProductNam" + verifyHPlp3065.toString());
        return getTextFromElement(verifyHPlp3065);
    }

    public String getVerifyTextHp() {
        log.info("getVerifyTextHp" + verifyTextHPlp3065.toString());
        return getTextFromElement(verifyTextHPlp3065);
    }

    public void clickOnShppingCart() {
        log.info("clickOnShppingCart" + clickShoppingCart.toString());
        clickOnElement(clickShoppingCart);
    }

    public String getVerifyMessage() {
        log.info("getVerifyMessage" + verifymessage.toString());
        return getTextFromElement(verifymessage);
    }

    public String getVerifyShoppingCart() {
        log.info("getVerifyShoppingCart" + verifyShoppingCart.toString());
        return getTextFromElement(verifyShoppingCart);
    }

    public String getVerifyDeliveryDate() {
        log.info("getVerifyDeliveryDate" + verifyDate.toString());
        return getTextFromElement(verifyDate);
    }

    public String getVerifyModel() {
        log.info("getVerifyMode" + verifyModel.toString());
        return getTextFromElement(verifyModel);
    }

    public String getVerifyTotal() {
        log.info("getVerifyTotal" + verifyTotal.toString());
        return getTextFromElement(verifyTotal);
    }

    public void selectDeliveryDate() {

        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        //desktops.selectDeliveryDate();
        //clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }


    public void verifyZtoAforDropDroDown() {
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals("Product not sorted into Z to A order",
        //  originalProductsName, afterSortByZToAProductsName);

    }
}
