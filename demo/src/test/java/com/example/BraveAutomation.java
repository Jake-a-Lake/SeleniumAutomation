package com.example;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotation.Test;
import org.testng.annotations.TestInstance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;



public class BraveAutomation {
    @Test
    public void braveAutomation()
    {
        WebDriverManager.chromedriver().driverVersion("96.0.4664.45").setup();
        //System.setProperty("webdriver.chrome.driver","D:\\TEMP\\chromedriver_win32\\chromdriver_win32.exe");
        final ChromeOptions options = new ChromeOptions()
                .setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        final WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.whattomine.com");
        driver.get("https://www.msn.com");

        driver.quit();
    }
}