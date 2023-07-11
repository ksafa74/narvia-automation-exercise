package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AutomationExercise_StepDefinitions {

    AutomationHomePage automationHomePage =new AutomationHomePage();
    AutomationLoginPage automationLoginPage =new AutomationLoginPage();
    AutomationSignupPage automationSignupPage = new AutomationSignupPage();
    AutomationAccountCreatedPage automationAccountCreatedPage = new AutomationAccountCreatedPage();
    AutomationDeleteAccountPage automationDeleteAccountPage = new AutomationDeleteAccountPage();

    @Given("User Launches browser and navigates to homepage")
    public void user_launches_browser_and_navigates_to_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("automationExerciseURL"));

    }
    @Then("User should see that URL is automationexercise.com")
    public void user_should_see_that_url_is_automationexercise_com() {

        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://automationexercise.com/";
        Assert.assertTrue(actualURL.equals(expectedURL));

    }
    @Then("User clicks on Signup Login button")
    public void userClicksOnSignupLoginButton() {

        automationHomePage.signupLoginButton.click();
    }

    @Then("User should see that New User Signup! is visible")
    public void user_should_see_that_new_user_signup_is_visible() {

        Assert.assertTrue(automationLoginPage.newUserSignup.isDisplayed());

    }
    @Then("User enters {string} and {string} address")
    public void userEntersAndAddress(String fullName, String email) {

        automationLoginPage.nameInput.sendKeys(fullName);
        automationLoginPage.emailInput.sendKeys(email);

    }
    @Then("User clicks Signup button")
    public void user_clicks_signup_button() {
        automationLoginPage.signUpButton.click();

    }
    @Then("User should see that ENTER ACCOUNT INFORMATION is visible")
    public void user_should_see_that_enter_account_information_is_visible() {
        Assert.assertTrue(automationSignupPage.enterAccountInformation.isDisplayed());

    }
    @Then("User fills details: Title, {string} {string} {string} {string}")
    public void userFillsDetailsTitle(String password, String birthDay, String birthMonth, String birthYear) {
        Select dayDropdown = new Select(automationSignupPage.daysDropdown);
        Select monthDropdown = new Select(automationSignupPage.monthsDropdown);
        Select yearDropdown = new Select(automationSignupPage.yearsDropdown);

        automationSignupPage.titleMr.click();
        automationSignupPage.passwordInput.sendKeys(password);
        dayDropdown.selectByVisibleText(birthDay);
        monthDropdown.selectByVisibleText(birthMonth);
        yearDropdown.selectByVisibleText(birthYear);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,2000)");

    }

    @Then("User selects checkbox Sign up for our newsletter!")
    public void user_selects_checkbox_sign_up_for_our_newsletter() {
        automationSignupPage.newsLetterCheckBox.click();

    }
    @Then("User selects checkbox Receive special offers from our partners!")
    public void user_selects_checkbox_receive_special_offers_from_our_partners() {
        automationSignupPage.specialOfferCheckBox.click();

    }

    @Then("User fills details: {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userFillsDetails(String firstName, String lastName, String company, String address1, String address2, String country, String state, String city, String zipcode, String mobileNumber) {

        Select countryDropDown = new Select(automationSignupPage.countryDropdown);

        automationSignupPage.firstNameInput.sendKeys(firstName);
        automationSignupPage.lastNameInput.sendKeys(lastName);
        automationSignupPage.companyInput.sendKeys(company);
        automationSignupPage.address1Input.sendKeys(address1);
        automationSignupPage.address2Input.sendKeys(address2);
        countryDropDown.selectByVisibleText(country);
        automationSignupPage.stateInput.sendKeys(state);
        automationSignupPage.cityInput.sendKeys(city);
        automationSignupPage.zipcodeInput.sendKeys(zipcode);
        automationSignupPage.mobileNumberInput.sendKeys(mobileNumber);

    }

    @Then("User clicks Create Account button")
    public void user_clicks_create_account_button() {

        automationSignupPage.createAccountButton.click();

    }
    @Then("User should see that ACCOUNT CREATED! is visible")
    public void user_should_see_that_account_created_is_visible() {

        Assert.assertTrue(automationAccountCreatedPage.accountCreated.isDisplayed());

    }
    @Then("User clicks Continue button")
    public void user_clicks_continue_button() {

        automationAccountCreatedPage.continueButton.click();
        

    }
    @Then("User should see that Logged in as username is visible")
    public void user_should_see_that_logged_in_as_username_is_visible() {

        Actions action = new Actions(Driver.getDriver());

        Driver.getDriver().switchTo().frame(automationAccountCreatedPage.iframe);
        action.click().perform();
        Driver.getDriver().switchTo().defaultContent();
        

        Assert.assertTrue(automationHomePage.loggedInUser.isDisplayed());
    }
    @Then("User clicks Delete Account button")
    public void user_clicks_delete_account_button() {

        automationHomePage.deleteAccountButton.click();

    }
    @Then("User Should see that ACCOUNT DELETED! is visible")
    public void user_should_see_that_account_deleted_is_visible() {

        Assert.assertTrue(automationDeleteAccountPage.accountDeletedText.isDisplayed());


    }



}
