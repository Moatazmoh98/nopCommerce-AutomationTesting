package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver = null;


    @Before
    public static void openBrowser() {
        //1- Bridge
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\nopCommerce-AutomationTesting-main\\Drivers\\geckodriver.exe");

        //2- Create new object from firefoxDriver
        driver = new FirefoxDriver();

        //3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //4- Navigate to the website
        driver.navigate().to("https://demo.nopcommerce.com/");


    }

    @After
    public static void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
