package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
    WebElement element ;

    public WebElement login_button (WebDriver driver){
        element = driver.findElement(By.id("login-button"));
        return element;
    }
    public WebElement username (WebDriver driver){
        element = driver.findElement(By.id("user-name"));
        return element;
    }
    public WebElement password (WebDriver driver){
        element = driver.findElement(By.id("password"));
        return element;
    }
}
