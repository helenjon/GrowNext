package test.stepdefinitions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;



@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "test/stepdefinitions"
     //   plugin = {"html:target/cucumber/runner.html"}
     //   tags = {"@RegionalSettingsSetup"}
)
public class Runner extends AbstractTestNGCucumberTests  {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

