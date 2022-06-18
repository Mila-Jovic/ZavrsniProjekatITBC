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
public class CheckBox extends BasePage {

    private By homeCheckBox = By.className("rct-title");
    private By checkBoxExpand = By.className("rct-collapse-btn");
    private By desktopCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]");
    private By documentsCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[3]");
    private By downloadCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]");
    private By notification = By.xpath("//*[@id=\"result\"]");


    public CheckBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getDownloadCheckBox() {
        return getDriver().findElement(downloadCheckBox);
    }

    /**
     * Method that clicks and checks Download check box
     **/
    public void clickDownloadCheckBox() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getDownloadCheckBox()));
        getDownloadCheckBox().click();
    }

    /**
     * Method that checks whether the download check box is checked
     **/
    public boolean isDownloadCheckBoxUnselected() {
        //rct-icon-check class appears when check box is selected
        return getDownloadCheckBox().findElement(By.tagName("svg")).getAttribute("class").contains("rct-icon-uncheck");
    }

    public WebElement getDocumentBox() {
        return getDriver().findElement(documentsCheckBox);
    }

    /**
     * Method that clicks and checks Document check box
     **/
    public void clickDocumentBox() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getDocumentBox()));
        getDocumentBox().click();
    }

    /**
     * Method that checks whether the Documents check box is checked
     **/
    public boolean isDocumentCheckBoxUnselected() {
        return getDocumentBox().getAttribute("class").contains("rct-icon-uncheck");
    }

    public WebElement getHomeCheckBox() {
        return getDriver().findElement(homeCheckBox);
    }

    /**
     * Method that clicks and checks Home check box
     **/
    public void clickHomeCheckBox() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getHomeCheckBox()));
        getHomeCheckBox().click();
    }

    public WebElement getDesktopCheckBox() {
        return getDriver().findElement(desktopCheckBox);
    }

    /**
     * Method that clicks and checks Desktop check box
     **/
    public void clickDesktopCheckBox() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getDesktopCheckBox()));
        getDesktopCheckBox().click();
    }

    /**
     * Method that checks whether the Desktop check box is checked
     **/
    public boolean isDesktopCheckBoxUnselected() {
        return getDesktopCheckBox().findElement(By.tagName("svg")).getAttribute("class").contains("rct-icon-uncheck");
    }


    public WebElement getExpandCheckBox() {
        return getDriver().findElement(checkBoxExpand);
    }

    /**
     * Method that clicks and exoands check box options
     **/
    public void clickExpandCheckBox() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getExpandCheckBox()));
        getExpandCheckBox().click();
    }

    public WebElement getNotification() {
        return getDriver().findElement(notification);
    }

    /**
     * Method that gets notification text after checking boxes
     **/
    public String getNotificationText() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(notification));
        return getNotification().getText();
    }
}

