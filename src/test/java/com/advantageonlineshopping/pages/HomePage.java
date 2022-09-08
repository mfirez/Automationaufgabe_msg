package com.advantageonlineshopping.pages;

import com.advantageonlineshopping.utilities.BrowserUtils;
import com.advantageonlineshopping.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//a[@class='ng-scope']")
    public WebElement homePage_loc;

    //@FindBy(xpath = "(//*[@id='menuSearch'])[1]")
    //public WebElement searchButton_loc;

    @FindBy(xpath = "//a//*[@id=\"menuSearch\"]")
    public WebElement searchButton_loc;

    @FindBy(xpath = "//input[@id='autoComplete']")
    public WebElement enterProductName_loc;

    @FindBy(xpath = "//img[@id='28']")
    public WebElement HpZ3200WirelessMouse_loc;


    public void navigateToCategory_met(String category){

        WebElement navigateCategory = Driver.get().findElement(By.xpath("//*[@id='"+category+"Img']"));
        BrowserUtils.clickWithJS(navigateCategory);

    }

}
