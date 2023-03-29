package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class P03_ResetPassword {
     public WebElement log(){
        WebElement log = Hooks.driver.findElement(By.className("ico-login"));
        return log;
             }

     public WebElement validMail(){
        WebElement validMail = Hooks.driver.findElement(By.cssSelector("input[class=\"email\"]"));
        return validMail;
     }

     public WebElement forgetPassword(){
         WebElement forgetPassword = Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
         return forgetPassword;
     }

     public WebElement resetButton() {
         WebElement resetButton = Hooks.driver.findElement(By.cssSelector("button[name=\"send-email\"]"));
         return resetButton;
     }

     public WebElement instructionMessage() {
         WebElement instructionMessage = Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
         return instructionMessage;
     }

   }
