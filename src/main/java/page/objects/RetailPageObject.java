package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	public WebElement testEnvironmentLogo;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountOption;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;

	@FindBy(id = "input-email")
	private WebElement email;

	@FindBy(id = "input-password")
	private WebElement passWordField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;

	@FindBy(id = "input-company")
	private WebElement companyField;

	@FindBy(id = "input-website")
	private WebElement webSiteField;

	@FindBy(id = "input-tax")
	private WebElement taxIDField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalButton;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankButton;

	@FindBy(id = "input-cheque")
	private WebElement chequePayeeNameField;

	@FindBy(xpath = "//input[@value='1']")
	private WebElement aboutUsCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOnAffiliatePage;
	
	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement editYourAffiliateInformation;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioButton;

	@FindBy(xpath ="//input[@name='bank_name']")
	private WebElement bankName;

	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement abaNumber;

	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement swiftCode;

	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement accountName;

	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement accountNumber;
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continue_button;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	WebElement successMessageofEditAffilliate;

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;

	@FindBy(xpath ="//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath ="//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement emailField;

	@FindBy(xpath ="//input[@id='input-telephone']")
	private WebElement telephoneField;
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continue_Button;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOfEditAccount;

	public void clickOnMyAccount() {
		myAccountOption.click();
	}

	public void clickOnLoginOption() {
		loginOption.click();
	}

	public boolean isLogoPresent() {
		if (testEnvironmentLogo.isDisplayed())
			return true;
		else
			return false;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void enterUserNameAndPassword(String userName, String password) {
		email.sendKeys(userName);
		passWordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean successfulLogin() {
		if (myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnRegisterForAnAffiliateAccountLink() {
		registerForAnAffiliateAccount.click();
	}

	public void enterCompanyName(String companyNameValue) {
		companyField.sendKeys(companyNameValue);
	}

	public void enterWebSite(String webSiteValue) {
		webSiteField.sendKeys(webSiteValue);
	}

	public void taxIDField(String taxIDValue) {
		taxIDField.sendKeys(taxIDValue);
	}

	public void selectpaymentMethod(String paymentType) {
		if (paymentType.trim().equalsIgnoreCase("cheque")) {
			if (!chequeButton.isSelected()) {
				chequeButton.click();
			}
		} else if (paymentType.trim().equalsIgnoreCase("paypal")) {
			paypalButton.click();
		} else
			bankButton.click();
	}

	public void enterChequePayeeName(String chequePayeeNameValue) {
		chequePayeeNameField.sendKeys(chequePayeeNameValue);
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public boolean isSuccessMessagePresent() {
		if(successMessageOnAffiliatePage.isDisplayed()) 
			return true;
			else 
			return false;
		
	}
	
	public void clickonAboutUs() {
		aboutUsCheckBox.click();
	}
	
	public void clickOnEditYourAffiliateInformationLink() {
		editYourAffiliateInformation.click();
	}

	public void clickOnBankTransferRadioButton() {
		bankTransferRadioButton.click();
	}

	public void enterBankName(String bankNameValue) {
		bankName.sendKeys(bankNameValue);
	}

	public void enterAbaNumber(String abaNumberValue) {
		abaNumber.sendKeys(abaNumberValue);
	}

	public void swiftCodeField(String swiftCodeValue) {
		swiftCode.sendKeys(swiftCodeValue);
	}

	public void accountNameField(String accountNameValue) {
		accountName.sendKeys(accountNameValue);
	}

	public void accountNumberField(String accountNumberValue) {
		accountNumber.sendKeys(accountNumberValue);
	}
		
	public void click_OnContinueButton() {
		continue_button.click();
	}

	public boolean isSuccessMessage_Present() {
		if(successMessageofEditAffilliate.isDisplayed()) 
			return true;
			else 
			return false;
		
	}

	public void clickOnEditYourAccountInformationLink() {
		editYourAccountInformation.click();

	}

	public void enterFirstName(String firstNameValue) {
		firstNameField.sendKeys(firstNameValue);

	}

	public void enterLastName(String lastNameValue) {
		lastNameField.sendKeys(lastNameValue);

	}

	public void enterEmail(String emailValue) {
		email.sendKeys(emailValue);
	}

	public void enterTelephone(String telephoneValue) {
		telephoneField.sendKeys(telephoneValue);
	}
	public void clickOn_ContinueButton() {
		continue_Button.click();
	}

	public boolean isSuccess_Message_Present() {
		if(successMessageOfEditAccount.isDisplayed()) 
			return true;
			else 
			return false;
		
	}

	
}