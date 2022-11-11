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
    public WebElement select_item1 (WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='inventory_list']/div[1]/div/a"));
        return element;
    }
    public WebElement select_item2 (WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='inventory_list']/div[2]/div/a"));
        return element;
    }
    public WebElement select_item3 (WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='inventory_list']/div[3]/div/a"));
        return element;
    }
    public WebElement back_to_products (WebDriver driver){
        element = driver.findElement(By.id("back-to-products"));
        return element;
    }


}
