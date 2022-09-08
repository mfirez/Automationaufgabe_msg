package com.advantageonlineshopping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(id = "menuCart")
    public WebElement cartMenu_loc;

    @FindBy(id = "checkOutPopUp")
    public WebElement checkOutPopUp_loc;




}
