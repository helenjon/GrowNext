package webdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

public class WebDriverr {

    public static Properties properties;
    public static WebDriver driver;
    public static WebDriverWait wait;

    public WebDriverr(){
        try {
            properties = new Properties();
            FileInputStream fileinput = new FileInputStream("src\\test\\resources\\config\\config.properties");
            properties.load(fileinput);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver initialization()  {
        WebDriverManager.firefoxdriver().setup();
        new WebDriverr();
        String driverName = properties.getProperty("browser");
        if(driver == null)
        {
            if(driverName.equalsIgnoreCase("chrome"))
            {
                WebDriverManager.getInstance(CHROME).setup();
                System.out.println(WebDriverManager.chromedriver());
                driver=new ChromeDriver();

            }
            else if(driverName.equalsIgnoreCase("firefox"))
            {
                WebDriverManager.getInstance(FIREFOX).setup();
                System.out.println(WebDriverManager.firefoxdriver());
                driver=new FirefoxDriver();


            }

        }
        //Perform Basic Operations
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Integer.parseInt(properties.getProperty("implicitlyWait")), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(properties.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);
        wait=new WebDriverWait(driver, Integer.parseInt(properties.getProperty("wait")));

        return driver;
    }

}
