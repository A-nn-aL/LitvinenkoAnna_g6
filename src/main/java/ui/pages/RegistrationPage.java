package ui.pages;

import libs.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends MainPage {

    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    //    @FindBy(xpath = "(//*[name()='svg'][@aria-hidden='true'])[19]")
//    WebElement registrationJoinButton =
//
//
//    WebElements webElements;


    public void clickRegistrationButton() {
        webDriver.findElement(By.xpath("(//a[contains(text(),'Зарегистрироваться')])[1]")).click();
    }

//    @FindBy(xpath = "(//input[@id='registerUserName'])[1]")
//    WebElement nameElement;

    public void inputName(String name) {
//        webElements.inputText(nameElement, name);
        webDriver.findElement(By.xpath("(//input[@id='registerUserName'])[1]")).sendKeys(name);
    }

//    WebElement surnameElement = webDriver.findElement(By.xpath("(//input[@id='registerUserSurname'])[1]"));;
    public void inputSurname(String surname) {
        webDriver.findElement(By.xpath("(//input[@id='registerUserSurname'])[1]")).sendKeys(surname);

    }
    public void inputNumber(String number) {
        webDriver.findElement(By.xpath("(//input[@id='registerUserPhone'])[1]")).sendKeys(number);

    }
    public void inputEmail(String email) {
        webDriver.findElement(By.xpath("(//input[@id='registerUserEmail'])[1]")).sendKeys(email);

    }
    public void inputPassword(String password) {
        webDriver.findElement(By.xpath("(//input[@id='registerUserPassword'])[1]")).sendKeys(password);

    }
}
