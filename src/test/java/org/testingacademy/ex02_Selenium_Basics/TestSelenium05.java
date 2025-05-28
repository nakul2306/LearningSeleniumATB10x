package org.testingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {
   // public static void main(String[] args) {
 @Test
       public  void test_selenium05(){
        WebDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com" );

        driver.quit();

    }
}
