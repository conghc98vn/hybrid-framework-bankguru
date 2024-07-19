package com.bankguru.register;

import commons.BaseTest;
import commons.PageGeneratorManager;
import dataConfig.AccountInfo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.RegisterAccountPageObject;
import utilities.PropertiesConfig;

public class Register_01_GetAccount extends BaseTest {
    private WebDriver driver;

    private PropertiesConfig propertiesConfig;
    private RegisterAccountPageObject registerAccountPage;
    private AccountInfo accountInfo;

    @Parameters({"browser","env"})
    @BeforeClass
    public void beforeClass(String browserName, String envName){
        propertiesConfig = PropertiesConfig.getProperties(envName);
        driver = getBrowserDriver(browserName, propertiesConfig.getUrlRegister());

        registerAccountPage = PageGeneratorManager.getRegisterAccountPage(driver);
    }

    @Test
    public void GetAccount_01_Register_And_Get_Account(){
        registerAccountPage.enterToEmailIDTextbox("test@gmail.com"); //add mail random
        registerAccountPage.clickToSubmitButton();

        accountInfo.setUsernameID(registerAccountPage.getUsernameIDText());
        accountInfo.setPassword(registerAccountPage.getPasswordText());
    }
}
