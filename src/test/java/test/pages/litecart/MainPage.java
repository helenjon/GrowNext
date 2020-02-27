package test.pages.litecart;

import org.openqa.selenium.WebElement;
import test.pages.BasePage;
import test.pages.PageFactory;
import webbrowser.WebBrowser;

import java.util.List;

public class MainPage extends BasePage {

    public static final String PAGE_IDENTIFIER = "Main Page";

    public void driverGetMainPage(){
        WebBrowser.driver.get("http://kuopassa.net/litecart/en/");
    }

    public void mainPageLinksclick(String arg0) {
        List<WebElement> listLinks = bottomMenu.getListBottomLinks();
        for (WebElement element : listLinks) {
            System.out.println(element.getAttribute("textContent"));
            System.out.println(arg0);
            if (element.getAttribute("textContent").equals(arg0)) {
                element.click();
                break;
            }
        }

    }

}
