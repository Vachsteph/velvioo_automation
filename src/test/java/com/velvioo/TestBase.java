package com.velvioo;

import config.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void logIn() {
        driver = WebDriverManager.chromedriver().create();
        driver.get(Configuration.ADMIN_URL);

        WebElement username = driver.findElement(By.cssSelector("input[name='email']"));
        username.sendKeys("");

        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("");

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-block.btn-md.btn-primary.light.m-b-20.ripple.text-center"));
        loginButton.click();

       waitForFinding();


    }
    @AfterMethod
    public void driverQuit() {

        driver.quit();

    }

    public void waitForFinding(){

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            // handle exception
        }
    }

    public void scrollPage(WebElement element){

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);


    }


    }

