package pages.home;

import lombok.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;


@Getter
@Setter
public class HomePage extends BasePage {

    private By elements = By.className("card-body");
    private By interactions = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]");
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By artsFramesAndWindows = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By forms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
    private By bookStore = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");


    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public WebElement getBookStore() {
        return getDriver().findElement(bookStore);
    }

    /**
     * method that clicks on Book store App
     **/
    public void clickBookStore() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getBookStore()));
        getBookStore().click();
    }

    public WebElement getForms() {
        return getDriver().findElement(forms);
    }

    /**
     * method that clicks on Forms
     **/
    public void clickForms() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getForms()));
        getForms().click();
    }

    public WebElement getArtsFramesAndWindows() {
        return getDriver().findElement(artsFramesAndWindows);
    }

    /**
     * method that clicks on Arts Frames And Windows
     **/
    public void clickArtsFramesAndWindows() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getWidgets()));
        getArtsFramesAndWindows().click();
    }

    public WebElement getWidgets() {
        return getDriver().findElement(widgets);
    }

    /**
     * method that clicks Widgets
     **/
    public void clickWidgets() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getWidgets()));
        getWidgets().click();
    }

    public WebElement getInteractions() {
        return getDriver().findElement(interactions);
    }

    /**
     * method that clicks on Interactions
     **/
    public void clickInteractions() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getInteractions()));
        getInteractions().click();
    }

    public WebElement getElements() {
        return getDriver().findElement(elements);
    }

    /**
     * method that clicks on Elements
     **/
    public void clickElements() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getElements()));
        getElements().click();
    }

    /**
     * method that mouse clicks on Elements
     **/
    public void mouseClickElements() {
        Actions actions = new Actions(getDriver());
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getElements()));
        actions.moveToElement(getElements()).click().perform();
    }

    /**
     * method that scrolls down
     **/
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,750)", "");
    }

    /**
     * method that scrolls up
     **/
    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,-750)", "");

    }

    /**
     * method that navigates to Home page
     **/
    public void driverGoHome() {
        getDriver().navigate().to("https://demoqa.com/");
    }

    /**
     * method that navigates to Elements option from Home page
     **/
    public void driveGoToElements() {
        driverGoHome();
        scrollDown();
        mouseClickElements();

    }

    /**
     * method that navigates to Interactions option from Home page
     **/
    public void driverGoToInteractions() {
        driverGoHome();
        scrollDown();
        clickInteractions();
    }

    /**
     * method that navigates to Widgets option from Home page
     **/
    public void driverGoToWidgets() {
        driverGoHome();
        scrollDown();
        clickWidgets();
    }

    /**
     * method that navigates toArts Frames And Windows option from Home page
     **/
    public void driverGoToArts() {
        driverGoHome();
        scrollDown();
        clickArtsFramesAndWindows();
    }

}
