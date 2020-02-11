package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GetWebDriver {
    public static WebDriver driver=null;
    public static WebDriver initilize(String driverName)
    {
        //Use Of Singleton Concept and Initilize webDriver
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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        return driver;
    }
    public static void quit()
    {
        driver.quit();
        driver=null; // we destroy the driver object after quit operation
    }
    public static void close()
    {
        driver.close();
        driver=null;  // we destroy the driver object after quit operation
    }


}
