package com.epam.grownext.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.epam.grownext.webbrowser.WebBrowser;


public class BottomMenu {

    private static final String BOTTOM_LINK_XPATH_PART = "//footer//a[text()='%s']";

    public WebElement getBottomLink(String arg0) {
        return WebBrowser.getDriver().findElement(byBottomLinkXpath(arg0));
    }

    private By byBottomLinkXpath(String arg0) {
        return By.xpath(String.format("//footer//a[text()='%s']", arg0));
    }

}