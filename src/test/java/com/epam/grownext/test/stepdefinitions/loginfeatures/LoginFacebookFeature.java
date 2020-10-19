package com.epam.grownext.test.stepdefinitions.loginfeatures;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import com.epam.grownext.test.pages.facebook.LoginPage;
import com.epam.grownext.test.pages.PageFactory;

public class LoginFacebookFeature {

    private final LoginPage loginPage = (LoginPage) PageFactory.getPageByIdentifier(LoginPage.PAGE_IDENTIFIER);

    @Given("^I am on the facebook \"([^\"]*)\" one$")
    public void iAmOnTheFacebookOne(String arg0) {
        loginPage.getURL(arg0);
    }

    @When("^I fill in Email \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void iFillInEmailAndPassword(String arg0, String arg1) {
        loginPage.fillInEmailPass(arg0, arg1);
    }

    @And("^I click login$")
    public void iClickLogin() {
        loginPage.clickLogin();
    }

    @Then("^I am on main page$")
    public void iAmOnMainPage() {
        System.out.println("HELLO");
    }
}
