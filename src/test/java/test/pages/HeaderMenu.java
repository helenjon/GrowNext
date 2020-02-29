package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webbrowser.WebBrowser;

public class HeaderMenu {

    private static final String CHANGE_REGIONAL_SETTINGS_XPATH = "//div[@class='change']";
    private static final String REGIONAL_LANGUAGE_XPATH = ".//div[@id='region']/div[@class='language']";


    private By byButtonChange() { return By.xpath(CHANGE_REGIONAL_SETTINGS_XPATH); }
    private By byRegionalLanguageChange() { return By.xpath(REGIONAL_LANGUAGE_XPATH); }

    public WebElement getButtonChange() {
        return WebBrowser.getDriver().findElement(byButtonChange());
    }

    public String getPageLanguageValue() {
        return WebBrowser.getDriver().findElement(byRegionalLanguageChange()).getAttribute("textContent");
    }

}
