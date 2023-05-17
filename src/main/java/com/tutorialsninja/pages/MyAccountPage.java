package com.tutorialsninja.pages;

import com.tutorialsninja.browserfactory.ManageBrowser;
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

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement varifyRegister;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement varifyReturning;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement enterEmail;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement enterPhone;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement enterPass;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPass;
    @CacheLookup
    @FindBy(xpath = "//input[@name='newsletter']")
    WebElement newsLetter;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicy;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement varifymessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement varifLogout;
    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginButton;

    public void clickonMyAccount() {
        log.info("clickonMyAccount" + myAccount.toString());
        clickOnElement(myAccount);
    }

    public String getVerifyRegister() {
        log.info("getVerifyRegister" + varifyRegister.toString());
        return getTextFromElement(varifyRegister);
    }

    public String getVerifyReturning() {
        log.info("getVerifyReturning" + varifyReturning.toString());
        return getTextFromElement(varifyReturning);
    }

    public void enterFirstName(String name) {
        log.info("enterFirstName" + firstName.toString());
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String lastname) {
        log.info("enterLastName" + lastName.toString());
        sendTextToElement(lastName, lastname);
    }

    public void enterEmailAdd(String email) {
        log.info("enterEmailAdd" + enterEmail.toString());
        sendTextToElement(enterEmail, email);
    }

    public void enterPhone(String phone) {
        log.info("enterPhone" + enterPhone.toString());
        sendTextToElement(enterPhone, phone);
    }

    public void enterPassword(String phone) {
        log.info("enterPassword" + enterPass.toString());
        sendTextToElement(enterPass, phone);
    }

    public void enterConfirmPass(String phone) {
        log.info("enterConfirmPass" + confirmPass.toString());
        sendTextToElement(confirmPass, phone);
    }

    public void clickYesonNewsLetter() {
        log.info("clickYesonNewsLetter" + newsLetter.toString());
        clickOnElement(newsLetter);
    }

    public void clickOnPrivacy() {
        log.info("clickOnPrivacy" + privacyPolicy.toString());
        clickOnElement(privacyPolicy);
    }

    public void clickFinalContinue() {
        log.info("clickFinalContinue" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    public String getVerifyMessage() {
        log.info("getVerifyMessage" + varifymessage.toString());
        return getTextFromElement(varifymessage);
    }

    public void clickOnContinueButton() {
        log.info("clickOnContinueButton" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnMyAccountTab() {
        log.info("clickOnMyAccountTab" + myAccountTab.toString());
        clickOnElement(myAccountTab);
    }

    public String getVerifyLogout() {
        log.info("getVerifyLogout" + varifLogout.toString());
        return getTextFromElement(varifLogout);
    }

    By continueButtonTab = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnContinueTab() {
        log.info("clickOnContinueTab" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnLogin() {
        log.info("clickOnLogin" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = ManageBrowser.driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = ManageBrowser.driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }
}
