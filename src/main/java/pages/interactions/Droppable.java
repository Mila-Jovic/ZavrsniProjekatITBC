package pages.interactions;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.home.BasePage;

@Getter
@Setter
public class Droppable extends BasePage {


    private By dragMeBtn = By.id("draggable");
    private By dropInMeBtn = By.id("droppable");
    private By frame = By.id("simpleDropContainer");

    public Droppable(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getFrame() {
        return getDriver().findElement(frame);
    }

    public WebElement getDragMeBtn() {
        return getDriver().findElement(dragMeBtn);
    }


    public WebElement getDropInMeBtn() {
        return getDriver().findElement(dropInMeBtn);
    }

    public void dragAndDrop() {
        //  getDriver().switchTo().frame(getFrame());
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(getDragMeBtn(), getDropInMeBtn()).build().perform();
    }

    public boolean isDroppedCorrectly() {
        return getDropInMeBtn().getAttribute("class").contains("ui-state-highlight");

    }
}
