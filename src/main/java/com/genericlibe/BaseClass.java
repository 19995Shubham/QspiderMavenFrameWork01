package com.genericlibe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;
    public PropertyFile pdata = new PropertyFile();
    public WebDriverUtilites driverUtilites = new WebDriverUtilites();

    @BeforeMethod
    public void openApp() throws IOException
    {
        WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get(pdata.getData("url"));
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeApp(ITestResult res) throws IOException {
       int status =  res.getStatus();
       String name = res.getName();
       if(status == 2)   //for fail test and for pass 1 for skip pass 3
       {
           ScreenShot sc = new ScreenShot();
           sc.getScreenShot(driver, name);
       }
        driver.quit();
    }
}
