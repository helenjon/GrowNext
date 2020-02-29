package test.pages.litecart;

import org.openqa.selenium.By;
import org.testng.Assert;
import test.pages.BasePage;
import test.utilities.MyLog;
import webbrowser.WebBrowser;


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

//    public void Linkclick(String arg0) {
//        List<WebElement> listLinks = bottomMenu.getListBottomLinks();
//        for (WebElement element : listLinks) {
//            if (element.getAttribute("textContent").equals(arg0)) {
//                element.click();
//                break;
//            }
//        }
//    }

    public void Linkclick(String arg0) {
        bottomMenu.getBottomLink(arg0).click();
    }

    private By byRegionalSettingsPopUp() {
        return By.xpath(REGIONAL_SETTINGS_POPUP_XPATH);
    }
}
