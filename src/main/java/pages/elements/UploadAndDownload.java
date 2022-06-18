package pages.elements;

import lombok.Setter;
import pages.home.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

@Getter
@Setter
public class UploadAndDownload extends BasePage {
    private By uploadBtn = By.id("uploadFile");
    private By uploadNotification = By.id("uploadedFilePath");


    public UploadAndDownload(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getUploadBtn() {
        return getDriver().findElement(uploadBtn);
    }

    public WebElement getUploadNotification() {
        return getDriver().findElement(uploadNotification);
    }

    public String uploadNotificationText() {
        return getUploadNotification().getText();

    }

    /**
     * Method that checks if upload notification is present
     **/
    public boolean isUploadNotificationDisplayed() {
        return getUploadNotification().isDisplayed();
    }

    /**
     * Method that uploads an image contained in the intelij package folder image
     **/
    public void uploadImage() {
        File image = new File("image/img.jpeg");
        getUploadBtn().sendKeys(image.getAbsolutePath());
    }
}
