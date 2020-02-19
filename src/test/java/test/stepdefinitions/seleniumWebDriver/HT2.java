package test.stepdefinitions.seleniumWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import test.pages.AutomationPracticeForm;
import test.pages.BasePage;
import webdrivers.WebDriverr;

public class HT2 {

    WebDriver driver = WebDriverr.initialization();
    AutomationPracticeForm form;


    @Given("^I am on \"([^\"]*)\" page$")
    public void iAmOnAutomationPracticeForm(String arg0) {
        form = (AutomationPracticeForm) BasePage.getPageByIdentifier(arg0, driver);

    }

    @When("^I select \"([^\"]*)\"$")
    public void iSelect(String arg0)  {
       form.setValue(arg0);
    }

    @And("^Years of Experience \"([^\"]*)\"$")
    public void yearsOfExperience(String arg0)  {
        form.setValue(arg0);
    }


    @And("^Professions \"([^\"]*)\"$")
    public void professions(String arg0)  {
        form.setValue(arg0);
    }

    @And("^Automation Tool \"([^\"]*)\"$")
    public void automationTool(String arg0) {
        form.setValue(arg0);
    }

    @Then("^Check their atributes$")
    public void checkTheirAtributes() {


    }
}
