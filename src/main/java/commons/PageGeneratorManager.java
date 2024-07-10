package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.RegisterAccountPageObject;

public class PageGeneratorManager {
    public RegisterAccountPageObject getRegisterAccountPage(WebDriver driver) {
        return new RegisterAccountPageObject(driver);
    }
}
