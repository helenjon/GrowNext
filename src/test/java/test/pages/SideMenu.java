package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webbrowser.WebBrowser;

public class SideMenu {

    public static final String SIDE_MENU_TITLE = "//div[@id='box-information-links']/*[@class ='title']";

    public WebElement getTitle() {
        return WebBrowser.getDriver().findElement(bySideTitleMenu());
    }

    private By bySideTitleMenu() {
        return By.xpath(SIDE_MENU_TITLE);
    }


}
