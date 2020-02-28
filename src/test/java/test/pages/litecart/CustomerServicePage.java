package test.pages.litecart;

import test.pages.BasePage;
import test.pages.PageFactory;
import webbrowser.WebBrowser;

public class CustomerServicePage extends BasePage {

    public static final String PAGE_IDENTIFIER = "Customer Service";

    @Override
    public void getPage() {
         WebBrowser.getDriver().get("http://kuopassa.net/litecart/en/customer-service-s-0");
    }

    public String getSideMenuTitle() {
        return sideMenu.getTitle().getAttribute("textContent");
    }



}
