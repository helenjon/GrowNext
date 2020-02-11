package test.pages;

import org.openqa.selenium.WebDriver;
import webdrivers.GetWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties properties;


    public TestBase(){
        try {
            properties = new Properties();
            FileInputStream fileinput = new FileInputStream("C:\\My doc\\Idea_projects\\GrowNext\\src\\test\\java\\test\\config\\config.properties");
            properties.load(fileinput);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization(){
        String browsername = properties.getProperty("browser");
        driver = GetWebDriver.initilize(browsername);

    }

}
