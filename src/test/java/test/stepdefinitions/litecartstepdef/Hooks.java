package test.stepdefinitions.litecartstepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.xml.DOMConfigurator;
import webbrowser.WebBrowser;

public class Hooks {

    @Before
    public void BeforeSteps() {
        System.out.println("HOOKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        WebBrowser webBowser = new WebBrowser();
        DOMConfigurator.configure("Log4j.xml");

    }

    @After
    public void AfterSteps() {
        System.out.println("AFTER !!!!!!!!!!!!HOOKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        WebBrowser.driver.quit();

    }


}
