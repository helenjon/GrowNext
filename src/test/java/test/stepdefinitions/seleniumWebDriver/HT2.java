package test.stepdefinitions.seleniumWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.pages.automationpracticeform.AutomationPracticeForm;
import test.pages.PageFactory;
import webbrowser.WebBrowser;

public class HT2 {

    AutomationPracticeForm form;
    WebBrowser webBrowser = new WebBrowser();


    @Given("^I am on \"([^\"]*)\" page$")
    public void iAmOnAutomationPracticeForm(String arg0) {
        form = (AutomationPracticeForm) PageFactory.getPageByIdentifier(AutomationPracticeForm.PAGE_IDENTIFIER);
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
