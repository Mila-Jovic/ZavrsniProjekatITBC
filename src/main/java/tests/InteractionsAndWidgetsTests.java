package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractionsAndWidgetsTests extends BaseTestPage {

    @Test(priority = 2)
    public void dragAndDropTest() {

        getHomePage().driverGoToInteractions();
        getHomePage().scrollDown();
        getMenuPage().clickDropOption();
        getDroppable().dragAndDrop();

        Assert.assertTrue(getDroppable().isDroppedCorrectly());
    }


    @Test(priority = 4)
    public void sliderToTheRightTest() {

        getHomePage().driverGoToWidgets();
        getHomePage().scrollDown();
        getMenuPage().clickSliderOption();
        getSlider().fullySlideSliderRight();

        Assert.assertEquals(getSlider().sliderAtPercent(), "100");
    }

    @Test(priority = 6)
    public void sliderToTheLeftTest() {

        getHomePage().driverGoToWidgets();
        getHomePage().scrollDown();
        getMenuPage().clickSliderOption();
        getSlider().fullySlideSliderLeft();

        Assert.assertEquals(getSlider().sliderAtPercent(), "0");
    }
}
