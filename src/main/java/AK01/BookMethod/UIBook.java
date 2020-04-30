package AK01.BookMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIBook {
    static By emailFiled = By.xpath("//input[@id=\"email-field-1\"]");
    static By phoneField = By.xpath("//div[@class=\"PhoneInput\"]//input[@type=\"tel\"]");
    static By docNumField = By.xpath("//div[contains(@class,\"document_number\")]//input");
    static By lastNameField = By.xpath("//div[contains(@class,\"lastname\")]//input");
    static By firstNameField = By.xpath("//div[contains(@class,\"firstname\")]//input");
    static By birthDateField = By.xpath("//div[contains(@class,\"DateInput\")]//input");
    static By maleButton = By.xpath("//div[@gender=\"M\"]");
    static By femaleButton = By.xpath("//div[@gender=\"W\"]");
    static By confirmCheckBox = By.xpath("//div[@class=\"BookingForm__Confirmation\"]//input[@type=\"checkbox\"]");
    static By bookButton = By.xpath("//span[contains(text(),\"Бронировать\")]");
    private WebDriver driver;
    public WebDriverWait wait;

    public UIBook (WebDriver driver) {        this.driver = driver;    }

    public UIBook emailType(String email) {
        driver.findElement(emailFiled).sendKeys(email);
        return this;
    }

    public UIBook phoneType(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }
    public UIBook docNumType(String docNum) {
        driver.findElement(docNumField).sendKeys(docNum);
        return this;
    }
    public UIBook lastNameType (String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }
    public UIBook firstNameType (String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }

    public UIBook birthDateType (String birthDate) {
        driver.findElement(birthDateField).sendKeys(birthDate);
        return this;
    }
    public UIBook maleClick() {
        driver.findElement(maleButton).click();
        return this;
    }
    public UIBook ConfirmClick() {
        driver.findElement(confirmCheckBox).click();
        return  this;
    }
    public UIBook submitBook() {
        driver.findElement(bookButton).click();
        return this;
    }
    public UIBook realBook(String email, String phone, String docNum, String lastName, String firstName, String birthDate) {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"Card\"]")));
        this.emailType(email);
        this.phoneType(phone);
        this.docNumType(docNum);
        this.lastNameType(lastName);
        this.firstNameType(firstName);
        this.birthDateType(birthDate);
        this.maleClick();
        this.ConfirmClick();
//        this.submitBook();
        return new UIBook(driver);
    }


}
