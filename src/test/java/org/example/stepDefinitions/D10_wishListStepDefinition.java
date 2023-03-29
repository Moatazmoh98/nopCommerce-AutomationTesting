package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_WishList;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D10_wishListStepDefinition {
    P10_WishList register = new P10_WishList();
    SoftAssert softAssert = new SoftAssert();

    @When("user click on add to wishlist button of product at home page")
       public void wishlistButton() { register.wishlistButton().click();
        register.wishListLinkButton().click();  }

    @And("success message appears which confirm adding the product")
       public void successMessageAdd() {
        String expectedMessage="The product has been added to your wishlist";
        String actualMessage= register.successMessageAdd().getText();
        softAssert.assertTrue(actualMessage.contains(expectedMessage));
        softAssert.assertEquals("#4bb07a", (Color.fromString("rgba(75, 167, 122, 1)").asHex()));

    }

    @And("user click on Wishlist link")
      public void wishListLinkButton() { register.wishListLinkButton().click();       }

    @Then("user will navigate to wishlist page which contain the product not equal zero")
      public void wishlistPage() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("wishlist"));
        String productQuantity = register.productQuantity().getAttribute("value");
        Assert.assertNotEquals(productQuantity ,0);
    }
}
