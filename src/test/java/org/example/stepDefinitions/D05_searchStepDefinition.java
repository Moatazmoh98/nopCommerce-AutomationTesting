package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_Search;
import org.testng.asserts.SoftAssert;

public class D05_searchStepDefinition {
    P05_Search register = new P05_Search();

    SoftAssert softAssert = new SoftAssert();

    @Given("user enters product name {string} in the test search field at home page")
    public void productName(String arg0)  {  register.productName().sendKeys(arg0);   }

    @When("user clicks on search button")
    public void searchBtn() { register.searchBtn().click();    }

    @And("user click on product detail page")
    public void detailsBtn() {  register.detailsBtn().click();    }


    @Then("search results appears with products related to the search name {string} in the search text field")
    public void searchResultName(String arg0) {
        String expectedUrl="https://demo.nopcommerce.com/search?q=";
        String actualUrl=Hooks.driver.getCurrentUrl();
       softAssert.assertTrue(actualUrl.contains(expectedUrl));
        for (int i =0 ; i<register.productItems().size();i++)
        {  String productItem = register.productItems().get(i).getText().toLowerCase();
            softAssert.assertTrue(productItem.contains(arg0));
          //  softAssert.assertAll();
        }
         }


    @Given("user enters product sku {string} in the test search field at home page")
    public void productSku(String arg0) {    register.productName().sendKeys(arg0);    }


    @Then("search results appears with products related to the search sku {string} in the search text field")
    public void searchResultSku(String arg0) {
        String productItem = register.sku().getText();
        softAssert.assertTrue(productItem.contains(arg0));
        softAssert.assertAll();
    }
}
