package ui.registrationTests6;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import ui.BaseTest.BaseTest;

public class RegistrationTests extends BaseTest {

    String nameP = "Имя";
    String surnameP = "Фамилия";
    String emailN = "@gmail.com";
    String passwordN = "199199";
    String numberP = "509768418";
    String emailP = "somethingTest@gmail.com";
    String passwordP = "Something2021";

    @Test
    public void inputEmailNegative() {

        mainPage.openUrl(url);
        logger.info("Link was opened");
        registrationPage.clickSingInButton();
        registrationPage.clickRegistrationButton();
        registrationPage.inputName(nameP);
        registrationPage.inputSurname(surnameP);
        registrationPage.inputEmail(emailN);
        registrationPage.inputNumber(numberP);
        registrationPage.inputPassword(passwordP);
        webDriver.findElement(By.xpath("(//button[contains(text(),'Зарегистрироваться')])[1]")).click();
        Assert.assertEquals(url, webDriver.getCurrentUrl());
    }

    @Test
    public void inputPasswordNegative() {

        mainPage.openUrl("https://rozetka.com.ua/");
        logger.info("Link was opened");
        registrationPage.clickSingInButton();
        registrationPage.clickRegistrationButton();
        registrationPage.inputName(nameP);
        registrationPage.inputSurname(surnameP);
        registrationPage.inputEmail(emailP);
        registrationPage.inputNumber(numberP);
        registrationPage.inputPassword(passwordN);

        webDriver.findElement(By.xpath("(//button[contains(text(),'Зарегстрироваться')])[1]")).isDisplayed();
    }

    // positive tests
    @Test
    public void inputValidDataInRegistrationForm() {
        mainPage.openUrl(url);
        logger.info("Test input valid data InRegistrationForm started");
        registrationPage.clickSingInButton();
        registrationPage.clickRegistrationButton();
        registrationPage.inputName(nameP);
        registrationPage.inputSurname(surnameP);
        registrationPage.inputEmail(emailP);
        registrationPage.inputNumber(numberP);
        registrationPage.inputPassword(passwordP);
        logger.info("data was inputted");
        webDriver.findElement(By.xpath("(//button[contains(text(),'Зарегистрироваться')])[1]")).click();
        logger.info("Submit button was clicked");
        webDriver.findElement(By.xpath("(//button[contains(text(),'Подтвердить')])[1]")).isDisplayed();
    }

}


