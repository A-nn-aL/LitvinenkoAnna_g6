package libs;

import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebElements {
    WebDriver webDriver;
    Logger logger;

    public WebElements(WebDriver webdriver){
        this.webDriver = webdriver;
        logger = Logger.getLogger(getClass());
    }

    public void inputText(WebElement element, String text){
        try{
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was inputted");
        } catch (Exception e){
            logger.error("Can't work wit element " + element);
            Assert.fail("Can't work with element " + element);

        }
    }

    public void clickOnElement(WebElement element){
        try{
            element.click();
            logger.info("Element was clicked: " + element);
        } catch (Exception e){
            logger.error("Can't work wit element " + element);
            Assert.fail("Can't work with element " + element);

        }

    }

    public boolean isElementPresent(String text) {
        try {
            return webDriver.findElement(By.xpath(text)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
