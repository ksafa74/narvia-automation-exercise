Feature: Automation exercise registration functionality

  Agile Story: As a user I should be able to create an account
  and delete an account.

  Scenario Outline: Register user and then delete user account

    Given User Launches browser and navigates to homepage
    Then User should see that URL is automationexercise.com
    And User clicks on Signup Login button
    Then User should see that New User Signup! is visible
    Then User enters "<fullName>" and "<email>" address
    And User clicks Signup button
    Then User should see that ENTER ACCOUNT INFORMATION is visible
    Then User fills details: Title, "<password>" "<birthDay>" "<birthMonth>" "<birthYear>"
    And User selects checkbox Sign up for our newsletter!
    And User selects checkbox Receive special offers from our partners!
    Then User fills details: "<firstName>" "<lastName>" "<company>" "<address1>" "<address2>" "<country>" "<state>" "<city>" "<zipcode>" "<mobileNumber>"
    And User clicks Create Account button
    Then User should see that ACCOUNT CREATED! is visible
    And User clicks Continue button
    Then User should see that Logged in as username is visible
    Then User clicks Delete Account button
    Then User Should see that ACCOUNT DELETED! is visible
    And User clicks Continue button

    Examples:
      | fullName   | email              | password   | birthDay | birthMonth | birthYear | firstName | lastName | company | address1           | address2                     | country       | state | city         | zipcode | mobileNumber |
      | Kasim Safa | safasdet@gmail.com | opensesame | 1        | November   | 1974      | Kasim     | Safa     | Cydeo   | 990 Shipmaster ave | Carolina Waterway Plantation | United States | SC    | Myrtle Beach | 29579   | 8434467232   |


