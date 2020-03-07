package test.stepdefinitions.seleniumWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
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
