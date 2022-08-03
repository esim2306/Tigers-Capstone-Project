#@smokeTest
@Test1, @Regression
Feature: Retail Page

  #Note: for this feature,you have to have an existing account
  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username 'name41@gmail.com' and password '123456'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company   | website   | taxID | paymentMethod | payeeName    |
      | Tekschool | tekschool | s0123 | Cheque        | client Chase |
    And User check on About us check box
    And User click on Continue button
    Then User should see success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName  | abaNumber | swiftCode | accountName | accountNumber |
      | ChaseBank | 123456789 |     12345 | Dim Dima    |     987654321 |
    And User click on continue button
    Then User should see Success message
    
	
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstName | lastName | email           | telephone    |
      | Name      | Lastname | name41@gmail.com | 9999999941 |
    And User click on continue Button
    Then User should see message 'Success: Your account has been successfully updated.'
