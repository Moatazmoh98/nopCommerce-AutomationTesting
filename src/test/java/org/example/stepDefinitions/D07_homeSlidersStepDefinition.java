package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_HomeSliders;
import org.junit.Assert;

public class D07_homeSlidersStepDefinition {
    P07_HomeSliders register = new P07_HomeSliders();

    String nokiaDerails = "https://demo.nopcommerce.com/nokia-lumia-1020";
    String iphoneDetails = "https://demo.nopcommerce.com/iphone";


   @Given("user at homepage")
   public void homepage() {    register.homepage().click();         }

    @When("user click on first slider with nokia image")
    public void nokiaSlider() {  register.nokiaSlider().click();      }

      @Then("user navigate to nokia product details page")
    public void nokiaDetails() {
       String nokiaActual = Hooks.driver.getCurrentUrl();
       Assert.assertEquals(nokiaActual, nokiaDerails);
    }

    @When("user click on second slider with iphone image")
    public void iphoneSlider() {  register.iphoneSlider().click();      }

    @Then("user navigate to iphone product details page")
    public void iphoneDetails() {
      String iphoneActual = Hooks.driver.getCurrentUrl();
      Assert.assertEquals(iphoneActual, iphoneDetails);
    }
}
