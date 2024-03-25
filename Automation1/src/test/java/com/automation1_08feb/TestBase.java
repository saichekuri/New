package com.automation1_08feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;

public class TestBase {
    //ChromeOptions options = new ChromeOptions();
    EdgeOptions options2=new EdgeOptions();
    HashMap<String,Integer> con_settings=new HashMap<String,Integer>();
    HashMap<String,Object> profiles=new HashMap<String,Object>();
    HashMap<String,Object> pref=new HashMap<String,Object>();
    EdgeDriver driver1= new EdgeDriver(options2);
    EdgeDriver driver2=new EdgeDriver(options2);
    String originalWindow = driver1.getWindowHandle();
    String originalwind2=driver2.getWindowHandle();
    protected static final Duration WAIT_DURATION_MAX=Duration.ofSeconds(20);

    public  void Login() {
        con_settings.put("media-stream",1);
        profiles.put("managed-default-settings",con_settings);
        pref.put("profile",profiles);
        //sai3-(862) 227-4855
        driver1.get("https://dialpadbeta.com/login");
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver1.manage().window().maximize();
        driver1.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/div[1]/label/div/input")).sendKeys("fanoxi5131@ricorit.com");
        driver1.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/div[2]/div/label/div/input")).sendKeys("Sai@12345678");
        driver1.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/button")).click();
        //options.addArguments("--use-fake-ui-for-media-stream");
        String s = driver1.getTitle();
        System.out.println(s);
    }

    @Test
    public void login2(){
//sai4-(862) 278-2491
        driver2.get("https://dialpadbeta.com/login");
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver2.manage().window().maximize();
        driver2.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/div[1]/label/div/input")).sendKeys("raweti9757@tupanda.com");
        driver2.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/div[2]/div/label/div/input")).sendKeys("Sai@12345678");
        driver2.findElement(By.xpath("//*[@id=\"dt-panel-3\"]/div/form/button")).click();
        String s2=driver2.getTitle();
        System.out.println(s2);


    }
    public void Logout(){
        driver1.switchTo().window(originalWindow);
        driver1.findElement(By.id("DropdownMenu__label2")).click();
        driver1.findElement(By.xpath("//*[@id=\"DropdownMenu__content3\"]/li[4]/span")).click();
       // driver1.quit();
    }
    public void Logout2(){
        driver2.switchTo().window(originalwind2);
        driver2.findElement(By.id("DropdownMenu__label2")).click();
        driver2.findElement(By.xpath("//*[@id=\"DropdownMenu__content3\"]/li[4]/span")).click();
       // driver2.quit();
    }
}
//*[@id="dt26"]/div[1]
//*[@id="DropdownMenu__label2"]
//*[@id="DropdownMenu__content3"]/li[4]/span
//*[@id="dt-panel-3"]/div/form/div[1]/label/div/input
//*[@id="header_profile_menu_anchor_button"]

//from profile
//*[@id="DropdownMenu__label2"]/div/img
//*[@id="dt510"]/div/section/div
//*[@id="dt364"]
//*[@id="header-profile-menu-content"]/div[2]
//*[@id="dt374"]/div/section/div
//*[@id="header-profile-menu-content"]/div[2]
//*[@id="dt417"]/div/section/div
