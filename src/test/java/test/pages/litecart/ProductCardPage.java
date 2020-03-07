package test.pages.litecart;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import test.pages.BasePage;
import webbrowser.WebBrowser;

public class ProductCardPage extends BasePage {

    public static final String PAGE_IDENTIFIER = "Product Card Page";
    private static final String ADD_TO_CARD_BUTTON_XPATH = ".//button[@name='add_cart_product']";
    private static final String SIZE_SELECT_DROPDOWN_XPATH = ".//div[@class='buy_now']//select[@name='options[Size]']";
    private static final String SELECT_FIRST_ITEM_FROM_DROPDOWN = ".//div[@class='buy_now']//select[@name='options[Size]']/option[2]";


    @Override
    public void getPage() {
        WebBrowser.getDriver().get("http://kuopassa.net/litecart/en/");
    }

    public void itemAddToCard() {
        String rez = checkSizePresent();
        if ("NO".equals(rez)) {
            WebBrowser.getDriver().findElement(byAddToCardButton()).click();
        } else {
            WebBrowser.getDriver().findElement(By.xpath(".//div[@class='buy_now']//select[@name='options[Size]']/option[2]")).click();
            WebBrowser.getDriver().findElement(byAddToCardButton()).click();
        }
    }

    public String getSoppingCartQuantity() {
        return headerMenu.getShoppingCartQuantity();
    }

    public void openCheckOutPage(){
            headerMenu.getShoppingCartItem().click();
    }


    private By bySizeSelectDropdown() {
        return By.xpath(SIZE_SELECT_DROPDOWN_XPATH);
    }

    private By byAddToCardButton() {
        return By.xpath(ADD_TO_CARD_BUTTON_XPATH);
    }

    private By byItemSize() {
        return By.name(SELECT_FIRST_ITEM_FROM_DROPDOWN);
    }

    private String checkSizePresent() {
        try {
            WebBrowser.getDriver().findElement(bySizeSelectDropdown());
            return "YES";
        } catch (NoSuchElementException e) {
            return "NO";
        }
    }

}
