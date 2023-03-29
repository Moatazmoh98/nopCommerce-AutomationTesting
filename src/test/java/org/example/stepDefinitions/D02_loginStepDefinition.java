package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;


public class D02_loginStepDefinition {
    P02_Login register = new P02_Login();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void loginLink(){
        register.loginLink().click();
    }

    @When("user login with valid email \"adhamagdyoussef@gmail.com\"")
    public void validEmail(){
         register.validEmail().sendKeys("adhamagdyoussef@gmail.com");
    }

    @And("user login with valid password \"P@ssw0rd\"")
    public void validPassword(){
         register.validPassword().sendKeys("P@ssw0rd");
    }

    @And("user clicks on login button")
    public void loginButton(){
         register.loginButton().click();
    }

    @Then("user login to the system successfully and return to home page")
    public void validLogin(){

          softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
          softAssert.assertAll();
    }

   @When("user login with invalid email \"adhamagdy@gmail.com\"")
    public void invalidEmail() { register.invalidEmail().sendKeys("adhamagdy@gmail.com");     }

   @And("user login with invalid password \"P@ssw0rdWrong\"")
    public void invalidPassword() { register.invalidPassword().sendKeys("P@ssw0rdWrong");     }

   @Then("user could not login to the system")
    public void unSuccessMsg() {

       softAssert.assertTrue(register.unSuccessMsg().getText().contains("Login was unsuccessful"));
       softAssert.assertEquals("#e4434b", (Color.fromString("rgba(228, 67, 75, 1)").asHex()));
       softAssert.assertAll();

   }
}

