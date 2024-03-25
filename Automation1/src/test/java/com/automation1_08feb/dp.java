package com.automation1_08feb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class dp extends TestBase{


    WebDriverWait wait = new WebDriverWait(driver2, WAIT_DURATION_MAX);
    @BeforeTest
    public void set(){
        Login();
        login2();
    }
    //FluentWait wait = new FluentWait(driver1)
    @Test(priority = 1)
    public void Dpcall() throws InterruptedException{

//        String originalWindow = driver.getWindowHandle();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver1.findElement(By.xpath("//*[@id=\"dt5\"]")).click();
        driver1.getWindowHandles().forEach(tab->driver1.switchTo().window(tab));
        ////*[@id="header"]/div/div/nav/ol[2]/li[1]/a
//        String childwid= driver.getWindowHandle();
//        driver.switchTo().(childwid);
//       Wait.until(numberOfWindowsToBe(2));
        driver1.findElement(By.id("dt1")).click();
        driver1.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys("8622782491");
        driver1.findElement(By.xpath("//*[@id=\"new-call-make-call\"]")).click();

        options2.setExperimentalOption("prefs",pref);

        options2.addArguments("--use-fake-ui-for-media-stream");
//        options.addArguments("use-fake-device-for-media-stream");
        options2.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));


        //Alert alert=driver1.switchTo().alert();
        //alert.accept();

        Thread.sleep(5000);
//
//*[@id="dt5"]

//        try {
//            Alert alert = driver2.switchTo().alert();
//            alert.accept();
//        }

    }
    @Test(priority = 2)
    public  void answercall() throws  InterruptedException{
        driver2.findElement(By.xpath("//*[@id=\"dt5\"]")).click();
        //driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver2.getWindowHandles().forEach(tab->driver2.switchTo().window(tab));
        options2.addArguments("--use-fake-ui-for-media-stream");
        options2.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        WebElement e2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("incoming-call-answer")));
        e2.click();
        //driver2.findElement(By.xpath("//*[@id=\"call-incoming-answer\"]/span")).click();
       // driver2.findElement(By.xpath("//*[@id=\"call-incoming-answer\"]/span"));
        System.out.println("Answered the call");
        Thread.sleep(5000);
        WebElement e3= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"call-bar-container\"]/div/div/div/section/div/div[3]/div[3]/button")));
        e3.click();
        System.out.println("Ended call");
////*[@id="dt316"]
    }

    @Test(priority = 3)
    public void tear(){
            Logout();
            //Logout2();
    }
}
//*[@id="header"]/div/div/nav/ol[2]/li[1]/a/div
//*[@id="new-call-make-call"]
//*[@id="call-incoming-answer"]/span


