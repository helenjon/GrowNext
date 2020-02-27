package test.pages.litecart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import test.pages.BasePage;
import test.utilities.MyLog;
import webbrowser.WebBrowser;

public class HomePageLiteCart extends BasePage {

    public static final String PAGE_IDENTIFIER = "Home Page LiteCart";
    private WebElement change;
    RegionalSettings regionalSettings;

    public HomePageLiteCart(){
        WebBrowser.driver.get("http://kuopassa.net/litecart");
        change = WebBrowser.driver.findElement(By.className("change"));
    }


    public void openRegionlSettings(){
        change.click();
        regionalSettings = new RegionalSettings();
        WebDriverWait wait = new WebDriverWait(WebBrowser.driver, 5);
        wait.until(ExpectedConditions.visibilityOf(WebBrowser.driver.findElement(By.id("box-regional-settings"))));
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
        MyLog.info("!!!!!!!!  +++++++++ Click Save" );
        regionalSettings.getSaveBatton().click();
    }

    public void CheckForSetupRegionalSetings(String arg0){
        Assert.assertEquals(arg0, regionalSettings.getPageLanguageValue());
    }

}
