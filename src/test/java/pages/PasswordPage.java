package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {

	public WebDriver driver;
	
	
	
	@FindBy(xpath = "//*[@type='password']")
	public WebElement password;
	
	
	@FindBy(xpath = "//span[text()= 'Next']")
	public WebElement NextButton2;
	
	
	public PasswordPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	
	public void passwordenter(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void pwdNext()
	{
		NextButton2.click();
	}
	
	
}
