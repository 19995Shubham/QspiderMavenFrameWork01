package com.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class TestingPage {

    @FindBy(xpath = "(//a[text()= 'Selenium Training'])[2]")
    private WebElement seleniumtraining;

    public WebElement getSeleniumtraining() {
        return seleniumtraining;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getFacebook() {
        return facebook;
    }

    @FindBy(id = "mycart")
    private WebElement cart;

    @FindBy(xpath = "(//i[@class = 'fa fa-facebook'])[2]")
    private WebElement facebook;

    public TestingPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void facebookIcon()
    {
        facebook.click();
        Assert.assertTrue(facebook.isDisplayed());
    }


}
