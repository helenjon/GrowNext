package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdrivers.WebDriverr;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class AutomationPracticeForm extends BasePage {

    public static final String PAGE_IDENTIFIER = "Automation Practice Form";

    private WebDriver driver;
    private WebElement element;  // input[@value="Female"]


    Map<String, WebElement> selectedWebElements = new HashMap<>();
    //JavascriptExecutor js = (JavascriptExecutor) driver;


    public AutomationPracticeForm (WebDriver driver){
        this.driver = driver;
        this.driver.get("https://www.toolsqa.com/automation-practice-form/");
    }

    public void setValue(String arg0){
       // driver.findElement(By.xpath("//input[@value='Male']")).click();
       // element = driver.findElement(By.xpath("//input[@value='"+arg0+"']"));
        element = driver.findElement(By.xpath("//input[@value='3']"));
        Actions ttt = new Actions(driver);
        ttt.moveToElement(element);
       // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", element);
       // ((JavascriptExecutor)driver).executeScript("window.scrollTo(document.body.scrollHeight,-50)");
      //  WebDriverr.wait.until(ExpectedConditions.elementToBeClickable(element));
                //visibilityOfElementLocated(By.xpath("//input[@value='3']")));
       // driver.findElement(By.xpath("//input[@value='3']")).click();
        element.click();
       //   selectedWebElements.put(arg0, element);
    }

    public void mapp(){
        System.out.println(selectedWebElements.size());
    }


}
