package test.stepdefinitions.loginfeatures;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import test.pages.BasePage;
import test.pages.LoginPage;
import webdrivers.WebDriverr;


public class LoginFacebookFeature {

    WebDriver driver = WebDriverr.initialization();
    LoginPage loginPage;


    @Given("^I am on the facebook \"([^\"]*)\" one$")
    public void iAmOnTheFacebookOne(String arg0) {
        loginPage = (LoginPage) BasePage.getPageByIdentifier("Login Page", driver);
        loginPage.getURL(arg0);
    }

    @When("^I fill in Email \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void iFillInEmailAndPassword(String arg0, String arg1)  {
       loginPage.fillINEmailPass(arg0, arg1);

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
