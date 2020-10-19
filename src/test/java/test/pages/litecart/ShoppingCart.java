package test.pages.litecart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.pages.BasePage;
import webbrowser.WebBrowser;

public class ShoppingCart extends BasePage {

    public static final String PAGE_IDENTIFIER = "Shopping Cart";

    private static final String BUTTON_REMOVE_CART_ITEM_XPATH = "//button[@name='remove_cart_item']";
    private static final String NO_ITEM_INFO = "//div[@id='box-checkout']//em";

    @Override
    public void getPage() {
        WebBrowser.getDriver().get("http://kuopassa.net/litecart/en/checkout");
    }

    public WebElement getButtonRemoveCartItem(){
         return WebBrowser.getDriver().findElement(byButtonRemoveCartItem());
    }

    public String NoItemCheck(){
        WebBrowser.waitForElementToBeVisible(WebBrowser.getDriver().findElement(byNoItemCheck()));
        return WebBrowser.getDriver().findElement(byNoItemCheck()).getAttribute("textContent");
    }

    private By byButtonRemoveCartItem(){
        return By.xpath(BUTTON_REMOVE_CART_ITEM_XPATH);
    }

    private By byNoItemCheck(){
        return By.xpath(NO_ITEM_INFO);
    }

}
