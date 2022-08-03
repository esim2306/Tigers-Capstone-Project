package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base{
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopAndNotebookTab;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLaptopNoteBookOption;
	
	@FindBy(xpath="//a[text()='MacBook']")
	private WebElement MackBookItem;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement AddToCartButton;
	
	@FindBy(xpath ="(//a[text()='MacBook'])[3]")
	private WebElement MacBookSuccessmessage;
	
	@FindBy(xpath = "//span[text()='1 item(s) - $602.00']")
	private WebElement itemsToTheCart;
	
	@FindBy(css = "div[class='btn-group btn-block']")
	private WebElement CartOption;
	
	@FindBy(css = "[class='btn btn-danger btn-xs']")
	private WebElement clickOnRedXbutton;
	
	@FindBy(xpath = "//span[text()='0 item(s) - $0.00']")
	private WebElement cartShow0Items;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement comparisonIconOnMacBook;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement comparisonIconMacBookAir;
	
	@FindBy(xpath = "(//a[text()='MacBook Air'])[1]")
	private WebElement MacBookAirsuccessmessage;
	
	@FindBy(xpath = "//a[text()='Product Compare (2)']")
	private WebElement ProductComparisonLink;
	
	@FindBy(xpath = "//*[@id=\"product-compare\"]")
	private WebElement productComparisonChart;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement clickOnHeartIcon;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']//following-sibling::div[1]")
	private WebElement SonyVaioToCreateAccountMessage;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement MackBookPro;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement priceTag;
	
	
	public void clickOnLaptopAndNoteBookTab() {
		LaptopAndNotebookTab.click();
	}
	
	public void clickOnShowAllLaptopNoteBookOption() {
		ShowAllLaptopNoteBookOption.click();
	}
	
	public void clickOnMackBookItem() {
		MackBookItem.click();
		
	}
	
	public void clickOnAddToCartButton() {
		AddToCartButton.click();
	}
	
	public String successMessageMac() {
		String actualResult = "Success: You have added " + MacBookSuccessmessage.getText() + " to your shopping cart!";
		return actualResult;
	}
	
	public boolean isSuccessMessageMacPresent() {
		if(MacBookSuccessmessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public WebElement itemsToTheCart() {
		return itemsToTheCart;
	}
	
	public void clickOnCartOption() {
		CartOption.click();
	}
	
	public void clickOnRedXbutton(){
		clickOnRedXbutton.click();
		
	}
	
	public WebElement cartShow0Items() {
		return cartShow0Items;
	}
	
	public void clickOnComparisonIconOnMacBook() {
		comparisonIconOnMacBook.click();
	}
	
	public void clickOnComparisonIconMacBookAir() {
		comparisonIconMacBookAir.click();
	}
	
	public String successMessageMacBookAir() {
		String actualResult = "Success: You have added " + MacBookAirsuccessmessage.getText() + " to your product comparison!";
		return actualResult;
	}
	
	public void clickOnProductComparisonLink() {
		ProductComparisonLink.click();
	}
	 public WebElement productComparisonChart() {
		 return productComparisonChart;
	 }
	 
	 public void clickOnHeartIcon() {
		 clickOnHeartIcon.click();
	 }
	 
	 public String SonyVaioToCreateAccountMessage() {
		 return SonyVaioToCreateAccountMessage.getText();
	 }
		 
	 public void clickOnMackBookPro() {
		 MackBookPro.click();
	 }
	 
	 public WebElement priceTag() {
		 return priceTag;
	 }
	
}

