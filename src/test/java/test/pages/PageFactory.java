package test.pages;

import org.openqa.selenium.WebDriverException;
import test.pages.automationpracticeform.AutomationPracticeForm;
import test.pages.facebook.LoginPage;
import test.pages.litecart.HomePageLiteCart;

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
            default: throw new IllegalArgumentException(identifier +"is not found");
        }
    }




}
