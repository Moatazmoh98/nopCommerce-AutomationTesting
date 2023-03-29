package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P06_HoverCategories;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class D06_hoverCategoriesStepDefinition {
    P06_HoverCategories register = new P06_HoverCategories();

    @Given("user hover to a category and click on one of its sub-categories")
    public void hoverCategory() throws InterruptedException {
        List<WebElement> categories = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        int randomNumber = new Random().nextInt(3);
        Actions hover = new Actions(Hooks.driver);
        hover.moveToElement(categories.get(randomNumber)).perform();
        String mainCategory = categories.get(randomNumber).getText();
        Thread.sleep(2000);

        List<WebElement>subCategories = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[\"+randomNumber+\" ]/ul[@class=\"sublist first-level\"]/li"));
        int randomNumberSub = new Random().nextInt(3);
        Actions hoverSub = new Actions(Hooks.driver);
        hoverSub.moveToElement(subCategories.get(randomNumberSub)).perform();
        String subCategory = subCategories.get(randomNumberSub).getText();
        System.out.println(subCategory);
        subCategories.get(randomNumberSub).click();
        Thread.sleep(2000);

            }
    @Then("user will navigate to a page contains products about that sub-category")
    public void pageTitle() {

          String expected = register.pageTitle().getText();
          String actual = Hooks.driver.getTitle();
          Assert.assertFalse(expected.contains(actual));


    }

}
