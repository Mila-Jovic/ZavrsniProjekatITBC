package pages.home;

import lombok.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

//
//@SuperBuilder
@Getter
@AllArgsConstructor
@Setter

public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;


}
