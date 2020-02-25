package test.pages;

import org.testng.Assert;
import webbrowser.WebBrowser;

public abstract class BasePage {

    public void homePageUrlCheck(String arg0){
        if ("Suomi".equals(arg0))
            Assert.assertEquals(true, WebBrowser.driver.getCurrentUrl().contains(".contains('/fi/')"));
        if ("Svenska".equals(arg0))
            Assert.assertEquals(true, WebBrowser.driver.getCurrentUrl().contains(".contains('/sv/')"));
        if ("English".equals(arg0))
            Assert.assertEquals(true, WebBrowser.driver.getCurrentUrl().contains(".contains('/en/')"));
    }

}
