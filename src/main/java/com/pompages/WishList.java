package com.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {

    @FindBy(xpath = "//a[@class = 'close_cookies']")
    private WebElement popup;
    @FindBy(xpath = " //button[@aria-label='Play']")
    private WebElement playbtn;

    @FindBy(xpath = "//button[@aria-label='Pause']")
    private WebElement pausebtn;

    @FindBy(xpath = "//span[text() = 'Add To Wishlist']")
    private WebElement addtoWishlist;

    public WishList(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void playbtnIcon()
    {
        playbtn.click();
    }
    public void pausebtnIcon()
    {
        pausebtn.click();
    }
    public void addtoWishlistbtn()
    {
        addtoWishlist.click();
    }
    public void popupCancel()
    {
        popup.click();
    }

}
