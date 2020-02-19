package test.stepdefinitions;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
    features = "src/test/java/test/features",
    glue = {"test/stepdefinitions/"}
)
public class runner extends AbstractTestNGCucumberTests {

}