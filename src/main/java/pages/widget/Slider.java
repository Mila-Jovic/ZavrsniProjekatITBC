package pages.widget;

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
public class Slider extends BasePage {
    private Actions actions = new Actions(getDriver());
    private By slider = By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input");
    private By sliderValue = By.id("sliderValue");


    public Slider(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getSliderValue() {

        return getDriver().findElement(sliderValue);
    }

    public WebElement getSlider() {

        return getDriver().findElement(slider);
    }

    public void fullySlideSliderRight() {
        actions.dragAndDropBy(getSlider(), 253, 0).perform();
    }

    public String sliderAtPercent() {
        return getSliderValue().getAttribute("value");
    }

    public void fullySlideSliderLeft() {
        actions.dragAndDropBy(getSlider(), -253, 0).perform();
    }
}
