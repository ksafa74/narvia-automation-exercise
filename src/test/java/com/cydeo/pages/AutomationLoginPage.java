package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationLoginPage {

    public AutomationLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h2)[3]")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailInput;


    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;

    public void signUp(String fullName, String email) {

        nameInput.sendKeys(fullName);
        emailInput.sendKeys(email);
    }
}
