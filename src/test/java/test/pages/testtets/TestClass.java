package test.pages.testtets;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import webbrowser.WebBrowser;

import java.util.ArrayList;
import java.util.List;


public class TestClass {



    public static void main(String [] args) throws InterruptedException {

//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://kuopassa.net/litecart/en/");
//        driver.findElement(By.className("change")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']")).click();
//        Select language = new Select(driver.findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']")));
//        language.selectByValue("fi");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@name='save']")).click();
//        Thread.sleep(2000);

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get("https://www.toolsqa.com/automation-practice-form/");
//        driver.findElement(By.id("cookie_action_close_header")).click();
//
//        // driver.findElement(By.xpath("//input[@value='Male']")).click();
//        // element = driver.findElement(By.xpath("//input[@value='"+arg0+"']"));
//        Thread.sleep(2000);
//        Actions actions = new Actions(driver);
//
//      //  WebElement element = driver.findElement(By.id("lastname"));
//        WebElement element = driver.findElement(By.xpath("//input[@value='3']"));
//        System.out.println(element.getSize());
//        actions.moveToElement(element).click().build().perform();

//// elements on main page
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get("http://kuopassa.net/litecart/en/");
//        List<WebElement> webElementList = new ArrayList<WebElement>();
//        webElementList.addAll(driver.findElements(By.xpath("//div[@id='box-popular-products']//a[@class='link']")));
//        webElementList.get(0).click();
//   ///add to cart
//        driver.findElement(By.name("add_cart_product")).click();
////open cart
//        driver.findElement(By.xpath("//div[@id='cart']/a")).click();
////
//        driver.findElement(By.name("remove_cart_item")).click();

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get("http://kuopassa.net/litecart");
//        System.out.println(driver.getCurrentUrl().substring(-2));
//
        //driver.findElement(By.xpath("//form[@name='region_form']//select[@name = 'language_code']/option[@value = 'fi']")).click();


        List<WebElement> bottomLinks = new ArrayList<WebElement>();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String test = "Customer Service";
        driver.get("http://kuopassa.net/litecart");
        System.out.println(driver.getTitle());

//        bottomLinks.addAll(driver.findElements(By.xpath("//ul[@class= 'list-unstyled']//a")));
//        for (WebElement element : bottomLinks){
//            if(element.getAttribute("textContent").equals(test)) element.click();
//            Thread.sleep(3000);
//        }
//

    }


    }


