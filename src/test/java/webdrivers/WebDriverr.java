package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebDriverr {

    public static Properties properties;
    public static WebDriver driver=null;

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

    public static WebDriver initialization(){
        new WebDriverr();
        String driverName = properties.getProperty("browser");
        if(driver == null)
        {
            if(driverName.equalsIgnoreCase("chrome"))
            {
                driver=new ChromeDriver();
            }
            else if(driverName.equalsIgnoreCase("Firefox"))
            {
                driver=new FirefoxDriver();
            }
        }
        //Perform Basic Operations
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        return driver;

    }

}
