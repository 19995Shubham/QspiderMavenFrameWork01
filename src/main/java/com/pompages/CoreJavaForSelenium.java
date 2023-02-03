package com.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSelenium {

    @FindBy(xpath = "//a[text() = ' Core Java For Selenium Trainin']")
    private WebElement selenium;

    public CoreJavaForSelenium(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void seleniumCourse()
    {
        selenium.click();
    }
}
