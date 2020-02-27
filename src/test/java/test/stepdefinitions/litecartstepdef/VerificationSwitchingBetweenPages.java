package test.stepdefinitions.litecartstepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import test.pages.BasePage;
import test.pages.PageFactory;
import test.pages.litecart.CustomerServicePage;
import test.pages.litecart.MainPage;
import test.pages.litecart.RegionalSettingsPage;
import webbrowser.WebBrowser;

public class VerificationSwitchingBetweenPages {

    private MainPage mainPage = (MainPage) PageFactory.getPageByIdentifier(MainPage.PAGE_IDENTIFIER);
    private CustomerServicePage customerServicePage = (CustomerServicePage) PageFactory.getPageByIdentifier(CustomerServicePage.PAGE_IDENTIFIER);


    @Given("^I am on Main Page$")
    public void iAmOnMainPage() {
        mainPage.driverGetMainPage();
    }

    @When("^I click \"([^\"]*)\"$")
    public void iClick(String arg0)  {
        mainPage.mainPageLinksclick(arg0);
    }


    @Then("^I was redirected to \"([^\"]*)\"$")
    public void iWasRedirectedTo(String arg0) {
        System.out.println(arg0 +"    " +  customerServicePage.getSideMenuTitle());
        Assert.assertEquals(arg0, customerServicePage.getSideMenuTitle());
    }


    @Then("^Redirect to \"([^\"]*)\"$")
    public void redirectTo(String arg0)  {
       System.out.println(arg0 +"    " +  WebBrowser.driver.getTitle());
       Assert.assertEquals(arg0, WebBrowser.driver.getTitle());
    }
}
