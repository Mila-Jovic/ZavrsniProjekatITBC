package pages.home;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Getter
@Setter
public class MenuPage extends BasePage {

    private By textBoxOption = By.xpath("//*[@id=\"item-0\"]/span");
    private By checkBoxOption = By.xpath("//*[@id=\"item-1\"]");
    private By radioBtnOption = By.xpath("//*[@id=\"item-2\"]");
    private By webTablesOption = By.xpath("//*[@id=\"item-3\"]");
    private By buttonsOption = By.xpath("//*[@id=\"item-4\"]");
    private By uploadOption = By.xpath("//*[@id=\"item-7\"]");
    private By dropOptions = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[4]");
    private By sliderOptions = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[4]");
    private By alertsOptions = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");


    public MenuPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getAlertsOption() {
        return getDriver().findElement(alertsOptions);
    }


    /**
     * method that clicks on Alerts menu option in Alerts Frames and Windows
     **/
    public void clickAlertsOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getAlertsOption()));
        getAlertsOption().click();
    }


    public WebElement getSliderOption() {
        return getDriver().findElement(sliderOptions);
    }

    /**
     * method that clicks on Slider menu option in Widgets
     **/
    public void clickSliderOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getSliderOption()));
        getSliderOption().click();
    }

    public WebElement getDropOption() {
        return getDriver().findElement(dropOptions);
    }

    /**
     * method that clicks on Droppable menu option in Interactions
     **/
    public void clickDropOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getDropOption()));
        getDropOption().click();
    }

    public WebElement getUploadOption() {
        return getDriver().findElement(uploadOption);
    }

    /**
     * method that clicks on Upload and Download menu option in Elements
     **/
    public void clickUploadOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getUploadOption()));
        getUploadOption().click();
    }

    /**
     * method that mouse clicks on Upload and Download menu option in Elements
     **/
    public void mouseClickUpload() {
        Actions actions = new Actions(getDriver());
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getUploadOption()));
        actions.moveToElement(getUploadOption()).perform();
    }


    public WebElement getButtonsOption() {
        return getDriver().findElement(buttonsOption);
    }

    /**
     * method that clicks on Buttons menu option in Elements
     **/
    public void clickButtonsOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getButtonsOption()));
        getButtonsOption().click();
    }


    public WebElement getWebTablesOption() {
        return getDriver().findElement(webTablesOption);
    }

    /**
     * method that clicks on Web Tables menu option in Elements
     **/
    public void clickWabTablesOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getWebTablesOption()));
        getWebTablesOption().click();
    }


    private WebElement getRadioBox() {
        return getDriver().findElement(radioBtnOption);

    }

    /**
     * method that clicks on Radio Button menu option in Elements
     **/
    public void clickRadioOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getRadioBox()));
        getRadioBox().click();
    }

    private WebElement getCheckBox() {
        return getDriver().findElement(checkBoxOption);

    }

    /**
     * method that clicks on Check Box menu option in Elements
     **/
    public void clickCheckBoxOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getCheckBox()));
        getCheckBox().click();
    }


    public WebElement getTextBoxOption() {
        return getDriver().findElement(textBoxOption);
    }

    /**
     * method that clicks on Text Box menu option in Elements
     **/
    public void clickTextBoxOption() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getTextBoxOption()));
        getTextBoxOption().click();
    }
}
