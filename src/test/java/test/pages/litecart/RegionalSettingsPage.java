package test.pages.litecart;

import test.pages.BasePage;
import webbrowser.WebBrowser;

public class RegionalSettingsPage extends BasePage {

    public static final String PAGE_IDENTIFIER = "Regional Settings";

    @Override
    public void getPage() {
        WebBrowser.getDriver().get("http://kuopassa.net/litecart/en/regional_settings");
    }
}
