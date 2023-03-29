package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Currency;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class D04_currenciesStepDefinition {
    P04_Currency register = new P04_Currency();



    @Given("User log in with email \"adhamagdyoussef@gmailcom\" and password \"P@ssw0rd\"")
    public void login() {  register.login().click();
        register.emailLogin().sendKeys("adhamagdyoussef@gmail.com");
        register.passwordLogin().sendKeys("P@ssw0rd");
        register.loginEnter().click();            }


    @When("user select Euro currency from currency dropdown list")
    public void currencyList() { register.currencyList().click();         }

    @Then("products price is shown in Euro")
    public void euroSymbolDisplayedOnProducts() {
        for (int x= 0; x < register.prices().size(); x++){
            String value = register.prices().get(x).getText();
            Assert.assertTrue(value.contains("€"));
        }

        }
    }


