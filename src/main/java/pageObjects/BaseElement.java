package pageObjects;

import commons.BasePage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.BaseElementUI;

public class BaseElement extends BasePage {
    WebDriver driver;

    public BaseElement (WebDriver driver) {
        this.driver = driver;
    }


    public NewCustomerPageObject clickToNewCustomerButton() {
        waitForElementClickable(driver, BaseElementUI.NEW_CUSTOMER_BUTTON);
        clickToElement(driver, BaseElementUI.NEW_CUSTOMER_BUTTON);
        return PageGeneratorManager.getNewCustomerPage(driver);
    }


}
