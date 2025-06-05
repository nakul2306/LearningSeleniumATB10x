package org.testingacademy.ex_03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium18 {

    @Description("Verify vwo")
    @Test
    public void test_login_vwo() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        driver.manage().window().maximize();

        // <a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        //
        //</a>


//        // Link Text - Full Text Match
//        WebElement a_tag_free_trail_full_match = driver.findElement(By.linkText("Start a free trial"));
//        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}
//        a_tag_free_trail_full_match.click();


        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        //
        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...
        a_tag_partial_match.click();


        driver.quit();
        // It will close all the tabs. - session id == null


    }

}
