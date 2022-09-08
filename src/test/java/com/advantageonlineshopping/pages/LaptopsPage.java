package com.advantageonlineshopping.pages;

import com.advantageonlineshopping.utilities.BrowserUtils;
import com.advantageonlineshopping.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class LaptopsPage extends BasePage{

    @FindBy(xpath = "//a[@class='ng-binding']")
    public WebElement laptopsPage_loc;

    @FindBy(xpath = "//h4[@id='accordionColor']")
    public WebElement colorLaptops_loc;

    @FindBy(xpath = "//*[@title='GRAY']")
    public WebElement colorGrayLaptop_loc;

    @FindBy(xpath = "//*[@title='WHITE']")
    public WebElement colorWhiteLaptop_loc;

    @FindBy(xpath = "//img[@id='10']")
    public WebElement grayLaptops10_loc;

    @FindBy(xpath = "//img[@id='9']")
    public WebElement whiteLaptops9_loc;

    @FindBy(xpath = "//button[@class='roboto-medium ng-scope']")
    public WebElement addToCart_loc;

    @FindBy(xpath = "//div[@class='plus']")
    public WebElement quantityPlus_loc;



}
