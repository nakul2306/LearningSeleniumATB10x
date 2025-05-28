package org.testingacademy.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Open the app.vwo.com and verify the title!")

    @Test
    public void test_Selenium02() {
        // Open the URL
        EdgeDriver driver = new EdgeDriver();

        // Navigate to URL --> Get the URL
        driver.get("https://app.vwo.com");

        //Assert the URL
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        driver.quit();

    }


}
