package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDefinition {

    P01_Register register = new P01_Register();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to register page")
    public void registrationPage() {
        register.registerLink().click();
    }

    @When("user select gender type")
    public void genderType() {
        register.genderType().click();
    }

    @And("user enters first name \"automation\"")
    public void firstName() {
        register.firstName().sendKeys("automation");
    }

    @And("user enters last name \"tester\"")
    public void lastName() {
        register.lastName().sendKeys("tester");
    }

    @And("user enters date of birth")
    public void DOB() {
        Select select = new Select(register.dayOfBirth());
        select.selectByIndex(10);

        select = new Select(register.monthOfBirth());
        select.selectByValue("10");

        select = new Select(register.yearOfBirth());
        select.selectByVisibleText("2010");

    }

    @And("user enters email \"adhamagdyoussef@gmail.com\"")
    public void email() {
        register.email().sendKeys("adhamagdyoussef@gmail.com");
    }

    @And("user enters password \"P@ssw0rd\"")
    public void password() {
        register.password().sendKeys("P@ssw0rd");
    }

    @And("user confirms password \"P@ssw0rd\"")
    public void confirm_password() {
        register.confirm_password().sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void clickRegisterButton() {
        register.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMsg() {
        softAssert.assertTrue(register.successMsg().getText().contains("Your registration completed"));
        //    softAssert.assertEquals("#4cb17c", (Color.fromString("rgba(76, 177, 124, 1").asHex()));
        softAssert.assertAll();

    }
}


