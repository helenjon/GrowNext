package test.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.xml.DOMConfigurator;
import webbrowser.WebBrowser;

public class Hooks {

    @Before
    public void BeforeSteps() {
        System.out.println("HOOKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        WebBrowser.initializationWebDriver();
        DOMConfigurator.configure("Log4j.xml");
    }

    @After
    public void AfterSteps() {
        System.out.println("AFTER !!!!!!!!!!!!HOOKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        WebBrowser.quitDriver();

    }
}
