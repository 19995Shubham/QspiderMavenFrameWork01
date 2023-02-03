package com.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event;

public class AddToCartPage {

    @FindBy(id = "add")
    private WebElement addbutton;

    @FindBy(xpath = "(//button[@type = 'submit'])[2]")
    private WebElement addtocart;

    public AddToCartPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public WebElement getAddbutton() {
        return addbutton;
    }

    public void addtocartButton()
    {
        addtocart.click();
    }


}
