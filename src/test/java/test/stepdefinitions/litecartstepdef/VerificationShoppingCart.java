package test.stepdefinitions.litecartstepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import test.pages.PageFactory;
import test.pages.litecart.HomePageLiteCart;
import test.pages.litecart.ProductCardPage;
import test.pages.litecart.ShoppingCart;

public class VerificationShoppingCart {

    private HomePageLiteCart homePageLiteCart = (HomePageLiteCart) PageFactory.getPageByIdentifier(HomePageLiteCart.PAGE_IDENTIFIER);
    private ProductCardPage productCardPage = (ProductCardPage) PageFactory.getPageByIdentifier(ProductCardPage.PAGE_IDENTIFIER);
    private ShoppingCart shoppingCart = (ShoppingCart) PageFactory.getPageByIdentifier(ShoppingCart.PAGE_IDENTIFIER);

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

    @And("^open Shopping Card page$")
    public void openShoppingCardPage() {
        productCardPage.openCheckOutPage();
    }

    @And("^click Remove button$")
    public void clickRemoveButton() {
        shoppingCart.getButtonRemoveCartItem().click();
    }

    @Then("^Shopping Cart became empty$")
    public void shoppingCartBecameEmpty() {
        Assert.assertEquals(shoppingCart.NoItemCheck(), "There are no items in your cart.");
    }

}
