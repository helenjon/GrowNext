package com.epam.grownext.test.pages;

import com.epam.grownext.test.pages.litecart.*;
import org.openqa.selenium.WebDriverException;
import com.epam.grownext.test.pages.automationpracticeform.AutomationPracticeForm;
import com.epam.grownext.test.pages.facebook.LoginPage;
import com.epam.grownext.test.utilities.MyLog;

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
            case CustomerServicePage.PAGE_IDENTIFIER:
                return new CustomerServicePage();
            case RegionalSettingsPage.PAGE_IDENTIFIER:
                return new RegionalSettingsPage();
            case ProductCardPage.PAGE_IDENTIFIER:
                return new ProductCardPage();
            case ShoppingCart.PAGE_IDENTIFIER:
                return new ShoppingCart();
            default:
                MyLog.error(new IllegalArgumentException(identifier + "is not found").getMessage());
                throw new IllegalArgumentException(identifier + "is not found");
        }
    }
}


