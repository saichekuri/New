package com.automation1_08feb;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Settings extends TestBase {

    @Test(priority = 1)
    public void s() {
        Login();
        driver1.findElement(By.xpath("//*[@id=\"dt2\"]/g/path[2]")).click();
        String tit = driver1.getTitle();
        System.out.println(tit);

    }
}
//*[@id="dt2"]/g/path[1]
//*[@id="dt2"]
//*[@id="admin-logo"]/a/div
//#dt2 > g > path:nth-child(2)