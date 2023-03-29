package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_HomeSliders {

   public WebElement homepage() {
       WebElement homepage = Hooks.driver.findElement(By.xpath("//div[@class='header-logo']/a"));
       return homepage;
   }

    public WebElement nokiaSlider() {
        WebElement nokiaSlider = Hooks.driver.findElement(By.cssSelector("div[id=\"nivo-slider\"]"));
        return nokiaSlider;
    }

    public WebElement iphoneSlider() {
        WebElement iphoneSlider = Hooks.driver.findElement(By.cssSelector("div[id=\"nivo-slider\"]"));
        return iphoneSlider;
    }

}
