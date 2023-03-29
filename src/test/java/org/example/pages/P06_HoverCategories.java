package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_HoverCategories {



    public WebElement pageTitle() {
        WebElement pageTitle = Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        return pageTitle;
    }
    }
