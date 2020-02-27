package test.stepdefinitions.litecartstepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.pages.PageFactory;
import test.pages.litecart.HomePageLiteCart;

public class RegionalSettingsSetup {


    private HomePageLiteCart homePageLiteCart = (HomePageLiteCart) PageFactory.getPageByIdentifier(HomePageLiteCart.PAGE_IDENTIFIER);


    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
           homePageLiteCart.getHomePage();
    }

    @When("^I click to Change button$")
    public void iClickToButton()  {
        homePageLiteCart.openRegionlSettings();
    }

    @And("^I click on \"([^\"]*)\" dropdown$")
    public void iClickOnDropdown(String arg0)  {
        homePageLiteCart.setRegionalSettingsDropdown(arg0);
    }


    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String arg0)  {
        homePageLiteCart.setRegionalSettingsDropdownValue(arg0);
    }

    @And("^click Save$")
    public void clickSave() {
        homePageLiteCart.RegionalSettingsSave();
    }


    @Then("^Header contains Language \"([^\"]*)\"$")
    public void headerContainsLanguage(String arg0) {
           homePageLiteCart.CheckForSetupRegionalSetings(arg0);
    }

    @And("^Home Page has url \"([^\"]*)\"$")
    public void homePageHasUrl(String arg0)  {

    }
}
