package ui.BaseTest;

import libs.WebElements;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.pages.MainPage;
import ui.pages.RegistrationPage;
import ui.pages.SingInPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver webDriver;
    public Logger logger = Logger.getLogger(getClass());
    public WebElements webElement;

    public MainPage mainPage;
    public RegistrationPage registrationPage;
    public SingInPage signInPage;

    public String url = "https://rozetka.com.ua/";

    @Before
    public void setUp() {
        logger = Logger.getLogger(getClass());
        File fileChromeDriver = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        webDriver = new ChromeDriver();
        webElement = new WebElements(webDriver);
        logger.info("Get chromeDriver");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("browser was opened");
        initPages();

    }

    public void initPages(){
        mainPage = new MainPage(webDriver);
        registrationPage = new RegistrationPage(webDriver);
        signInPage = new SingInPage(webDriver);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

}
