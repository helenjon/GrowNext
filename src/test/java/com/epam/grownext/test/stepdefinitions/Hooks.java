package com.epam.grownext.test.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.xml.DOMConfigurator;
import com.epam.grownext.webbrowser.WebBrowser;

public class Hooks {

    @Before
    public void BeforeSteps() {
        System.out.println("HOOKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        WebBrowser.initializationWebDriver();
        DOMConfigurator.configure("Log4j.xml");
    }

    @After
    public void AfterSteps() {
        System.out.println("AFTER !!!!!!!!!!!!HOOKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        WebBrowser.quitDriver();
    }
}
