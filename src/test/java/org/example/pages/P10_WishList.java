package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P10_WishList {



    public WebElement wishlistButton() {
        WebElement wishlistButton = Hooks.driver.findElement(By.xpath("(//div[@class='buttons'])[3]/button[3]"));
        return wishlistButton;
    }

    public WebElement wishListLinkButton() {
        WebElement wishListLinkButton = Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        return wishListLinkButton;
    }

    public WebElement successMessageAdd() {
        WebElement successMessageAdd = Hooks.driver.findElement(By.id("bar-notification"));
        return successMessageAdd;
    }


    public WebElement wishlistPage() {

        return wishlistPage();            }

    public WebElement productQuantity() {
        WebElement productQuantity = Hooks.driver.findElement(By.className("qty-input"));
        return productQuantity;
    }

       }

