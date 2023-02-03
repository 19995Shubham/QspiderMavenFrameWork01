package com.scripts;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.genericlibe.BaseClass;
import com.pompages.CoreJavaForSelenium;
import com.pompages.SkillRaryPage;
import com.pompages.WishList;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test3 extends BaseClass
{
@Test
    public void tc3() throws IOException, InterruptedException {
    SkillRaryPage s = new SkillRaryPage(driver);
    s.searchtextbox(pdata.getData("searchtextbox"));
    s.searchboxcbtn();

    CoreJavaForSelenium cjs = new CoreJavaForSelenium(driver);
    cjs.seleniumCourse();

    WishList w = new WishList(driver);
    w.popupCancel();
    driverUtilites.switchToFrame(driver);
    w.playbtnIcon();
    Thread.sleep(10000);
  //  w.pausebtnIcon();
    driverUtilites.swithcBackFrame(driver);
    w.addtoWishlistbtn();
}

}
