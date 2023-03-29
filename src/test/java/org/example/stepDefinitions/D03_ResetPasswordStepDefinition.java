package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.example.pages.P03_ResetPassword;
import org.testng.asserts.SoftAssert;


public class D03_ResetPasswordStepDefinition {
    P03_ResetPassword register = new P03_ResetPassword();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to logging page")
    public void log(){
        register.log().click();
    }

    @When("user clicks on forget password")
    public void forgetPassword() { register.forgetPassword().click();    }

    @And("user enter valid email \"adhamagdyoussef@gmail.com\"")
    public void validMail(){ register.validMail().sendKeys("adhamagdyoussef@gmail.com");          }

    @And("user click reset button")
    public void resetButton(){    register.resetButton().click();    }

    @Then("\"Email with instructions has been sent to you.\" message is displayed")
    public void instructionMessage(){
        softAssert.assertTrue(register.instructionMessage().getText().contains("Email with instructions has been sent to you."));

    }
}


