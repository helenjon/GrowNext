package test.pages.automationpracticeform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.pages.BasePage;
import webbrowser.WebBrowser;

public class AutomationPracticeForm extends BasePage {

    public static final String PAGE_IDENTIFIER = "Automation Practice Form";

    private WebElement element;
    public AutomationPracticeForm (){
        WebBrowser.driver.get("https://www.toolsqa.com/automation-practice-form/");
    }

    public void setValue(String arg0){
       element = WebBrowser.driver.findElement(By.xpath("//input[@value='"+arg0+"']"));
       Actions ttt = new Actions(WebBrowser.driver);
       ttt.moveToElement(element);
       element.click();
    }




}
