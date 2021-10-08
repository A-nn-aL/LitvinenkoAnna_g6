package ui.pages;

import libs.WebElements;
import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    WebDriver webDriver;
    Logger logger;
    WebElements webElements;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webElements = new WebElements(webDriver);
    }
    public void openUrl(String url) {
        try {
            webDriver.get(url);
            logger.info("Page was opened " + url);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Page can't opened " + url);
            Assert.fail("Page can't opened " + url);
        }
    }
    public void clickSingInButton() {
        webDriver.findElement(By.xpath("(//*[name()='svg'][@aria-hidden='true'])[19]")).click();
    }
}
