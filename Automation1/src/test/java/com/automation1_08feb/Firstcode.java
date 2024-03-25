package com.automation1_08feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

import javax.security.auth.login.LoginContext;
import java.time.Duration;

public class Firstcode {
    WebDriver driver = new ChromeDriver();

    @Test
    public void DpLoginPage() {
        driver.get("https://dialpadbeta.com/login");
        String s = driver.getCurrentUrl();
        System.out.print(s);

    }

    @Test
    public void UserName() {
        driver.get("https://dialpadbeta.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/div[1]/label/div/input")).sendKeys("tamesi9900@tospage.com");
        driver.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/div[2]/div/label/div/input")).sendKeys("Sai@12345678");
        driver.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/button")).click();

        driver.findElement(By.xpath("//*[@id=\"DropdownMenu__label2\"]/div/img")).click();
        driver.findElement(By.xpath("//*[@id=\"DropdownMenu__content3\"]/li[1]/span")).click();
        String T = driver.getCurrentUrl();
        System.out.println(T);
    }


    public static void main(String[] args){
    }
    // WebDriver driver= new ChromeDriver();
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // driver.manage().window().maximize();
    // driver.get("https://dialpadbeta.com/login");
    // driver.findElement(By.linkText("//*[@id=\"dt-panel-3\"]/div/button/span[2]")).click();
    //driver.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/div[1]/label/div/input")).sendKeys("pogef27317@tospage.com");
    //driver.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/div[2]/div/label/div/input")).sendKeys("Sai@12345678");
    //driver.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/button")).click();
    // String s=driver.getCurrentUrl();
    //System.out.print(s);
    //driver.quit();

}