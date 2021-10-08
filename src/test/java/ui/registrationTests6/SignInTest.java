package ui.registrationTests6;

import org.junit.Test;
import org.openqa.selenium.By;
import ui.BaseTest.BaseTest;

public class SignInTest extends BaseTest {

    public String numberP2 = "380674188301";

    @Test
    public void inputInvalidNumberInSignInForm() {
        mainPage.openUrl(url);
        logger.info("Test inputInvalidNumberInSignInForm started");
        signInPage.clickSingInButton();
        webDriver.findElement(By.xpath("(//input[@id='auth_email'])[1]")).sendKeys(numberP2);
        webDriver.findElement(By.xpath("(//a[contains(text(),'Напомнить пароль')])[1]")).click();
        webDriver.findElement(By.xpath("(//button[contains(text(),'Получить временный пароль')])[1]")).click();
        webDriver.findElement(By.xpath("(//div[@class='error-message error-message_type_tooltip ng-star-inserted'])[1]")).isDisplayed();
    }
}
