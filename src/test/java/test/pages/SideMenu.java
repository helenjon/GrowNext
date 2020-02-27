package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webbrowser.WebBrowser;

public class SideMenu {

    public WebElement getTitle(){
        return WebBrowser.driver.findElement(By.xpath("//div[@id='box-information-links']/*[@class ='title']"));
    }


}
