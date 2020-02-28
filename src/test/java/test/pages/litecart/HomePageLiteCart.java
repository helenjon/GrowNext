package test.pages.litecart;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import test.pages.BasePage;
import test.utilities.MyLog;
import webbrowser.WebBrowser;



//import static webbrowser.WebBrowser.waitForElementToBeVisible;

public class HomePageLiteCart extends BasePage {

    public static final String PAGE_IDENTIFIER = "Home Page LiteCart";
    public static final String REGIONAL_SETTINGS_POPUP_XPATH = "//div[@id='box-regional-settings']";

    RegionalSettingsSetup regionalSettings;

    @Override
    public void getPage() {
        WebBrowser.getDriver().get("http://kuopassa.net/litecart/en/");
    }


     public void openRegionlSettings() {
        headerMenu.getButtonChange().click();
        regionalSettings = new RegionalSettingsSetup();
        WebBrowser.waitForElementToBeVisible(WebBrowser.getDriver().findElement(byRegionalSettingsPopUp()));
        //MyLog.info(WebBrowser.driver.findElement(By.id("box-regional-settings")).getText());
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

    public void CheckForSetupRegionalSetings(String arg0) {
        Assert.assertEquals(arg0, headerMenu.getPageLanguageValue());
    }

    private By byRegionalSettingsPopUp() { return By.xpath(REGIONAL_SETTINGS_POPUP_XPATH); }
}
