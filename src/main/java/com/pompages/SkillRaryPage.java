package com.pompages;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
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

import static java.awt.SystemColor.text;

public class SkillRaryPage extends BaseClass {

    @FindBy(xpath = "//a[@class = 'close_cookies']")
    private WebElement popup;
    @FindBy(xpath = "(//a[text() = ' GEARS '])")
    private WebElement gearsbtn;

    @FindBy(xpath = "//ul[@class='dropdown-menu gear_menu']//li")
    private List<WebElement> countgears;

    @FindBy(xpath = "(//a[text() = ' SkillRary Demo APP'])[2]")
    private WebElement skillrearydemoapp;

    public List<WebElement> getCountgears() throws IOException {
        // countgears.forEach(e -> System.out.println(e.getText()));
        if (gearsbtn.isDisplayed()) {
            int countActual = countgears.size();
            int countExpected = Integer.parseInt(pdata.getData("Size"));
            Assert.assertEquals(countActual, countExpected, "Size in not match");
            System.out.println("Actual count of gear drop-down button is " + countActual + " Expected count " + countExpected);

            String[] expectedText = {"SKILLRARY WHITEBOARD", "SKILLRARY ESSAY", "SKILLRARY COMPILERS", "HTML EDITOR", "CODE.TYPE_SPEED", "SQL EDITOR", "SKILLRARY DEMO APP", "REQRES TEST API'S", "CGPA CALCULATOR"};
           ArrayList<String> expected = new ArrayList<String>(Arrays.asList(expectedText));
              ArrayList<String> gearsDropDownActualText = new ArrayList<>();
            for (WebElement storeTheTextOfTheGearsDropDown : countgears) {
                gearsDropDownActualText.add(storeTheTextOfTheGearsDropDown.getText());
                System.out.println(storeTheTextOfTheGearsDropDown.getText());
            }

            Assert.assertEquals(expected, gearsDropDownActualText,"Actual gears dropdown text not match with expected");
        }
        else{
            System.out.println("Gear button is not display");
        }
        return countgears;
    }

    @FindBy(name = "q")
    private WebElement searchtb;

    @FindBy(xpath = "//input[@type = 'submit']")
    private WebElement searchboxcbtn;

    public SkillRaryPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void getgearbutton() throws IOException {
        String expectedGearText = pdata.getData("gearExpectedText");
        String actualGearText = gearsbtn.getText();
       Assert.assertTrue(expectedGearText.equals(actualGearText),"NO both are not same");
        if(gearsbtn.isDisplayed())
        {
            Assert.assertTrue(expectedGearText.equals(actualGearText),"NO both are not same");
            System.out.println("Gear button dropdown expected result and actual result is same");
            gearsbtn.click();
        }
        else {
            System.out.println("fail");
        }

    }
    public void skillRaryDemoApplicaiton() throws IOException {
        if(skillrearydemoapp.isDisplayed()) {
            String actualSkillRaryDemoAppText = skillrearydemoapp.getText();
            String expectedSkillRaryDemoAppText = pdata.getData("ExpectedSkillRarydemoAppText");
            Assert.assertEquals(actualSkillRaryDemoAppText,expectedSkillRaryDemoAppText);
            skillrearydemoapp.click();
        }
        else {
            System.out.println("SkillRaryDemoApp not clickable");
        }
    }
    public void searchtextbox(String name)
    {
        searchtb.sendKeys(name);
    }
    public void searchboxcbtn()
    {
        searchboxcbtn.click();
    }
    public void popCancel(){
        popup.click();
    }

}
