package com.genericlibe;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShot {

    public void getScreenShot(WebDriver driver, String name) throws IOException {
        Date d = new Date();
        String currentDate = d.toString().replaceAll(":", "-");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(AutoConstant.photoPath+currentDate+name+".png");
        try {
            FileUtils.copyFile(src,dest);
        } catch (IOException e) {
            throw new RuntimeException(e);        //clear some points on this
        }
    }
}