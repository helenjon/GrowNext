package com.epam.grownext.test.stepdefinitions;

import com.epam.grownext.webbrowser.WebBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class Hooks {

    @Before
    public void BeforeSteps() {
        System.out.println("HOOKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        WebBrowser.initializationWebDriver();
        DOMConfigurator.configure("Log4j.xml");

    }

    @After
    public void AfterSteps() {
        embedScreenshot();
        System.out.println("AFTER !!!!!!!!!!!!HOOKS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        WebBrowser.quitDriver();


    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public void embedScreenshot() {
        try {
            Allure.addAttachment("scenariogetName",
                    new ByteArrayInputStream(((TakesScreenshot) WebBrowser.getDriver()).getScreenshotAs(OutputType.BYTES)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}