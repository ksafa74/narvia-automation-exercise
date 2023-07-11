package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationHomePage {

    public AutomationHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//b[.='Kasim Safa']")
    public WebElement loggedInUserName;

    @FindBy(xpath = "//a[.=' Delete Account']")
    public WebElement deleteAccountButton;





}
