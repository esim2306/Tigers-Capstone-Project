package step.definition;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base {
	DesktopPageObject desktopPage = new DesktopPageObject();

	//syntax @Tag("exact words of step from scenario")
	//		public void nameOfTheMethod(){ }
	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopPage.clickonDesktopsTab();
		logger.info("user clicked on Desktops tab");
	}
	
	@And("User click on Show all desktops")
	public void userClickOnShowAllDesktops() {
		desktopPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all desktops");
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktopPage.desktopsItems();
		for(WebElement element:desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+ " is present");
			WebDriverUtility.takeScreenShot();
			WebDriverUtility.hardWait();
		}
	}
	
	/*
	 * step 1 we need to store the element in a list
	 * step 2 we need to iterate through the list
	 * step 3 we need to write an assertion to validate each element (index)
	 * is present.
	 */
	
	@And("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopPage.clickOnHPLP3065Item();
		logger.info("User clicked  ADD TO CART option on HP LP3065item");
		
	}
	@And("User select quantity {string}")
	public void user_select_quantity(String quantityValue) {
		desktopPage.selectQuantity(quantityValue);
		WebDriverUtility.hardWait();
		logger.info("user selected quantity " +quantityValue);
	}
	
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPage.clickOnAddToCartButton();
		logger.info("user clicked add to cart button");
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(desktopPage.SuccessMessage(),expectedSuccessMessage);
		Assert.assertTrue(desktopPage.isSuccessMessagePresent());
		logger.info(expectedSuccessMessage + " equals to " + desktopPage.SuccessMessage() );
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();

	}
	@And("User click  ADD TO CART option on Canon EOS 5D Camera")
	public void user_click_add_to_cart_option_on_Canon_eos5dcamera() {
		desktopPage.clickOnAddCanonEOS5DCamera();
		logger.info("user clicked Add to Cart Option");
		
	}
	@And("User select color from dropdown {string}")
	public void user_select_color_from_dropdown_red(String colorValue) {
		desktopPage.selectColor(colorValue);
		logger.info("User selected color from dropdown Red");
	
		
	}
//	@And("User select quantity '1'")
//	public void user_select_quantity(String quantityValue) {
//		desktopPage.selectQuantity(quantityValue);
//		logger.info("user selected quantity " +quantityValue);
//	}
	@Then("User should see a Message {string}")
	public void user_should_see_a_Message(String expectedSuccessMessageCamera) {
		Assert.assertEquals(desktopPage.successMessageCamera(),expectedSuccessMessageCamera);
		Assert.assertTrue(desktopPage.isSuccessMessageCamera());
		logger.info(expectedSuccessMessageCamera + " equals to " + desktopPage.successMessageCamera());
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	@And("User click on Canon EOS 5D Camera")
	public void user_click_on_canon_eos_5d_camera() {
		desktopPage.clickOnCanonEOS5DCamera();
		WebDriverUtility.hardWait();
		logger.info("user clicked on Canon EOS 5D Camera");
		
	}
	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPage.clickOnReviewLink();
		logger.info("User clicked on write a review link");
		
	}
	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String,String>> reviewInformation = dataTable.asMaps(String.class,String.class);
	desktopPage.enterYourName(reviewInformation.get(0).get("yourname"));
	desktopPage.enterYourReview(reviewInformation.get(0).get("yourReview"));
	desktopPage.selectRating(reviewInformation.get(0).get("Rating"));
	logger.info("user filled the review information with below information");
	}
	
	@And("User Click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPage.clickOnContinueButton();
		logger.info("User Clicked on Continue Button");
	}
	
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		System.out.println(desktopPage.reviewText() + "  from print");
}
}
