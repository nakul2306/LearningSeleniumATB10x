package org.testingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium13{

    @Test
    public void test_selenium13(){
        WebDriver driver = new ChromeDriver();
        driver.get("bing.com");   // Will Not Work , HTTPS is required.
        driver.quit();

        //driver.navigate().to("bing.com");   // Will Not Work , HTTPS is required.

    }
}
