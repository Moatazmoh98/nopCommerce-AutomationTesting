package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_ShoppingCart;
import org.example.pages.P10_WishList;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D09_shoppingCartStepDefinition {
    P09_ShoppingCart register = new P09_ShoppingCart();
    SoftAssert softAssert = new SoftAssert();



    @Given("User navigate to Books category page")
    public void navigateToBooks() {  register.navigateToBooks().click();      }

    @When("User click on Add To Cart button for a book")
    public void addToCartBook() {  register.addToCartBook().click();      }

    @And("success message appears which confirm adding the product to shopping cart")
    public void addMessage() {
        String expectedMessage="The product has been added to shopping cart";
        String actualMessage= register.addMessage().getText();
        softAssert.assertTrue(actualMessage.contains(expectedMessage));  }

    @And("User navigate to Shopping Cart page")
    public void navigateToShoppingCart() {  register.navigateToShoppingCart().click();     }

    @Then("Shopping cart will contain all selected products")
    public void shoppingCart_selectedProducts() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("wishlist"));
        String productQuantity = register.productQty().getAttribute("value");
        Assert.assertNotEquals(productQuantity ,0);
    }

}