package com.advantageonlineshopping.pages;

import com.advantageonlineshopping.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }



}
