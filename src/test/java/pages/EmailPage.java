package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {

	// properties

	public WebDriver driver;

	// Selenium Page Factory - it is used to initialize the elements of a page class
	// without FindElement and FindElements

	// @FindBy - annotation

	// Locators

	@FindBy(name = "identifier")
	public WebElement email;

	@FindBy(xpath = "//span[text()= 'Next']")
	public WebElement NextButton1;

	@FindBy(xpath = "//*[text()='Enter an email or phone number']")
	public WebElement BlankError;
	
	@FindBy(xpath = "//*[text()='Create account']")
	public WebElement Createaccount;
	
	
	

	public EmailPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// methods - operational methods

	public void EmailEnter(String emailID) {
		email.sendKeys(emailID);
	}

	public void NextClick() {
		NextButton1.click();
	}
	
	
	
	
	public void createAcc()
	{
		Createaccount.click();
	}

}
