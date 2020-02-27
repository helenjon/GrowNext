package test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webbrowser.WebBrowser;

import java.util.ArrayList;
import java.util.List;

public class BottomMenu   {

    List<WebElement> bottomLinks = new ArrayList<WebElement>();

    public List<WebElement> getListBottomLinks(){
        bottomLinks.addAll(WebBrowser.driver.findElements(By.xpath("//ul[@class= 'list-unstyled']//a")));
        return bottomLinks;
    }

}
