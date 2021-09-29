package com.epam.grownext.test.pages.litecart;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.epam.grownext.test.pages.BasePage;
import com.epam.grownext.test.utilities.MyLog;
import com.epam.grownext.webbrowser.WebBrowser;

public class HomePageLiteCart extends BasePage {

    public static final String PAGE_IDENTIFIER = "Home Page LiteCart";

    private static final String REGIONAL_SETTINGS_POPUP_XPATH = "//div[@id='box-regional-settings']";
    private static final String POPULAR_PRODUCTS_LIST_XPATH = "//div[@id='box-popular-products']//a";

    RegionalSettingsSetup regionalSettings;

    @Override
    public void getPage() {
        WebBrowser.getDriver().get("http://kuopassa.net/litecart/en/");
    }

    public void openRegionalSettings() {
        headerMenu.getButtonChange().click();
        regionalSettings = new RegionalSettingsSetup();
        WebBrowser.waitForElementToBeVisible(WebBrowser.getDriver().findElement(byRegionalSettingsPopUp()));
        MyLog.info(WebBrowser.getDriver().findElement(By.id("box-regional-settings")).getText());
    }

    public void setRegionalSettingsDropdown(String arg0) {
        MyLog.info("!!!!!!!!  +++++++++ Select Dropdown " + arg0);
        regionalSettings.selectDropdown(arg0);
    }

    public void setRegionalSettingsDropdownValue(String arg0) {
        MyLog.info("!!!!!!!!  +++++++++ Select Dropdown Value " + arg0);
        regionalSettings.selectValue(arg0);
    }

    public void RegionalSettingsSave() {
        MyLog.info("!!!!!!!!  +++++++++ Click Save");
        regionalSettings.getSaveButton().click();
    }

    public void CheckForSetupRegionalSettingsPageLanguage(String arg0) {
        Assert.assertEquals(arg0, headerMenu.getPageLanguageValue());
    }

    public void CheckForSetupRegionalSettingsCountry(String arg0){
        Assert.assertEquals(arg0, headerMenu.getPageCountryValue());
    }

    public void CheckForSetupRegionalSettingsPageCountry(String arg0) {
        Assert.assertEquals(arg0, headerMenu.getPageCountryValue());
    }

    public void shoppingCartIsEmpty() {
        Assert.assertEquals("0", headerMenu.getShoppingCartQuantity());
    }

    public void clickFirstLinkPopularProducts() {
        WebBrowser.getDriver().findElement(byPopularProductsList()).click();
    }

    public void LinkClick(String arg0) {
        bottomMenu.getBottomLink(arg0).click();
    }

    private By byRegionalSettingsPopUp() {
        return By.xpath(REGIONAL_SETTINGS_POPUP_XPATH);
    }

    private By byPopularProductsList() {
        return By.xpath(POPULAR_PRODUCTS_LIST_XPATH);
    }


}
