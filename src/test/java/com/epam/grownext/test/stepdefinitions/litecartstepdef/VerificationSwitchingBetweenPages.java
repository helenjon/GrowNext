package com.epam.grownext.test.stepdefinitions.litecartstepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import com.epam.grownext.test.pages.PageFactory;
import com.epam.grownext.test.pages.litecart.CustomerServicePage;
import com.epam.grownext.test.pages.litecart.HomePageLiteCart;
import com.epam.grownext.webbrowser.WebBrowser;

public class VerificationSwitchingBetweenPages {

    private final HomePageLiteCart homePageLiteCart = (HomePageLiteCart) PageFactory.getPageByIdentifier(HomePageLiteCart.PAGE_IDENTIFIER);
    private final CustomerServicePage customerServicePage = (CustomerServicePage) PageFactory.getPageByIdentifier(CustomerServicePage.PAGE_IDENTIFIER);

    @Given("^I am on Main Page$")
    public void iAmOnMainPage() {
        homePageLiteCart.getPage();
    }

    @When("^I click \"([^\"]*)\"$")
    public void iClick(String arg0) {
        homePageLiteCart.LinkClick(arg0);
    }

    @Then("^I was redirected to \"([^\"]*)\"$")
    public void iWasRedirectedTo(String arg0) {
        System.out.println(arg0 + "    " + customerServicePage.getSideMenuTitle());
        Assert.assertEquals(arg0, customerServicePage.getSideMenuTitle());
    }

    @Then("^Redirect to \"([^\"]*)\"$")
    public void redirectTo(String arg0) {
        System.out.println(arg0 + "    " + WebBrowser.getDriver().getTitle());
        Assert.assertEquals(arg0, WebBrowser.getDriver().getTitle().replace(" | Demokauppa", ""));
    }
}
