package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationAccountCreatedPage {

    public AutomationAccountCreatedPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//iframe[@id='aswift_2']")
    public WebElement iframe;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement dismissButton;


}
