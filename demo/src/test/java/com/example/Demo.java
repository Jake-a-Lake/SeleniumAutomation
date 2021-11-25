package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.whattomine.com");
        Thread.sleep(3000);
        driver.get("https://www.farmerbrothers.com");

        driver.quit();

    }

    public void sampleMethod()
    {
        System.out.println("This is a sample method");
    }
}