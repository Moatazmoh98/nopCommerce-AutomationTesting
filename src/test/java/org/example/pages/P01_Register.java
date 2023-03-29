package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class P01_Register {
    public WebElement registerLink()
    {
        WebElement reg = Hooks.driver.findElement(By.className("ico-register"));
        return reg;
    }
    public  WebElement genderType()
    {
        WebElement genderType = Hooks.driver.findElement(By.id("gender-male"));
        return genderType;
    }
    public WebElement firstName()
    {
        WebElement firstName = Hooks.driver.findElement(By.id("FirstName"));
        return firstName;
    }
    public WebElement lastName()
    {
        WebElement lastName = Hooks.driver.findElement(By.id("LastName"));
        return lastName;
    }
    public WebElement dayOfBirth()
    {
        WebElement dayOfBirth = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return dayOfBirth;
    }
    public WebElement monthOfBirth()
    {
        WebElement monthOfBirth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return monthOfBirth;
    }
    public WebElement yearOfBirth()
    {
        WebElement yearOfBirth = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return yearOfBirth;
    }
    public  WebElement email()
    {
        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }
    public WebElement password()
    {
        WebElement password = Hooks.driver.findElement(By.id("Password"));
        return password;
    }
    public WebElement confirm_password()
    {
        WebElement confirm_password = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirm_password;
    }
    public WebElement registerButton()
    {
        WebElement registerButton = Hooks.driver.findElement(By.id("register-button"));
        return registerButton;
    }
    

    public WebElement successMsg() {
        WebElement successMsg = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return successMsg;
    }
}
