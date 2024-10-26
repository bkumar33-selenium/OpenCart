package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-email']") WebElement email;
	@FindBy(xpath="//input[@id='input-password']") WebElement psw;
	@FindBy(xpath="//input[@value='Login']") WebElement login;
	public void email(String eml)
	{
		email.sendKeys(eml);
	}
	public void password(String p)
	{
		psw.sendKeys(p);
	}
	public void login()
	{
		login.click();
	}

}
