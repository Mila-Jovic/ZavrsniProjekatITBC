package pages.elements;

import lombok.Setter;
import pages.home.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
@Setter
public class Buttons extends BasePage {
    //private By doubleClickBtn = By.id("//*[text()='Double Click Me'");
    private By doubleClickBtn = By.id("doubleClickBtn");
    private By rightClickBtn = By.id("rightClickBtn");
    private By clickMeBtn = By.xpath("//*[text()='Click Me']");
    //for some inexplicable reason the clickMeBtn changes ids ¯\_(ツ)_/¯

    private By doubleClickNotification = By.id("doubleClickMessage");
    private By rightClickNotification = By.id("rightClickMessage");
    private By clickMeNotification = By.id("dynamicClickMessage");
    private Actions actions = new Actions(getDriver());


    public Buttons(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getDoubleClickBtn() {
        return getDriver().findElement(doubleClickBtn);
    }

    /**
     * Method that mouse double-clicks the double click button
     **/
    public void mouseDoubleClick() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getDoubleClickBtn()));
        actions.doubleClick(getDoubleClickBtn()).click().perform();
    }

    public WebElement getDoubleClickNotification() {
        return getDriver().findElement(doubleClickNotification);
    }

    /**
     * Method that gets the notification text after double click
     **/
    public String doubleClickNotificationText() {
        return getDoubleClickNotification().getText();
    }


    public WebElement getRightClickBtn() {
        return getDriver().findElement(rightClickBtn);
    }

    /**
     * Method that mouse right-clicks the right click button
     **/
    public void mouseRightClick() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getRightClickBtn()));
        actions.contextClick(getRightClickBtn()).perform();
    }

    public WebElement getRightClickNotification() {
        return getDriver().findElement(rightClickNotification);
    }

    /**
     * Method that gets the notification text after right click
     **/
    public String rightNotificationText() {
        return getRightClickNotification().getText();
    }


    public WebElement getClickMeBtn() {
        return getDriver().findElement(clickMeBtn);
    }

    /**
     * Method that mouse clicks the click button
     **/
    public void mouseClickMeBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getClickMeBtn()));
        actions.moveToElement(getClickMeBtn()).click().perform();
    }

    public WebElement getClickMeNotification() {
        return getDriver().findElement(clickMeNotification);
    }

    /**
     * Method that gets the notification text after click
     **/
    public String clickMeNotificationText() {
        return getClickMeNotification().getText();
    }

}

