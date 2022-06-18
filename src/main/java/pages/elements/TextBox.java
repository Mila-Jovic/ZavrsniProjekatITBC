package pages.elements;

import pages.home.BasePage;
import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//@SuperBuilder
@Getter
@Setter

public class TextBox extends BasePage {

    private By fullName = By.id("userName");
    private By emailBar = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitBtn = By.id("submit");
    private By enteredName = By.id("name");


    public TextBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getFullNameBar() {
        return getDriver().findElement(fullName);
    }

    public WebElement getEmailBar() {
        //
        return getDriver().findElement(emailBar);
    }

    /** Method that checks if the text box will accept an invalid e-mail format
     *  field-error class appears when e-mail is invalid**/
    public boolean isEmailAccepted() {
        return getEmailBar().getAttribute("class").contains("field-error");
    }

    public WebElement getCurrentAddress() {
        return getDriver().findElement(currentAddress);
    }

    public WebElement getPermanentAddress() {
        return getDriver().findElement(permanentAddress);
    }

    public WebElement getSubmitBtn() {
        return getDriver().findElement(submitBtn);
    }

    public WebElement getEnteredName() {
        return getDriver().findElement(enteredName);
    }

    /**
     * Method that returns message that contains all the entered information
     **/
    public String getEnteredNameText() {
        return getEnteredName().getText();
    }

    /**
     * Method that clicks submit button of the form
     **/
    public void clickSubmitBtn() {
        getSubmitBtn().click();
    }

    /**
     * Method that enters all provided information in the form
     **/
    public void enterData(String fullName, String email, String currentAddress, String permanentAddress) {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getFullNameBar()));

        getFullNameBar().sendKeys(fullName);
        getEmailBar().sendKeys(email);
        getCurrentAddress().sendKeys(currentAddress);
        getPermanentAddress().sendKeys(permanentAddress);
    }
}
