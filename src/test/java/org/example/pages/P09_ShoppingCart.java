package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_ShoppingCart {


        public WebElement navigateToBooks() {
        WebElement navigateToBooks = Hooks.driver.findElement(By.cssSelector("a[href=\"/books\"]"));
        return navigateToBooks;
    }

    public WebElement addToCartBook() {
        WebElement addToCartBook = Hooks.driver.findElement(By.cssSelector("div > button[class=\"button-2 product-box-add-to-cart-button\"]"));
        return addToCartBook;
    }

    public WebElement navigateToShoppingCart() {
        WebElement navigateToShoppingCart = Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]"));
        return navigateToShoppingCart;
    }

    public WebElement addMessage() {
        WebElement addMessage = Hooks.driver.findElement(By.id("bar-notification"));
        return addMessage;
    }

    public WebElement productQty() {
        WebElement productQty = Hooks.driver.findElement(By.className("qty-input"));
        return productQty;
    }
}
