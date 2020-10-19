package com.epam.grownext.test.pages.litecart;

import com.epam.grownext.test.pages.BasePage;
import com.epam.grownext.webbrowser.WebBrowser;

public class RegionalSettingsPage extends BasePage {

    public static final String PAGE_IDENTIFIER = "Regional Settings";

    @Override
    public void getPage() {
        WebBrowser.getDriver().get("http://kuopassa.net/litecart/en/regional_settings");
    }
}
