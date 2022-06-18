package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ElementsTests extends BaseTestPage {

    @Test(priority = 1)
    public void fillAFormTest() {
        getHomePage().driveGoToElements();
        getMenuPage().clickTextBoxOption();
        getTextBox().enterData(
                "Mila Jovic"
                , "mila@example.com"
                , "Novi Sad"
                , "Novi Sad");
        getHomePage().scrollDown();
        getTextBox().clickSubmitBtn();

        Assert.assertEquals(getTextBox().getEnteredNameText(), "Name:Mila Jovic");
    }

    @Test(priority = 4)
    public void invalidEmailTest() {
        getHomePage().driveGoToElements();
        getMenuPage().clickTextBoxOption();
        getTextBox().enterData(
                "Mila Jovic"
                , "mila@example"
                , "Novi Sad"
                , "Novi Sad");
        getHomePage().scrollDown();
        getTextBox().clickSubmitBtn();

        Assert.assertTrue(getTextBox().isEmailAccepted());
    }

    @Test(priority = 5)
    public void addUserToTableTest() {

        getHomePage().driveGoToElements();
        getMenuPage().clickWabTablesOption();
        getWebTables().clickAddBtn();
        getWebTables().fillInAllData(
                "Mila"
                , "Jovic"
                , "mila@example.com"
                , "33"
                , "0"
                , "QA");

        Assert.assertTrue(getWebTables().checkIfNewEntryIsInTable("mila@example.com"));
    }

    @Test(dependsOnMethods = {"addUserToTableTest"})
    public void deleteAddedUserFromTable() {

        getWebTables().clickDeleteNewUserBtn();

        Assert.assertFalse(getWebTables().checkIfNewEntryIsInTable("mila@example.com"));
    }

    @Test(priority = 7)
    public void editNewUserTest (){
        getHomePage().driveGoToElements();
        getMenuPage().clickWabTablesOption();
        getWebTables().clickEditBtn();
        getWebTables().clearEmailBar();
        getWebTables().enterEmail("lala@example.com");
        getWebTables().clickSubmitBtn();
        Assert.assertTrue(getWebTables().checkIfNewEntryIsInTable("lala@example.com"));
    }

    @Test(priority = 10)
    public void checkBoxTest() {

        getHomePage().driveGoToElements();
        getMenuPage().clickCheckBoxOption();
        getCheckBox().clickHomeCheckBox();

        Assert.assertTrue(getCheckBox().getNotificationText().contains("home"));
    }

    @Test(priority = 11)
    public void checkBoxOneSelectedTest() {

        getHomePage().driveGoToElements();
        getMenuPage().clickCheckBoxOption();
        getCheckBox().clickExpandCheckBox();
        getCheckBox().clickDocumentBox();

        Assert.assertTrue(getCheckBox().getNotificationText().contains("documents")
                && getCheckBox().isDesktopCheckBoxUnselected()
                && getCheckBox().isDownloadCheckBoxUnselected());
    }

    @Test(priority = 15)
    public void noRadioBtnTest() {

        getHomePage().driveGoToElements();
        getMenuPage().clickRadioOption();

        Assert.assertFalse(getRadioButton().isNoRadioBtnEnabled());
    }

    @Test(dependsOnMethods = {"noRadioBtnTest"})
    private void yesRadioBtnTest() {

        getRadioButton().clickYesRadioBtn();

        Assert.assertTrue(getRadioButton().getRadioNotificationText().contains("Yes")
                && !getRadioButton().isImpressiveSelected());
    }

    @Test(dependsOnMethods = {"noRadioBtnTest"})
    public void impressiveRadioBtnTest() {

        getRadioButton().clickImpressiveRadioBtn();

        Assert.assertTrue(getRadioButton().getRadioNotificationText().contains("Impressive")
                && !getRadioButton().isYesSelected());
    }

    @Test(priority = 20)
    public void doubleClickTest() {

        getHomePage().driveGoToElements();
        getHomePage().scrollDown();
        getMenuPage().clickButtonsOption();
        getButtons().mouseDoubleClick();

        Assert.assertTrue(getButtons().doubleClickNotificationText().contains("double click"));
    }

    @Test(dependsOnMethods = {"doubleClickTest"})
    public void rightClickTest() {

        getButtons().mouseRightClick();

        Assert.assertTrue(getButtons().rightNotificationText().contains("right click"));
    }

    @Test(dependsOnMethods = {"doubleClickTest"})
    public void dynamicClickTest() {

        getButtons().mouseClickMeBtn();

        Assert.assertTrue(getButtons().clickMeNotificationText().contains("dynamic click"));
    }

    @Test(priority = 25)
    public void uploadFileTest() {

        getHomePage().driveGoToElements();
        getHomePage().scrollDown();
        getMenuPage().clickUploadOption();
        getUploadAndDownload().uploadImage();

        Assert.assertTrue(getUploadAndDownload().isUploadNotificationDisplayed()
                && getUploadAndDownload().uploadNotificationText().contains("img.jpeg"));
    }

}
