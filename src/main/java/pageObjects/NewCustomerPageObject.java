package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class NewCustomerPageObject extends BaseElement {
    WebDriver driver;

    public NewCustomerPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    public void enterToCustomerNameTextbox(String s) {
    }

    public void clickToGenderRadioButton(String s) {
    }

    public void enterDateOfBirthTextbox(String s) {
    }

    public void enterToAddressTextarea(String s) {
    }

    public void enterToCityTextbox(String s) {
    }

    public void enterToStateTextbox(String s) {
    }

    public void enterToPINTextbox(String s) {
    }

    public void enterToMobileNumberTextbox(String s) {
    }

    public void enterToEmailTextbox(String s) {
    }

    public void enterToPasswordTextbox(String s) {
    }
}
