package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTestPage {

    @BeforeMethod
    public void beforeM() {

        getHomePage().driverGoToArts();
        getHomePage().scrollDown();
        getMenuPage().clickAlertsOption();
        getHomePage().scrollUp();
    }

    @Test(priority = 1)
    public void verifyThatAlertPopUpsAfterClick() {

        getAlertsPage().clickAlertBtn();

        Assert.assertEquals(getAlertsPage().getAlertText(), "You clicked a button");
        getAlertsPage().closeAlert();
    }

    @Test(priority = 2)
    public void verifyThatConfirmBoxWorks() {

        getAlertsPage().clickConformationAlertBtn();

        Assert.assertEquals(getAlertsPage().getAlertText(), "Do you confirm action?");
        getAlertsPage().closeAlert();
        Assert.assertTrue(getAlertsPage().confirmAlertNotificationText().contains("Ok"));
    }

    @Test(priority = 3)
    public void verifyThatPromptBoxWorks() {

        getAlertsPage().promptButtonAlertClick();
        Assert.assertEquals(getAlertsPage().getAlertText(), "Please enter your name");
        getAlertsPage().alertSendKeys("Mila");
        getAlertsPage().closeAlert();
        Assert.assertEquals(getAlertsPage().promptNotificationText(), "You entered Mila");
    }

    @Test(priority = 4)
    public void verifyThatAlertPopUpsAfterFiveSeconds() {

        getAlertsPage().clickAlertDelayBtn();

        Assert.assertTrue(getAlertsPage().getAlertText().contains("alert appeared after 5 seconds"));
        getAlertsPage().closeAlert();
    }
}
