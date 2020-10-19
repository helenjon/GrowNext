package com.epam.grownext.test.pages.litecart;

import com.epam.grownext.test.pages.BasePage;
import com.epam.grownext.webbrowser.WebBrowser;

public class CustomerServicePage extends BasePage {

    public static final String PAGE_IDENTIFIER = "Customer Service";

    @Override
    public void getPage() {
         WebBrowser.getDriver().get("http://kuopassa.net/litecart/en/customer-service-s-0");
    }

    public String getSideMenuTitle() {
        WebBrowser.waitForElementToBeVisible(sideMenu.getTitle());
        return sideMenu.getTitle().getAttribute("textContent");
    }



}
