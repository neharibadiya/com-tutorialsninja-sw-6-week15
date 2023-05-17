package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;



public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement verifyText;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopNotebookLink;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement verifyText1;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsLink;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement verifyText2;

    public void clickOnDesktopLink() {
        log.info("click On Desktop Link : " + desktopLink.toString());
        clickOnElement(desktopLink);

    }

    public String getVerifyText() {
        log.info("get Verify Text : " + verifyText.toString());
        return getTextFromElement(verifyText);
    }

    public void clickOnLaptopNotebooksLink() {
        log.info("clickOnLaptopNotebooksLink" + laptopNotebookLink.toString());
        clickOnElement(laptopNotebookLink);

    }

    public String getVerifyText1() {
        log.info("getVerifyText1" + verifyText1.toString());

        return getTextFromElement(verifyText1);
    }

    public void clickOnComponentsLink() {
        log.info("clickOnComponentsLink" + componentsLink.toString());
        clickOnElement(componentsLink);

    }

    public String getVerifyText2() {
        log.info("getVerifyText2" + verifyText2.toString());

        return getTextFromElement(verifyText2);
    }
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }
}
