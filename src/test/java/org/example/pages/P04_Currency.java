package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
//import org.testng.asserts.SoftAssert;

public class P04_Currency {

    public WebElement login(){
        WebElement login = Hooks.driver.findElement(By.className("ico-login"));
        return login;
    }
    public WebElement emailLogin() {
        WebElement emailLogin = Hooks.driver.findElement(By.id("Email"));
        return emailLogin;
    }

    public WebElement passwordLogin(){
        WebElement passwordLogin = Hooks.driver.findElement(By.id("Password"));
        return passwordLogin;
    }

    public WebElement loginEnter(){
        WebElement loginEnter = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return loginEnter;
    }


    public WebElement currencyList() {
        WebElement currencyList = Hooks.driver.findElement(By.id("customerCurrency"));
        Select select = new Select(currencyList);
        select.selectByVisibleText("Euro");
        return currencyList;
    }

    public List<WebElement> prices() {
        List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\""));
        return prices;
    }

    }

