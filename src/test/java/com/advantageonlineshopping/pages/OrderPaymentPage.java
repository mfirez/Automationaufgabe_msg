package com.advantageonlineshopping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPaymentPage extends BasePage{

    @FindBy(xpath = "//button[@id='next_btn']")
    public WebElement nextButton_loc;

    @FindBy(name = "safepay_username")
    public WebElement safePayUsername_loc;

    @FindBy(xpath = "//input[@name='safepay_password']")
    public WebElement safePayPassword_loc;

    @FindBy(id = "pay_now_btn_SAFEPAY")
    public WebElement payNowButton_loc;

    @FindBy(xpath = "(//a[@class='floater ng-binding'])[2]")
    public WebElement totalPrice;

}
