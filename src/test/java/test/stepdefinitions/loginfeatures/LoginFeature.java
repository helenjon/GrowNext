package test.stepdefinitions.loginfeatures;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import test.pages.LoginPage;
import webdrivers.GetWebDriver;



public class LoginFeature {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();

    @Given("^I am on the facebook \"([^\"]*)\" one$")
    public void iAmOnTheFacebookOne(String arg0) {
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
