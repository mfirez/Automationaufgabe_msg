package com.advantageonlineshopping.step_definitions;

import com.advantageonlineshopping.pages.BasePage;
import com.advantageonlineshopping.pages.HomePage;
import com.advantageonlineshopping.utilities.BrowserUtils;
import com.advantageonlineshopping.utilities.ConfigurationReader;
import com.advantageonlineshopping.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchProductStepDefs extends BasePage {

    HomePage homePage = new HomePage();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {

        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(3);

    }

    @Given("the user click to the search button")
    public void the_user_click_to_the_search_button() {

        BrowserUtils.waitFor(2);
        WebElement searchButton =Driver.get().findElement(By.xpath("(//*[@id='menuSearch'])[1]"));
        searchButton.click();

    }

    @When("the user enters product name {string}")
    public void the_user_enters_product_name(String product) {

        WebElement productSearch = Driver.get().findElement(By.xpath("//input[@id='autoComplete']"));
        WebElement searchButton =Driver.get().findElement(By.xpath("(//*[@id='menuSearch'])[1]"));
        productSearch.sendKeys(product);
        BrowserUtils.waitFor(2);
        searchButton.click();

    }

    @When("the user click product")
    public void the_user_click_product() {

        //HP Z3200 WIRELESS MOUSE
        BrowserUtils.waitFor(1);
        WebElement mause = Driver.get().findElement(By.xpath("//img[@id='28']"));
        mause.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the user should be able to see the product {string}")
    public void the_user_should_be_able_to_see_the_product(String product) {

        BrowserUtils.waitFor(4);
        String actualResult = Driver.get().findElement(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']")).getText();
        Assert.assertEquals("Verify that product name",product,actualResult);

        WebElement homaPage = Driver.get().findElement(By.xpath("//a[@class='ng-scope']"));
        homaPage.click();

    }


}
