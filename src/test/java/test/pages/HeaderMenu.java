package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webbrowser.WebBrowser;

public class HeaderMenu {

    private static final String CHANGE_REGIONAL_SETTINGS_XPATH = "//div[@class='change']";
    private static final String REGIONAL_LANGUAGE_XPATH = ".//div[@id='region']/div[@class='language']";
    private static final String SHOPPING_CART_QUANTITY_XPATH = "//div[@id='cart']//span[@class='quantity']";
    private static final String SHOPPING_CART_CHECKOUT_XPATH = "//div[@id='cart']";
<<<<<<< HEAD
    private static final String REGIONAL_COUNTRY_XPATH = "//div[@class='country']/img";
=======
    private static final String REGIONAL_COUNTRY_XPATH = "//div[@class = 'country']/img";
>>>>>>> 7aa6e2f16c03343fce8dc9095840fd25286d45aa

    public WebElement getButtonChange() {
        return WebBrowser.getDriver().findElement(byButtonChange());
    }

    public String getPageLanguageValue() {
        return WebBrowser.getDriver().findElement(byRegionalLanguageChange()).getAttribute("textContent");
    }

<<<<<<< HEAD
    public String getPageCountryValue(){
        return WebBrowser.getDriver().findElement(byRegionalCountryValue()).getAttribute("title");
=======
    public String getPageCountyValue() {
        return WebBrowser.getDriver().findElement(byRegionalCountryChange()).getAttribute("title");
>>>>>>> 7aa6e2f16c03343fce8dc9095840fd25286d45aa
    }

    public String getShoppingCartQuantity() {
        //// wait add to cart animation is finished
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return WebBrowser.getDriver().findElement(byShoppingCartQuantity()).getAttribute("textContent");
    }

    public String getRegionalCountryValue() {
        return  WebBrowser.getDriver().findElement(byRegionalCountryChange()).getAttribute("title");
    }

    public WebElement getShoppingCartItem(){
            return WebBrowser.getDriver().findElement(byShoppingCartCheckOut());
    }

    private By byButtonChange() {
        return By.xpath(CHANGE_REGIONAL_SETTINGS_XPATH);
    }

    private By byRegionalLanguageChange() {
        return By.xpath(REGIONAL_LANGUAGE_XPATH);
    }

    private By byShoppingCartQuantity() {
        return By.xpath(SHOPPING_CART_QUANTITY_XPATH);
    }

    private By byShoppingCartCheckOut(){
        return By.xpath(SHOPPING_CART_CHECKOUT_XPATH);
    }

<<<<<<< HEAD
    private By byRegionalCountryValue(){ return By.xpath(REGIONAL_COUNTRY_XPATH);}
=======
    private By byRegionalCountryChange() { return By.xpath(REGIONAL_COUNTRY_XPATH);}
>>>>>>> 7aa6e2f16c03343fce8dc9095840fd25286d45aa



}
