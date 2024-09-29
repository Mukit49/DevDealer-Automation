package org.example;

import org.openqa.selenium.WebDriver;
import org.example.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;


import java.sql.Driver;
import java.time.Duration;
public class BaseClass {


    public void chromeDriverSetup(){
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get("https://devdealer.fur4.com/");
    }
}
