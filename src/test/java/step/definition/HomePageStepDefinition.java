package step.definition;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import page.objects.HomePageObject;
import utilities.WebDriverUtility;


public class HomePageStepDefinition extends Base {
	
		HomePageObject homePage = new HomePageObject();
		
		@When("User click on Currency")
		public void user_click_on_Currency() {
			homePage.clickOnCurrencyButton();
			logger.info("User click on Currency");
			
		}
		@And("User Choose Euro from dropdown")
		public void user_choose_euro_from_dropdown() {
			homePage.clickOnEuroButton();
			logger.info("User Choose Euro from dropdown");
			
		}
		@Then("currency value should change to Euro")
		public void currency_value_should_change_to_Euro() {
			homePage.currencyValueChangeEuro();
			logger.info("currency value should change to Euro");
			WebDriverUtility.hardWait();
			WebDriverUtility.takeScreenShot();
		}
		@When("User click on shopping cart")
		public void user_click_on_shopping_cart() {
			homePage.clickOnShoppingCartTab();
			logger.info("User click on shopping cart");
			
			
		}
		@Then("{string} message should display")
		public void message_should_display(String string) {
		   homePage.textShoppingCartEmpty();
		   logger.info("Your shopping cart is empty! message");
		   WebDriverUtility.takeScreenShot();
		   WebDriverUtility.hardWait();
}
}