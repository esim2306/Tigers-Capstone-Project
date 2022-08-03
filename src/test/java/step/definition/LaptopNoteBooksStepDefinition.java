package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject LaptopNoteBooksPage = new LaptopNoteBooksPageObject();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_LaptopAndNoteBook_tab(){
		LaptopNoteBooksPage.clickOnLaptopAndNoteBookTab();
		logger.info("User click on Laptop &NoteBook tab");
		}
	@Then("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option(){
		LaptopNoteBooksPage.clickOnShowAllLaptopNoteBookOption();
		WebDriverUtility.hardWait();
		logger.info("User click on Show all Laptop &NoteBook option ");
	}
	@And("User click on MacBook  item")
	public void user_click_on_MackBook_item() {
		LaptopNoteBooksPage.clickOnMackBookItem();
		logger.info("User click on MacBook  item");
		WebDriverUtility.takeScreenShot();
	}
	@And("User click add to Cart")
	public void user_click_add_to_cart() {
		LaptopNoteBooksPage.clickOnAddToCartButton();
		WebDriverUtility.hardWait();
		logger.info("User click add to Cart");
		
	}
	@Then("User should see Message {string}")
	public void User_should_see_Message(String expectedSuccessMessageMac){
		Assert.assertEquals(LaptopNoteBooksPage.successMessageMac(),expectedSuccessMessageMac);
		logger.info(expectedSuccessMessageMac + " equals to " + LaptopNoteBooksPage.successMessageMac());
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}
	@And("User should see {int} item\\(s){double} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Integer int1, Double double1) {
		logger.info("User should see item to the cart");
		WebDriverUtility.hardWait();
	}
	@And("User click on cart option")
	public void user_click_on_cart_option() {
		LaptopNoteBooksPage.clickOnCartOption();
		WebDriverUtility.hardWait();
		logger.info("User click on cart option");
	}
	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		LaptopNoteBooksPage.clickOnRedXbutton();
		WebDriverUtility.hardWait();
		logger.info("user click on red X button to remove the item from cart");
	}
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		logger.info("item should be removed and cart should show 0 item(s)");
	}
	@And("User click on product comparison icon on MacBook")
	public void user_click_on_comparison_icon_on_mac_book() {
		LaptopNoteBooksPage.clickOnComparisonIconOnMacBook();
		WebDriverUtility.hardWait();
		logger.info("User click on product comparison icon on MacBook");
	}
	@And("User click on product comparison icon MacBook Air")
	public void user_click_on_product_comparison_icon_MacBook_Air() {
		LaptopNoteBooksPage.clickOnComparisonIconMacBookAir();
		WebDriverUtility.hardWait();
		logger.info("User click on product comparison icon on MacBook Air");
	}
	@Then("User should see success a message {string}")
	public void user_should_see_success_a_message(String expectedSuccessMessageMacBookAir) {
		Assert.assertEquals(LaptopNoteBooksPage.successMessageMacBookAir(),expectedSuccessMessageMacBookAir);
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {	
		WebDriverUtility.hardWait();
		LaptopNoteBooksPage.clickOnProductComparisonLink();
		logger.info("User click on Product comparison link");
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		logger.info("User should see Product Comparison Chart");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	@And("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_Sony_Vaio_laptop_to_wish_list() {
		LaptopNoteBooksPage.clickOnHeartIcon();
		WebDriverUtility.hardWait();
		logger.info("User click on heart icon to add 'Sony VaIO' laptop to wish list");
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expectedMessageText) {
		String actual = LaptopNoteBooksPage.SonyVaioToCreateAccountMessage().substring(0, 72);
		System.err.println(actual);
		Assert.assertEquals(actual, expectedMessageText);
		logger.info(expectedMessageText + " equals to " + LaptopNoteBooksPage.SonyVaioToCreateAccountMessage());
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	@And("User click on 'MacBook Pro' item")
		public void user_click_on_MackBookPro_item() {
		LaptopNoteBooksPage.clickOnMackBookPro();
		logger.info("User click on 'MacBook Pro' item");
	}
	@Then("User should see  '$2,000.00' price tag is present on UI.")
	public void user_should_see_price_tag(){
		logger.info("User should see  '$2,000.00' price tag is present on UI.");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();		
	}
	
}
