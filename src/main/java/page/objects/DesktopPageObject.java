package page.objects;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver,this);
	}
	
	// syntax for storing UI Element in POM class using PageFactory implementation
	//@FindBy(locatorType= "Locator")
	//AccessModifier WebElement NameOfElement;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName ="img")
	private List <WebElement> items; // driver.FindElements
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(id="input-quantity")
	private WebElement quantityInput;
	
	@FindBy(id ="button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath ="(//a[text() ='HP LP3065'])[3]")
	private WebElement HPLPsuccessmessage;
	
	@FindBy(xpath ="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]/span")
	private WebElement addCanonEOS5DCamera;
	
	@FindBy(xpath = "//select[@id ='input-option226']")
	private WebElement selectColor;
	
	@FindBy(id ="input-quantity")
	private WebElement quantityOfCameraInput;
	
	@FindBy(xpath ="(//a[text()='Canon EOS 5D Camera'])[3]")
	private WebElement Canonsuccessmessage;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath ="//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy(id ="input-name")
	private WebElement yourNameField;
	
	@FindBy(id="input-review")
	private WebElement yourReviewField;
	
	@FindBy(xpath ="//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(xpath ="//button[text()='Continue']")
	private WebElement ReviewContinueButton;
	
	@FindBy(xpath ="//*[@id=\"form-review\"]/div[2]/text()")
	private String reviewSubmissionMessage;
	
	
	
	public void clickonDesktopsTab() {
		WebDriverUtility.moveToElement(desktops);
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement> desktopsItems(){
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}
	
	public void clickOnHPLP3065Item() {
		hpLP3065.click();
	}
	
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}
	/**
	 * This method will click on Add to Cart Button once the product is ready to add.
	 */
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	public String SuccessMessage() {
		String actualResult = "Success: You have added " + HPLPsuccessmessage.getText() + " to your shopping cart!";
		return actualResult;
	}
	
	public boolean isSuccessMessagePresent() {
		if(HPLPsuccessmessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickOnAddCanonEOS5DCamera() {
		addCanonEOS5DCamera.click();
	}
	
	public void selectColor(String colorValue) {
		Select select = new Select(selectColor);
		select.selectByVisibleText(colorValue);
		
	}
//	List<WebElement> color = selectColor;
//	for(WebElement element:color) {
//		if(element.getText().equals(colorValue)) {
//			element.click();
//		}
//	}
	
	public void selectQuantityOfCameraInput(String quantityOfCameraValue) {
		quantityInput.clear();
		quantityOfCameraInput.sendKeys(quantityOfCameraValue);
	}
	
	public String successMessageCamera() {
		String actualResult = "Success: You have added " + Canonsuccessmessage.getText() + " to your shopping cart!";
		return actualResult;
	}
	
	public boolean isSuccessMessageCamera() {
		if(Canonsuccessmessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}
	
	public void clickOnReviewLink() {
		writeReviewLink.click();
	}
	
	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}
	
	public void enterYourReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}
	
	public void selectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for(WebElement element:ratingElements) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}
	}
	
	public void clickOnContinueButton() {
		ReviewContinueButton.click();
	}
	
	public String reviewText() {
		return reviewSubmissionMessage;
	}
}