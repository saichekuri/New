package com.automation1_08feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Links extends TestBase {
    @Test
    public void links(){
        List<WebElement> links=driver1.findElements(By.tagName("a"));
        for(WebElement tag:links){
            System.out.println(tag.getAttribute("href"));
            System.out.println("total links"+tag.getSize());
        }


    }


}
