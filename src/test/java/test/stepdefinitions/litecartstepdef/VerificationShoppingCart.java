package test.stepdefinitions.litecartstepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import test.pages.PageFactory;
import test.pages.litecart.HomePageLiteCart;
import test.pages.litecart.ProductCardPage;

public class VerificationShoppingCart {

    private HomePageLiteCart homePageLiteCart = (HomePageLiteCart) PageFactory.getPageByIdentifier(HomePageLiteCart.PAGE_IDENTIFIER);
    private ProductCardPage productCardPage = (ProductCardPage) PageFactory.getPageByIdentifier(ProductCardPage.PAGE_IDENTIFIER);

    @Given("^I am on My Main Page$")
    public void iAmOnMyMainPage() {
        homePageLiteCart.getPage();
    }

    @And("^Shopping Cart is empty$")
    public void shoppingCartIsEmpty() {
        homePageLiteCart.shoppingCartIsEmpty();
    }

    @And("^I click to first popular product$")
    public void iClickToFirstPopularProduct() {
        homePageLiteCart.clickFirstLinkPopularProducts();
    }

    @When("^click \"([^\"]*)\" button$")
    public void clickButton(String arg0) {
        productCardPage.itemAddToCard();
    }

    @Then("^selected item was added to Shopping Cart$")
    public void selectedItemWasAddedToShoppingCart() {
        Assert.assertEquals(productCardPage.getSoppingCartQuantity(), "1");
    }


}
