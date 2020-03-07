package webbrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.utilities.ReadPropertyFile;

import javax.annotation.Nonnull;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.DriverManagerType.EDGE;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;
import static io.github.bonigarcia.wdm.DriverManagerType.IEXPLORER;

public class WebBrowser {

    public static WebDriverWait waitHere;
    private static WebDriver driver;
    private static String currentDriverName;

    public static WebDriver getDriver() {
        return driver;
    }
    public static void quitDriver(){
        driver.quit();
        driver = null;}

    public static void initializationWebDriver() {
        Properties properties = ReadPropertyFile.getProperties();
        String driverName = properties.getProperty("browser");
        initBrowser(driverName);
        //Perform Basic Operations
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(properties.getProperty("implicitlyWait")), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(properties.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
        waitHere = new WebDriverWait(driver, Integer.parseInt(properties.getProperty("wait")));
    }

    public static void waitForElementToBeVisible(WebElement element) {
        waitHere.until(ExpectedConditions.visibilityOf(element));
    }

//    public static synchronized WebDriver getInstance(@Nonnull String driverName){
//        if (driver == null ||  (!driverName.equalsIgnoreCase(currentDriverName)) ){
//                currentDriverName = driverName;
//                initBrowser(currentDriverName);
//        }
//        return driver;
//    }

    private static void initBrowser(String driverName) {
        if (driver == null) {
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
        }
    }
}
