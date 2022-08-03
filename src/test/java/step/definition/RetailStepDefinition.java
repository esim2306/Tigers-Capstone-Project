package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base {
	RetailPageObject retail = new RetailPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_Retail_website() {
	Assert.assertTrue(retail.isLogoPresent());
	Assert.assertEquals("TEK SCHOOL", retail.getTitle());
	logger.info("user is on Retail Website");
	WebDriverUtility.takeScreenShot();
	WebDriverUtility.hardWait();
	}
	
	@And("User click  on MyAccount")
	public void user_click_on_MyAccount() {
		retail.clickOnMyAccount();
		logger.info("user clicked on MyAccount option");
		
	}
	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnLoginOption();
		logger.info("user clicked on Login Option");
		WebDriverUtility.takeScreenShot();
	}
	@And("User enter username {string} and password {string}")
	public void user_enter_userName_and_password(String userName,String password) {
		retail.enterUserNameAndPassword(userName, password);
		logger.info("user entered " + userName + " and "+ password);
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	@And("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLoginButton();
		logger.info("user clicked on Login Button");
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_Myaccount_dashboard() {
		Assert.assertTrue(retail.successfulLogin());
		logger.info("user logged in to myAccount dashboard");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retail.clickOnRegisterForAnAffiliateAccountLink();
		logger.info("user clicked on Register for an Affiliate Account link");
		WebDriverUtility.hardWait();

	}
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String,String>> affiliateInformation =dataTable.asMaps(String.class,String.class);
		retail.enterCompanyName(affiliateInformation.get(0).get("company"));
		retail.enterWebSite(affiliateInformation.get(0).get("website"));
		retail.taxIDField(affiliateInformation.get(0).get("taxID"));
		retail.selectpaymentMethod(affiliateInformation.get(0).get("paymentMethod"));
		retail.enterChequePayeeName(affiliateInformation.get(0).get("payeeName"));
		logger.info("user filled affiliate form");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickonAboutUs();
		logger.info("user checked on About us check box");
	}
	
	@And("User click on Continue button")
	public void user_click_on_Continue_button() {
		retail.clickOnContinueButton();
		logger.info("user clicked on Continue button");
		WebDriverUtility.hardWait();
	   
	}
	@Then("User should see success message")
	public void user_should_see_success_message() {
	   Assert.assertTrue(retail.isSuccessMessagePresent()); 
	   logger.info("success message is present");
	   WebDriverUtility.takeScreenShot();
	   WebDriverUtility.hardWait();
	}
	@When("User click on Edit your affiliate information link")
	public void user_click_on_Edit_your_affiliate_information_link() {
		retail.clickOnEditYourAffiliateInformationLink();
		logger.info("User click on Edit your affiliate information link");
		WebDriverUtility.hardWait();
	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.clickOnBankTransferRadioButton();
		logger.info("user clicked on Bank Transfer Radio button");
	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> bankInformation =dataTable.asMaps(String.class,String.class);
		retail.enterBankName(bankInformation.get(0).get("bankName"));
		retail.enterAbaNumber(bankInformation.get(0).get("abaNumber"));
		retail.swiftCodeField(bankInformation.get(0).get("swiftCode"));
		retail.accountNameField(bankInformation.get(0).get("accountName"));
		retail.accountNumberField(bankInformation.get(0).get("accountNumber"));
		logger.info("user filled bank information");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
    
	}
	@And("User click on continue button")
	public void User_click_on_Continue_button() {
		retail.click_OnContinueButton();
		logger.info("user clicked on continue button");
		WebDriverUtility.hardWait();
	   
	}
	@Then("User should see Success message")
	public void User_should_see_success_message() {
	   Assert.assertTrue(retail.isSuccessMessage_Present()); 
	   logger.info("User should see Success message");
	   WebDriverUtility.takeScreenShot();
	   WebDriverUtility.hardWait();
	   
	}
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retail.clickOnEditYourAccountInformationLink();
		logger.info("User click on Edit your account information link");
		WebDriverUtility.hardWait();
	}
		
	@And("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> accountInformation =dataTable.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='input-lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='input-email']")).clear();
		driver.findElement(By.xpath("//input[@id='input-telephone']")).clear();
		retail.enterFirstName(accountInformation.get(0).get("firstName"));
		retail.enterLastName(accountInformation.get(0).get("lastName"));
		retail.enterEmail(accountInformation.get(0).get("email"));
		retail.enterTelephone(accountInformation.get(0).get("telephone"));
		logger.info("user filled account information");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	@And("User click on continue Button")
	public void User_click_on_continue_button() {
		retail.clickOnContinueButton();
		logger.info("user clicked on continue Button");
		WebDriverUtility.hardWait();
	   
	}
	
	@Then("User should see message {string}")
	public void user_should_see_message(String string) {
		Assert.assertTrue(retail.isSuccess_Message_Present());
		logger.info("User should see message");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
			
	}
//	@Then("User should see a message 'Success: Your account has been successfully updated.'")
//	public void user_should_see_a_Message(String string) {
//		Assert.assertTrue(retail.isSuccess_MessagePresent());
//		logger.info("User should see a message 'Success: Your account has been successfully updated.'");
//		WebDriverUtility.takeScreenShot();
//		WebDriverUtility.hardWait();
//	}
	
//	@Then("User should see a Message 'Success: Your account has been successfully updated.'")
//	public void User_should_see_a_Success_Message() {
//		Assert.assertTrue(retail.isSuccess_Message_Present()); 
//	   logger.info("User should see a Message 'Success: Your account has been successfully updated.'");
//	   WebDriverUtility.takeScreenShot();
//	   WebDriverUtility.hardWait();
//	}
	}