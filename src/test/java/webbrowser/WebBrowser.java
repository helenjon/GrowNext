package webbrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.utilities.ReadPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.*;

public class WebBrowser {

 //   public static Properties properties;
    public static WebDriverWait wait;
    private String driverName;
    private Properties properties;
    public static WebDriver driver;

    public WebBrowser(){
        properties = ReadPropertyFile.getProperties();
        initializationWebDriver();
    }

    public void initializationWebDriver()  {
        driverName = properties.getProperty("browser");
        if(driver == null)
        {
            if(driverName.equalsIgnoreCase("chrome"))
            {
                WebDriverManager.getInstance(CHROME).setup();
                driver=new ChromeDriver();
            }
            else if(driverName.equalsIgnoreCase("firefox"))
            {
                WebDriverManager.getInstance(FIREFOX).setup();
                driver=new FirefoxDriver();
            }
            else if(driverName.equalsIgnoreCase("ie"))
            {
                WebDriverManager.getInstance(IEXPLORER).setup();
                driver=new InternetExplorerDriver();
            }
            else if(driverName.equalsIgnoreCase("edge"))
            {
                WebDriverManager.getInstance(EDGE).setup();
                driver=new EdgeDriver();
            }
        }

        //Perform Basic Operations
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Integer.parseInt(properties.getProperty("implicitlyWait")), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(properties.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
        wait=new WebDriverWait(driver, Integer.parseInt(properties.getProperty("wait")));

    }



}
