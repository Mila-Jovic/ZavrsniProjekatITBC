package pages.elements;

import lombok.Setter;
import pages.home.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@Getter
@Setter
public class WebTables extends BasePage {
    private By addBtn = By.id("addNewRecordButton");
    private By firstNameBar = By.id("firstName");
    private By lastNameBar = By.id("lastName");
    private By emailBar = By.id("userEmail");
    private By ageBar = By.id("age");
    private By salaryBar = By.id("salary");
    private By departmentBar = By.id("department");
    private By submitBtn = By.id("submit");
    private By newTableEntry = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By deleteNewUserBtn = By.id("delete-record-4");
    private By editBtn = By.xpath("//*[@id=\"edit-record-3\"]");


    public WebTables(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public WebElement getEditBtn() {
        return getDriver().findElement(editBtn);
    }

    /**
     * Method that edits entry in the table
     **/
    public void clickEditBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getEditBtn()));
        getEditBtn().click();
    }

    public WebElement getDeleteNewUserBtn() {
        return getDriver().findElement(deleteNewUserBtn);

    }

    /**
     * Method that deletes last entry to the table
     **/
    public void clickDeleteNewUserBtn() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getDeleteNewUserBtn()));
        getDeleteNewUserBtn().click();
    }

    /**
     * Method that searches the table for provided e-mail address
     **/
    public boolean checkIfNewEntryIsInTable(String addedEmail) {
        List<WebElement> emailInTable = getDriver().findElements(By.className("rt-table"));
        for (WebElement i : emailInTable) {
            if (i.getText().contains(addedEmail)) {
                return true;
            }
        }
        return false;
    }

    public WebElement getAddBtn() {
        return getDriver().findElement(addBtn);
    }

    /**
     * Method clicks on the add new entry to the registration form
     **/
    public void clickAddBtn() {
        getAddBtn().click();
    }

    public WebElement getFirstNameBar() {
        return getDriver().findElement(firstNameBar);
    }

    public WebElement getLastNameBar() {
        return getDriver().findElement(lastNameBar);
    }

    public WebElement getEmailBar() {
        return getDriver().findElement(emailBar);
    }

    /**
     * Method clears the email bar
     **/
    public void clearEmailBar() {
        getEmailBar().clear();
    }

    /**
     * Method fills the email bar
     **/
    public void enterEmail(String email) {
        getEmailBar().sendKeys(email);
    }

    public WebElement getAgeBar() {
        return getDriver().findElement(ageBar);
    }

    public WebElement getSalaryBar() {
        return getDriver().findElement(salaryBar);
    }

    public WebElement getDepartmentBar() {
        return getDriver().findElement(departmentBar);
    }

    public WebElement getSubmitBtn() {
        return getDriver().findElement(submitBtn);
    }

    public void clickSubmitBtn() {
        getSubmitBtn().click();
    }

    /**
     * Method that fills in provided data to dorm and submits it to table
     **/
    public void fillInAllData(String firstName, String lastName, String email,
                              String age, String salary, String department) {

        getDriverWait().until(ExpectedConditions.elementToBeClickable(getFirstNameBar()));
        getFirstNameBar().sendKeys(firstName);
        getLastNameBar().sendKeys(lastName);
        getEmailBar().sendKeys(email);
        getAgeBar().sendKeys(age);
        getSalaryBar().sendKeys(salary);
        getDepartmentBar().sendKeys(department);
        clickSubmitBtn();
    }
}
