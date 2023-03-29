package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_Search {


    public WebElement productName() {
        WebElement productName = Hooks.driver.findElement(By.id("small-searchterms"));
        return productName;
    }


    public WebElement searchBtn() {
        WebElement searchBtn = Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        return searchBtn;
    }
     public List<WebElement>productItems() {
        List<WebElement> productItems = Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]"));
        return productItems;
     }

     public WebElement sku() {
        WebElement sku = Hooks.driver.findElement(By.cssSelector("div>div[class=\"sku\"]"));
        return sku;
     }

     public WebElement detailsBtn() {
        WebElement detailsBtn = Hooks.driver.findElement(By.cssSelector("div[class=\"item-box\"]"));
        return detailsBtn;
     }
}