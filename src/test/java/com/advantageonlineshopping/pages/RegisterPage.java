package com.advantageonlineshopping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(xpath = "//button[@id='registration_btnundefined']")
    public WebElement registerButton_loc;

    @FindBy(name = "usernameRegisterPage")
    public WebElement userNameRegister_loc;

    @FindBy(name = "emailRegisterPage")
    public WebElement emailRegister_loc;

    @FindBy(name = "passwordRegisterPage")
    public WebElement passwordRegister_loc;

    @FindBy(name = "confirm_passwordRegisterPage")
    public WebElement confirmPasswordRegister_loc;

    @FindBy(name = "first_nameRegisterPage")
    public WebElement firstNameRegister_loc;

    @FindBy(name = "last_nameRegisterPage")
    public WebElement lastNameRegister_loc;

    @FindBy(name = "phone_numberRegisterPage")
    public WebElement phoneNumberRegister_loc;

    @FindBy(name = "countryListboxRegisterPage")
    public WebElement countryListBoxRegister;

    @FindBy(name = "cityRegisterPage")
    public WebElement cityRegister_loc;

    @FindBy(name = "addressRegisterPage")
    public WebElement addressRegister_loc;

    @FindBy(name = "state_/_province_/_regionRegisterPage")
    public WebElement regionRegister_loc;

    @FindBy(name = "postal_codeRegisterPage")
    public WebElement postalCodeRegister_loc;

    @FindBy(xpath = "//input[@name='i_agree']")
    public WebElement agreeUseRegister_loc;

    @FindBy(xpath = "//button[@id='register_btnundefined']")
    public WebElement finishRegisterButton_loc;




}
