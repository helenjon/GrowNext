package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class BasePage {
    private static WebDriver driver;
    public static BasePage getPageByIdentifier(String identifier, WebDriver driver) {
        Object obj = initPage(identifier, driver);
        if (obj instanceof BasePage) {
            return (BasePage) obj;
        } else {
            throw new WebDriverException(String.format("Page '%s' does not extend class BasePage", obj.getClass().getName()));
        }
    }


    private static Object initPage(String identifier, WebDriver driver) {
        switch (identifier) {
            case LoginPage.PAGE_IDENTIFIER:
                return new LoginPage(driver);

            default: return new LoginPage(driver);
        }
    }

}
