package com.testmethod;

import com.base.PageObjects;
import com.base.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestFunctionality {
    base obj = new base();
    public WebDriver driver ;
    public WebElement element;
    String url = "https://www.saucedemo.com/";
    String ID = "standard_user";
    String PWD = "secret_sauce";
    String Browsertype = "Chrome";
    PageObjects obj1 = new PageObjects();

    void setupdriver(){
        driver = obj.driverinstance(Browsertype);
    }

    void open_application(){
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    void  login_to_application() throws InterruptedException {
        setupdriver();
        open_application();
        element = obj1.username(driver);
        element.sendKeys(ID);
        element = obj1.password(driver);
        element.sendKeys(PWD);
        element = obj1.login_button(driver);
        Thread.sleep(2000);
        element.click();
        Thread.sleep(2000);
        List<WebElement> list =  driver.findElements(By.xpath("//div[@class='pricebar']/button"));
        int cnt = list.size();
        for(int i=1;i<=3;i++) {
            Random random = new Random();
            int index = random.nextInt(cnt);
            list.get(index).click();
            Thread.sleep(2000);
        }
    }
}
