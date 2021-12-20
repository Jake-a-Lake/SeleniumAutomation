package com.example;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotation.Test;
import org.testng.annotations.TestInstance;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class BraveAutomation {
    @Test
    //int sleepyTime = 120000;
    public void runBraveAutomation(int sleepyTime) throws InterruptedException
    {
        WebDriverManager.chromedriver().driverVersion("96.0.4664.45").setup();
        //System.setProperty("webdriver.chrome.driver","D:\\TEMP\\chromedriver_win32\\chromdriver_win32.exe");
        final ChromeOptions options = new ChromeOptions();
                //.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");                
                //.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe --profile-directory=" + "Default");
                options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
                options.addArguments("user-data-dir=C:/Users/Steve/AppData/Local/BraveSoftware/Brave-Browser/User Data/Otto");
        final WebDriver driver = new ChromeDriver(options);

        WebElement body = driver.findElement(By.tagName("body"));
        String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        Generator generator = new Generator();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.whattomine.com");
        try{
            //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/a")).sendKeys(Keys.CONTROL +"t");
            driver.findElement(By.cssSelector("body")).sendKeys(newTab);
           // driver.switchTo().window(tabs.get(1));
            //driver.get("http://google.com");
            //open link in new tab
            //driver.get("https://www.theepochtimes.com/china-news").sendKeys(newTab);
            //driver.switchTo().window(tabs.get(1)); //switches to new tab
            //driver.get("https://www.slickdeals.net").sendKeys(newTab);
            WebElement link = driver.findElement(By.xpath("/html/body/nav/div[2]/ul/li[2]/a"));
            new Actions(driver)
            .keyDown(Keys.CONTROL)
            .click(link)
            .keyUp(Keys.CONTROL)
            .build()
            .perform();
            Thread.sleep(sleepyTime);
        }
        catch(Exception ex)
        {
            System.out.println("Something didn't go right there {ex.Message}");
        }
        Thread.sleep(sleepyTime);
        String phrase = Generator.generateRandomPassword(5);
        driver.switchTo().window(tabs.get(0));
        //driver.get("https://duckduckgo.com/?q=%s".format(phrase));
        driver.get("https://duckduckgo.com/?q=christmas");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(1000,0)");
        Thread.sleep(sleepyTime);
        driver.get("https://www.theepochtimes.com/us-news");
        Thread.sleep(sleepyTime);
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
        
        driver.get("https://www.theepochtimes.com/c-us-politics");
        driver.get("https://www.theepochtimes.com/china-news");

        Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn/crypto-basics/plp-what-is-cryptocurrency?utm_source=google_search_nb&utm_medium=cpc&utm_campaign=11552175024&utm_content=113244324912&utm_term=learning%20crypto&utm_creative=478113585750&cb_device=c&cb_placement=&cb_country=us&cb_city=open&cb_language=en_us");
        // This  will scroll down the page by  1000 pixel vertical		
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
  
        Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn");
        // This  will scroll down the page by  1000 pixel vertical		
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn/market-updates/around-the-block-issue-20");
        // This  will scroll down the page by  1000 pixel vertical		
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
  
        Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn/crypto-basics/who-is-satoshi-nakamoto");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
  
        Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn/crypto-basics/who-is-satoshi-nakamoto#why-satoshi-might-want-to-remain-anonymous");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn/crypto-basics/understanding-crypto-taxes");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://bisontrails.co/");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn/crypto-basics/how-to-secure-crypto");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.theepochtimes.com/editions");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.wired.com/2015/12/bitcoins-creator-satoshi-nakamoto-is-probably-this-unknown-australian-genius/");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/analytics");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/about");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn/tips-and-tutorials");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        driver.get("https://www.coinbase.com/learn/market-updates/around-the-block-issue-19");
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(sleepyTime);
        // This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(4000,1000)");
          Thread.sleep(sleepyTime);
        
        // for( String tab : tabs) {
        //     driver.switchTo().window(tab);
        //     driver.close();
        // }
        driver.switchTo().window(tabs.get(0));
        driver.close();
        driver.quit();
        Thread.sleep(sleepyTime);

        runBraveAutomation(sleepyTime);

    }
}