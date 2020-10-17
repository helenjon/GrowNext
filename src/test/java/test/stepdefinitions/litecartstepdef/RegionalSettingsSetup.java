package test.stepdefinitions.litecartstepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pages.PageFactory;
import test.pages.litecart.HomePageLiteCart;


public class RegionalSettingsSetup {

    private final HomePageLiteCart homePageLiteCart = (HomePageLiteCart) PageFactory.getPageByIdentifier(HomePageLiteCart.PAGE_IDENTIFIER);


    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
        homePageLiteCart.getPage();
    }

    @When("^I click to Change button$")
    public void iClickToButton() {
        homePageLiteCart.openRegionlSettings();
    }

    @And("^I click on \"([^\"]*)\" dropdown$")
    public void iClickOnDropdown(String arg0) {
        homePageLiteCart.setRegionalSettingsDropdown(arg0);
    }


    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String arg0) {
        homePageLiteCart.setRegionalSettingsDropdownValue(arg0);
    }

    @And("^click Save$")
    public void clickSave() {
        homePageLiteCart.RegionalSettingsSave();
    }


    @Then("^Header contains Language \"([^\"]*)\"$")
    public void headerContainsLanguage(String arg0) {
<<<<<<< HEAD
        homePageLiteCart.CheckForSetupRegionalSetingsLanguage(arg0);
=======
        homePageLiteCart.CheckForSetupRegionalSetingsPageLanguage(arg0);
    }

    @Then("^Header contains Country \"([^\"]*)\"$")
    public void headerContainsCountry(String arg0) {
        homePageLiteCart.CheckForSetupRegionalSetingsPageCountry(arg0);
>>>>>>> 7aa6e2f16c03343fce8dc9095840fd25286d45aa
    }

    @And("^Home Page has url \"([^\"]*)\"$")
    public void homePageHasUrl(String arg0) {

    }

<<<<<<< HEAD

    @Then("Header contains Country {string}")
    public void headerContainsCountry(String arg0) {
        homePageLiteCart.CheckForSetupRegionalSetingsCountry(arg0);
    }
=======
>>>>>>> 7aa6e2f16c03343fce8dc9095840fd25286d45aa
}
