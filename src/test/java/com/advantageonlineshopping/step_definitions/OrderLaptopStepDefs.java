package com.advantageonlineshopping.step_definitions;

import com.advantageonlineshopping.pages.*;
import com.advantageonlineshopping.utilities.BrowserUtils;
import com.advantageonlineshopping.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class OrderLaptopStepDefs extends BasePage {

    HomePage homePage = new HomePage();
    LaptopsPage laptopsPage = new LaptopsPage();
    CartPage cartPage = new CartPage();
    RegisterPage registerPage = new RegisterPage();
    OrderPaymentPage orderPaymentPage = new OrderPaymentPage();
    Faker faker = new Faker();


    @When("the user navigate to {string}")
    public void the_user_navigate_to(String category){

        homePage.navigateToCategory_met(category);

    }

    @When("the user selected the color GRAY")
    public void the_user_selected_the_color_GRAY() {

        BrowserUtils.scrollToElement(laptopsPage.colorGrayLaptop_loc);

        BrowserUtils.clickWithJS(laptopsPage.colorLaptops_loc);

        BrowserUtils.clickWithJS(laptopsPage.colorGrayLaptop_loc);
        BrowserUtils.waitFor(2);

    }


    @When("the user add to cart one Gray Laptop")
    public void the_user_add_to_cart_one_Gray_Laptop() {

        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(laptopsPage.grayLaptops10_loc);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(laptopsPage.addToCart_loc);

    }

    @When("the user selected the color WHITE")
    public void the_user_selected_the_color_WHITE() {

        BrowserUtils.clickWithJS(laptopsPage.laptopsPage_loc);

        BrowserUtils.scrollToElement(laptopsPage.colorLaptops_loc);

        BrowserUtils.clickWithJS(laptopsPage.colorLaptops_loc);

        BrowserUtils.clickWithJS(laptopsPage.colorWhiteLaptop_loc);

        BrowserUtils.clickWithJS(laptopsPage.whiteLaptops9_loc);


    }

    @When("the user add to cart three White Laptops")
    public void the_user_add_to_cart_three_White_Laptops() {


        BrowserUtils.clickWithJS(laptopsPage.colorWhiteLaptop_loc);

        BrowserUtils.clickWithJS(laptopsPage.quantityPlus_loc);
        BrowserUtils.clickWithJS(laptopsPage.quantityPlus_loc);

        BrowserUtils.clickWithJS(laptopsPage.addToCart_loc);


    }

    @When("the user click to cart")
    public void the_user_click_to_cart() {

        Actions actions = new Actions(Driver.get());

        actions.moveToElement(cartPage.checkOutPopUp_loc).perform();

        BrowserUtils.clickWithJS(cartPage.checkOutPopUp_loc);

    }

    @Given("the user click registration")
    public void the_user_click_registration() {

        BrowserUtils.clickWithJS(registerPage.registerButton_loc);

    }

    @Given("the user should be create a account with valid credential")
    public void the_user_should_be_create_a_account_with_valid_credential() {

        registerPage.userNameRegister_loc.sendKeys(faker.internet().password(5,13));
        registerPage.emailRegister_loc.sendKeys(faker.internet().emailAddress());
        registerPage.passwordRegister_loc.sendKeys("Mehmet_1903");
        registerPage.confirmPasswordRegister_loc.sendKeys("Mehmet_1903");
        registerPage.firstNameRegister_loc.sendKeys(faker.name().firstName());
        registerPage.lastNameRegister_loc.sendKeys(faker.name().lastName());
        registerPage.phoneNumberRegister_loc.sendKeys(faker.phoneNumber().subscriberNumber(15));

        BrowserUtils.scrollToElement(registerPage.countryListBoxRegister);

        Select countryList = new Select(registerPage.countryListBoxRegister);
        Random random = new Random();
        int countryIndex = random.nextInt(200);
        countryList.selectByIndex(countryIndex);

        registerPage.cityRegister_loc.sendKeys(faker.address().city());
        registerPage.addressRegister_loc.sendKeys(faker.address().streetAddress());
        registerPage.regionRegister_loc.sendKeys("Bonlanden");
        registerPage.postalCodeRegister_loc.sendKeys(faker.address().zipCode());

        BrowserUtils.clickWithJS(registerPage.agreeUseRegister_loc);
        BrowserUtils.waitFor(1);

        BrowserUtils.clickWithJS(registerPage.finishRegisterButton_loc);
        BrowserUtils.waitFor(10);

    }

    @Given("the user navigate to order payment page")
    public void the_user_navigate_to_order_payment_page() {

        BrowserUtils.clickWithJS(orderPaymentPage.nextButton_loc);

    }

    @Given("the user should be choose payment method and enters valid credentials")
    public void the_user_should_be_choose_payment_method_and_enters_valid_credentials() {

        orderPaymentPage.safePayUsername_loc.sendKeys("SafePay");
        orderPaymentPage.safePayPassword_loc.sendKeys("Safe123");
        BrowserUtils.clickWithJS(orderPaymentPage.payNowButton_loc);
        BrowserUtils.waitFor(5);

    }

    @Then("the user should be able to pay successfully {string}")
    public void the_user_should_be_able_to_pay_successfully(String sum)  {

        String actualPrice = orderPaymentPage.totalPrice.getText();
        Assert.assertEquals("Verify that price",sum,actualPrice);

    }



}
