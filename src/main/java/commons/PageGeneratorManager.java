package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewCustomerPageObject;
import pageObjects.RegisterAccountPageObject;

public class PageGeneratorManager {
    public static RegisterAccountPageObject getRegisterAccountPage(WebDriver driver) {
        return new RegisterAccountPageObject(driver);
    }
    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }
    public static HomePageObject getHomePage(WebDriver driver){
        return new HomePageObject(driver);
    }
    public static NewCustomerPageObject getNewCustomerPage(WebDriver driver){
        return new NewCustomerPageObject(driver);
    }
}
