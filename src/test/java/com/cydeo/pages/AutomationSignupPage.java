package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutomationSignupPage {

    public AutomationSignupPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h2/b)[1]")
    public WebElement enterAccountInformation;

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement titleMr;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement daysDropdown;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement monthsDropdown;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearsDropdown;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsLetterCheckBox;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement specialOfferCheckBox;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyInput;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1Input;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2Input;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateInput;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcodeInput;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumberInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement createAccountButton;

    public void signUpInfoInputData(String firstName,String lastName,String company,String address1,String address2,String state,String city,String zipcode,String mobileNumber
    ) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        companyInput.sendKeys(company);
        address1Input.sendKeys(address1);
        address2Input.sendKeys(address2);
        stateInput.sendKeys(state);
        cityInput.sendKeys(city);
        zipcodeInput.sendKeys(zipcode);
        mobileNumberInput.sendKeys(mobileNumber);
    }


}