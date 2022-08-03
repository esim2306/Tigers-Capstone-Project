package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;


public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement CurrencyOption;
		
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euroButton;
	
	@FindBy(xpath ="//*[@id=\"form-currency\"]/div/button")
	private WebElement EuroSign;
	
	@FindBy(xpath = "//span[text()= 'Shopping Cart']")
	public WebElement shoppingCartTab;
	
	@FindBy (xpath ="//*[@id=\"content\"]/p")
	public WebElement textShopping_cart_empty;

	
	public void clickOnCurrencyButton() {
		CurrencyOption.click();
	}
	public void clickOnEuroButton() {
		euroButton.click();
	}
	public boolean currencyValueChangeEuro() {
		if (EuroSign.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnShoppingCartTab() {
		shoppingCartTab.click();
	}
	public boolean textShoppingCartEmpty() {
		if (textShopping_cart_empty.isDisplayed())
			return true;
		else
			return false;
}
}
	