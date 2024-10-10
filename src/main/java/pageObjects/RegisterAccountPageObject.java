package pageObjects;

import dataConfig.AccountInfo;
import org.openqa.selenium.WebDriver;
import pageUIs.RegisterAccountPageUI;

public class RegisterAccountPageObject extends BaseElement {
    WebDriver driver;

    public RegisterAccountPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterToEmailIDTextbox(String emailValue) {
        waitForElementVisible(driver, RegisterAccountPageUI.EMAIL_ID_TEXTBOX);
        sendKeyToElement(driver, RegisterAccountPageUI.EMAIL_ID_TEXTBOX, emailValue);
    }

    public void clickToSubmitButton() {
        waitForElementClickable(driver, RegisterAccountPageUI.SUBMIT_BUTTON);
        clickToElement(driver, RegisterAccountPageUI.SUBMIT_BUTTON);
    }

    public String getUsernameIDText() {
        waitForElementVisible(driver, RegisterAccountPageUI.USERNAME_ID_LABEL);
        return getElementText(driver, RegisterAccountPageUI.USERNAME_ID_LABEL);
    }

    public String getPasswordText() {
        waitForElementVisible(driver, RegisterAccountPageUI.PASSWORD_LABEL);
        return getElementText(driver, RegisterAccountPageUI.PASSWORD_LABEL);
    }

    public void registerAndGetAccount(String emailValue, AccountInfo accountInfo) {
        enterToEmailIDTextbox(emailValue);
        clickToSubmitButton();
        accountInfo.setUsernameID(getUsernameIDText());
        accountInfo.setPassword(getPasswordText());
    }
}
