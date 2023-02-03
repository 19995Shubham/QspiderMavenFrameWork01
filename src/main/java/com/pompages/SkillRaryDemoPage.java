package com.pompages;

import com.genericlibe.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkillRaryDemoPage extends BaseClass {

    @FindBy(id = "course")
    private WebElement coursetab;

    public  WebElement getCoursetab() throws IOException {
        String expectedCourseButtonText = pdata.getData("ExpectedCourseText");
        String actualCourseButtonText = coursetab.getText();
        Assert.assertEquals(expectedCourseButtonText,actualCourseButtonText);
        if(actualCourseButtonText.equalsIgnoreCase(expectedCourseButtonText)){
            System.out.println("Actual Course text "+ actualCourseButtonText);
        }
        else {
            System.out.println("Coure text not match");
        }
        return coursetab;
    }

    @FindBy(xpath = "(//a[text() = 'Selenium Training'])[1]")
    private WebElement seleniumtrainingtab;

    @FindBy(name = "addresstype")
    private WebElement coursedd;

    public SkillRaryDemoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void seleniumTraining()
    {
        seleniumtrainingtab.click();
    }

    public WebElement getCourseAdd() {
        return coursedd;
    }
    @FindBy(xpath = "//span[@class = 'wrappers']//a")
    private List<WebElement> courseTextCount;

    public List<WebElement> getCourseTextCount() {
        if(coursetab.isEnabled()) {
            System.out.println(courseTextCount.size());
            courseTextCount.forEach((e)-> System.out.println(e.getText()));
            //ArrayList<String> expectedCourseDropdowntext = new ArrayList<String>(Arrays.asList("Selenium Training\n" + "java\n" + "manual testing\n" + "C\n" , "DevOps\n"));
            ArrayList<String> expectedCourseDropdowntext = new ArrayList<>(Arrays.asList("Selenium Training" , "java" ,"manual testing" ,"C" , "DevOps"));
           // ArrayList<String> actualCourseDropdowntext = new ArrayList<>(Arrays.asList(add.r);
        }
        return courseTextCount;
    }
}
