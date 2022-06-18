package tests;


import org.testng.annotations.AfterClass;
import pages.alertsFrameWindows.AlertsPage;
import pages.elements.*;
import lombok.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import pages.home.HomePage;
import pages.home.MenuPage;
import pages.interactions.Droppable;
import pages.widget.Slider;

import java.time.Duration;


@Getter
public abstract class BaseTestPage {

    private WebDriver driver;
    private WebDriverWait driverWait;

    private HomePage homePage;
    private MenuPage menuPage;
    private TextBox textBox;
    private WebTables webTables;
    private CheckBox checkBox;
    private Buttons buttons;
    private RadioButton radioButton;
    private UploadAndDownload uploadAndDownload;
    private Slider slider;
    private Droppable droppable;
    private AlertsPage alertsPage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mila-\\Desktop\\EXE file\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        homePage = new HomePage(driver, driverWait);
        menuPage = new MenuPage(driver, driverWait);
        textBox = new TextBox(driver, driverWait);
        webTables = new WebTables(driver, driverWait);
        checkBox = new CheckBox(driver, driverWait);
        buttons = new Buttons(driver, driverWait);
        radioButton = new RadioButton(driver, driverWait);
        uploadAndDownload = new UploadAndDownload(driver, driverWait);
        slider = new Slider(driver,driverWait);
        droppable = new Droppable(driver, driverWait);
        alertsPage = new AlertsPage(driver, driverWait);

        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
