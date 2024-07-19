package com.bankguru.newCustomer;

import commons.BaseTest;
import commons.PageGeneratorManager;
import dataConfig.AccountInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewCustomerPageObject;
import pageObjects.RegisterAccountPageObject;
import utilities.PropertiesConfig;

public class NC_01_Verify_Name_Field extends BaseTest {
    private WebDriver driver;
    private AccountInfo accountInfo;
    private PropertiesConfig propertiesConfig;
    private RegisterAccountPageObject registerAccountPage;
    private LoginPageObject loginPage;
    private HomePageObject homePage;
    private NewCustomerPageObject newCustomerPage;


    @Parameters({"browser", "env"})
    @BeforeClass
    public void beforeClass(String browserName, String envName){
        accountInfo = AccountInfo.getAccountInfo();
        propertiesConfig = PropertiesConfig.getProperties(envName);
        driver = getBrowserDriver(browserName, propertiesConfig.getUrlRegister());

        registerAccountPage = PageGeneratorManager.getRegisterAccountPage(driver);
        registerAccountPage.registerAndGetAccount(getEmailAddress("test"), accountInfo);

        loginPage = PageGeneratorManager.getLoginPage(driver);
        loginPage.openPageUrl(driver, propertiesConfig.getUrlLogin());
        homePage = loginPage.loginToHomePage(accountInfo);
        newCustomerPage = homePage.clickToNewCustomerButton();
    }

    @Test
    public void NC_01_Name_Can_Not_Be_Empty(){
//        newCustomerPage.enterToCustomerNameTextbox("");
//        newCustomerPage.pressKeyOnKeyBoard(Keys.TAB);
//        Assert.assertEquals(newCustomerPage.getUsernameErrorMessageText(), "Customer name must not be blank");
//    }
//
//    @Test
//    public void NC_02_Name_Can_Not_Be_Numeric(){
//        newCustomerPage.enterToCustomerNameTextbox("");
//        newCustomerPage.pressKeyOnKeyBoard(Keys.TAB);
//        Assert.assertEquals(newCustomerPage.getUsernameErrorMessageText(), "Numbers are not allowed");
//    }
//
//    @Test
//    public void NC_03_Name_Can_Not_Have_Special_Character(){
//        newCustomerPage.enterToCustomerNameTextbox("");
//        newCustomerPage.pressKeyOnKeyBoard(Keys.TAB);
//        Assert.assertEquals(newCustomerPage.getUsernameErrorMessageText(), "Special characters are not allowed");
//    }
//
//    @Test
//    public void NC_04_Name_Can_Not_Have_First_Character_As_Blank_Space(){
//        newCustomerPage.enterToCustomerNameTextbox("");
//        newCustomerPage.pressKeyOnKeyBoard(Keys.TAB);
//        Assert.assertEquals(newCustomerPage.getUsernameErrorMessageText(), "First character can not have space");
    }

    @BeforeClass
    public void beforeClass(){
        closeBrowserDriver();
    }
}
