package com.scripts;

import com.genericlibe.BaseClass;
import com.pompages.AddToCartPage;
import com.pompages.SkillRaryDemoPage;
import com.pompages.SkillRaryPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test1 extends BaseClass {
    @Test
    public void tc1() throws IOException, InterruptedException {
        String actualTitle = driver.getTitle();
        String expectedTitle = pdata.getData("Title");
        Assert.assertEquals(actualTitle,expectedTitle,"Title not matched");

        SkillRaryPage sp = new SkillRaryPage(driver);
        sp.popCancel();
        sp.getgearbutton();
        sp.getCountgears();
        sp.skillRaryDemoApplicaiton();

        driverUtilites.switchTabs(driver);
        SkillRaryDemoPage sd = new SkillRaryDemoPage(driver);
        driverUtilites.mouseHover(driver,sd.getCoursetab());
        sd.getCourseTextCount();
        sd.seleniumTraining();

        AddToCartPage ak = new AddToCartPage(driver);
        driverUtilites.doubleClick(driver, ak.getAddbutton());
        ak.addtocartButton();
        driverUtilites.alertPopUP(driver);

    }
}