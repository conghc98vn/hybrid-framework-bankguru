package pageObjects;

import commons.PageGeneratorManager;
import dataConfig.AccountInfo;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class LoginPageObject extends BaseElement {
    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterToUsernameIDTextbox(String usernameValue) {
        waitForElementVisible(driver, LoginPageUI.USERID_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.USERID_TEXTBOX, usernameValue);
    }

    public void enterToPasswordTextbox(String passwordValue) {
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passwordValue);
    }

    public void clickToLoginButton() {
        waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    }

    public void clickToResetButton() {
        waitForElementClickable(driver, LoginPageUI.RESET_BUTTON);
        clickToElement(driver, LoginPageUI.RESET_BUTTON);
    }

    public HomePageObject loginToHomePage(AccountInfo accountInfo) {
        enterToUsernameIDTextbox(accountInfo.getUsernameID());
        enterToPasswordTextbox(accountInfo.getPassword());
        clickToLoginButton();
        return PageGeneratorManager.getHomePage(driver);
    }
}
