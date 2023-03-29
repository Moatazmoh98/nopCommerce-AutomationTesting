package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.testng.asserts.SoftAssert;

public class P02_Login {
     public WebElement loginLink(){
        WebElement login = Hooks.driver.findElement(By.className("ico-login"));
        return login;
             }

     public WebElement validEmail(){
        WebElement validEmail = Hooks.driver.findElement(By.id("Email"));
        return validEmail;
     }
     public WebElement validPassword(){
         WebElement validPassword = Hooks.driver.findElement(By.id("Password"));
         return validPassword;
     }
     public WebElement loginButton(){
         WebElement loginButton = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
         return loginButton;
     }
     public WebElement invalidEmail() {
         WebElement invalidEmail = Hooks.driver.findElement(By.id("Email"));
         return invalidEmail;
     }
     public WebElement invalidPassword() {
         WebElement invalidPassword = Hooks.driver.findElement(By.id("Password"));
         return invalidPassword;
     }


     public WebElement unSuccessMsg() {
         WebElement unSuccessMsg = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
         return unSuccessMsg;
     }
   }
