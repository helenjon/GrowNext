package com.epam.grownext.webbrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.epam.grownext.test.utilities.ReadPropertyFile;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.*;

public class WebBrowser {

    public static WebDriverWait waitHere;

    protected static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (webdriver.get()==null){
            initializationWebDriver();
        }
        return webdriver.get();
    }

    public static void quitDriver() {
        webdriver.get().quit();
        /** driver = null */
        webdriver.remove();
    }

    private static void initializationWebDriver() {
        Properties properties = ReadPropertyFile.getProperties();
        String driverName = properties.getProperty("browser");
        initBrowser(driverName);
        /** Perform Basic Operations  */
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Integer.parseInt(properties.getProperty("implicitlyWait")), TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(Integer.parseInt(properties.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
        waitHere = new WebDriverWait(getDriver(), Integer.parseInt(properties.getProperty("wait")));
    }

    public static void waitForElementToBeVisible(WebElement element) {
        waitHere.until(ExpectedConditions.visibilityOf(element));
    }

    private static void initBrowser(String driverName) {
        if (webdriver.get() == null) {
            WebDriver driver;
            switch (driverName) {
                case "chrome":
                    WebDriverManager.getInstance(CHROME).setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.getInstance(FIREFOX).setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.getInstance(IEXPLORER).setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "edge":
                    WebDriverManager.getInstance(EDGE).setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Driver '%s' is not found", driverName));
            }
            webdriver.set(driver);
        }
    }
}
