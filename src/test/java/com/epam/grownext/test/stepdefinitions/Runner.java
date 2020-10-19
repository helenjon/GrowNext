package com.epam.grownext.test.stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com/epam/grownext/test/stepdefinitions",
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
     //   tags = {"@RegionalSettingsSetup"}
)
public class Runner extends AbstractTestNGCucumberTests  {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
