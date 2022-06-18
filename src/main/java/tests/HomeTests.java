package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTests extends BaseTestPage {

    @BeforeMethod
    public void beforeMethod() {

        getHomePage().driverGoHome();
        getHomePage().scrollDown();
    }

    @Test(priority = 1)
    public void elementBtnClickTest() {

        getHomePage().mouseClickElements();

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/elements");

    }

    @Test
    public void formsBtnClickTest() {

        getHomePage().clickForms();

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/forms");

    }

    @Test
    public void artsFramesAndWindowsClickableTest() {

        getHomePage().clickArtsFramesAndWindows();

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/alertsWindows");
    }

    @Test
    public void widgetsBtnClickableTest() {

        getHomePage().clickWidgets();

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/widgets");
    }

    @Test
    public void interactionsBtnClickTest() {

        getHomePage().clickInteractions();

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/interaction");
    }
    @Test
    public void bookstoreAppBtnClickableTest (){

        getHomePage().clickBookStore();

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/books");
    }
}
