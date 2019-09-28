package com.qa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseMovement {
    static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\IntelliJDemo\\src\\main\\java\\com\\qa\\driverexes\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com/login.cfm");
    }

    @Test
    public void doLogin(){
        driver.findElement(By.name("username")).sendKeys("Naveenk");
        driver.findElement(By.name("password")).sendKeys("Test123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String title = driver.getTitle();
        System.out.println("Title of page is :" + title);
        Assert.assertEquals(title, "CRMPRO123");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
