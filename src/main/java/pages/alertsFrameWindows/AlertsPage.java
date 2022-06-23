package pages.alertsFrameWindows;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

@Getter
@Setter
public class AlertsPage extends BasePage {

    private By alertBtn = By.id("alertButton");
    private By alertDelayBtn = By.id("timerAlertButton");
    private By confirmAlertBtn = By.id("confirmButton");
    private By confirmAlertNotification = By.id("confirmResult");
    private By promtBtnAlert = By.id("promtButton");
    private By promptNotification = By.id("promptResult");

    public AlertsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public WebElement getAlertBtn() {
        return getDriver().findElement(alertBtn);
    }

    /**
     * Method that clicks Button to see alert
     * Pop-up alert text: You clicked a button
     **/
    public void clickAlertBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getAlertBtn()));
        getAlertBtn().click();
    }

    public WebElement getAlertDelayBtn() {
        return getDriver().findElement(alertDelayBtn);
    }

    /**
     * Method that clicks on button to see alert after 5 seconds
     * Pop-up alert text: This alert appeared after 5 seconds
     **/
    public void clickAlertDelayBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getAlertDelayBtn()));
        getAlertDelayBtn().click();
    }

    public WebElement getConfirmAlertBtn() {
        return getDriver().findElement(confirmAlertBtn);
    }

    /**
     * Method that clicks on button to see a confirm box
     * Pop-up alert text: Do you confirm action?
     **/
    public void clickConformationAlertBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getConfirmAlertBtn()));
        getConfirmAlertBtn().click();
    }

    public WebElement getPromptNotification() {
        return getDriver().findElement(promptNotification);
    }

    /**
     * Method that gets prompt box notification text that appears after we enter text in to prompt alert pop-up
     **/
    public String promptNotificationText() {
        getDriverWait().until(ExpectedConditions.presenceOfElementLocated(promptNotification));
        return getPromptNotification().getText();
    }

    public WebElement getConfirmAlertNotification() {
        return getDriver().findElement(confirmAlertNotification);
    }

    /**
     * Method that gets confirm box notification text that appears after we click on confirm alert
     **/
    public String confirmAlertNotificationText() {
        return getConfirmAlertNotification().getText();
    }


    public WebElement getPromtBtnAlert() {
        return getDriver().findElement(promtBtnAlert);
    }

    /**
     * Method that clicks on button to see a prompt box
     * Pop-up alert text: Please enter your name
     **/
    public void promptButtonAlertClick() {
        getPromtBtnAlert().click();
    }

    /**
     * Method that enters text in to Prompt Alert pop-up
     **/
    public void alertSendKeys(String sendKeys) {
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().sendKeys(sendKeys);
    }

    /**
     * Method that shows alert pop-up text
     **/
    public String getAlertText() {
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        return getDriver().switchTo().alert().getText();
    }
    /**
     * Method that closes pop-up  alert
     **/
    public void closeAlert() {
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
    }
}


