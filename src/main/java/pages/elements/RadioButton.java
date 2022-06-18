package pages.elements;

import lombok.Getter;
import lombok.Setter;
import pages.home.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
@Setter
public class RadioButton extends BasePage {

    private By noRadioBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]");
    private By yesRadioBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By impressiveRadioBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By radioNotification = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");

    public RadioButton(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getNoRadioBtn() {
        return getDriver().findElement(noRadioBtn);
    }

    public WebElement getYesRadioBtn() {
        return getDriver().findElement(yesRadioBtn);
    }

    /**
     * Method that clicks yes radio button
     **/
    public void clickYesRadioBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getYesRadioBtn()));
        getYesRadioBtn().click();
    }

    /**
     * Method that checks if yes radio button is selected
     **/
    public boolean isYesSelected() {
        return getYesRadioBtn().isSelected();
    }

    public WebElement getRadioNotification() {
        return getDriver().findElement(radioNotification);
    }

    /**
     * Method that gets the notification text after a radio button was selected
     **/
    public String getRadioNotificationText() {
        return getRadioNotification().getText();
    }

    /**
     * Method that checks if No radio button is enabled
     **/
    public boolean isNoRadioBtnEnabled() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(noRadioBtn));
        return !getNoRadioBtn().isEnabled();
    }

    public WebElement getImpressiveRadioBtn() {
        return getDriver().findElement(impressiveRadioBtn);
    }

    /**
     * Method that clicks Impressive radio button
     **/
    public void clickImpressiveRadioBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getImpressiveRadioBtn()));
        getImpressiveRadioBtn().click();
    }

    /**
     * Method that checks if Impressive radio button is selected
     **/
    public boolean isImpressiveSelected() {
        return getImpressiveRadioBtn().isSelected();
    }
}
