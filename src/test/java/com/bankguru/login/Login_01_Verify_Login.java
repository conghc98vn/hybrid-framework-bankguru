package com.bankguru.login;

import commons.BaseTest;
import commons.PageGeneratorManager;
import dataConfig.AccountInfo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pageObjects.RegisterAccountPageObject;
import utilities.PropertiesConfig;

public class Login_01_Verify_Login extends BaseTest {
    private WebDriver driver;
    private RegisterAccountPageObject registerAccountPage;
    private LoginPageObject loginPage;
    private AccountInfo accountInfo;
    private PropertiesConfig propertiesConfig;

    @Parameters({"browser", "env"})
    @BeforeClass
    public void beforeClass(String browserName, String envName) {
        accountInfo = AccountInfo.getAccountInfo();
        propertiesConfig = PropertiesConfig.getProperties(envName);
        driver = getBrowserDriver(browserName, propertiesConfig.getUrlRegister());

        registerAccountPage = PageGeneratorManager.getRegisterAccountPage(driver);
        registerAccountPage.registerAndGetAccount(getEmailAddress("test"), accountInfo);

        loginPage = PageGeneratorManager.getLoginPage(driver);
        loginPage.openPageUrl(driver, propertiesConfig.getUrlLogin());
    }

    @Test
    public void Login_01_Username_Is_Blank() {
        loginPage.enterToUsernameIDTextbox("");
        loginPage.enterToPasswordTextbox(accountInfo.getPassword());
        loginPage.clickToLoginButton();
        loginPage.acceptToAlert(driver);
    }

    @Test
    public void Login_02_User_Is_Incorrect() {
        loginPage.enterToUsernameIDTextbox("user_incorrect");
        loginPage.enterToPasswordTextbox(accountInfo.getPassword());
        loginPage.clickToLoginButton();
        loginPage.acceptToAlert(driver);
    }

    @Test
    public void Login_03_Password_Is_Bank() {
        loginPage.enterToUsernameIDTextbox(accountInfo.getUsernameID());
        loginPage.enterToPasswordTextbox("");
        loginPage.clickToLoginButton();
        loginPage.acceptToAlert(driver);
    }

    @Test
    public void Login_04_Password_Is_Incorrect() {
        loginPage.enterToUsernameIDTextbox(accountInfo.getUsernameID());
        loginPage.enterToPasswordTextbox("password_incorrect");
        loginPage.clickToLoginButton();
        loginPage.acceptToAlert(driver);
    }

    @Test
    public void Login_05_Reset_Username_And_Password() {
        loginPage.enterToUsernameIDTextbox(accountInfo.getUsernameID());
        loginPage.enterToPasswordTextbox(accountInfo.getPassword());
        loginPage.clickToResetButton();
        loginPage.acceptToAlert(driver);
    }

    @Test
    public void Login_06_Login_Success() {
        loginPage.enterToUsernameIDTextbox(accountInfo.getUsernameID());
        loginPage.enterToPasswordTextbox(accountInfo.getPassword());
        loginPage.clickToLoginButton();
    }
}
