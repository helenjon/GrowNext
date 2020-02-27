package test.pages;

import org.openqa.selenium.WebDriverException;
import test.pages.automationpracticeform.AutomationPracticeForm;
import test.pages.facebook.LoginPage;
import test.pages.litecart.CustomerServicePage;
import test.pages.litecart.HomePageLiteCart;
import test.pages.litecart.MainPage;
import test.pages.litecart.RegionalSettingsPage;
import test.utilities.MyLog;

public class PageFactory {

    public static BasePage getPageByIdentifier(String identifier) {
        Object obj = initPage(identifier);
        if (obj instanceof BasePage) {
            return (BasePage) obj;
        } else {
            throw new WebDriverException(String.format("Page '%s' does not extend class BasePage", obj.getClass().getName()));
        }
    }

    private static Object initPage(String identifier) {
        switch (identifier) {
            case LoginPage.PAGE_IDENTIFIER:
                return new LoginPage();
            case AutomationPracticeForm.PAGE_IDENTIFIER:
                return new AutomationPracticeForm();
            case HomePageLiteCart.PAGE_IDENTIFIER:
                return new HomePageLiteCart();
            case MainPage.PAGE_IDENTIFIER:
                return new MainPage();
            case CustomerServicePage.PAGE_IDENTIFIER:
                return new CustomerServicePage();
            case RegionalSettingsPage.PAGE_IDENTIFIER:
                return new RegionalSettingsPage();
            default:
                MyLog.error(new IllegalArgumentException(identifier + "is not found").getMessage());
                throw new IllegalArgumentException(identifier + "is not found");
        }
    }

}


