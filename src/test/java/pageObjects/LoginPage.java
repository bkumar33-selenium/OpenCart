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
	@FindBy(xpath="//a[normalize-space()='Password']") WebElement pass_chng;
	@FindBy(xpath="//input[@id='input-password']") WebElement pwd;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement cpwd;
	@FindBy(xpath="//input[@value='Continue']") WebElement cont;
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
	public void pswd_change()
	{
		pass_chng.click();
	}
	public void Lpwd_change(String lpwd)
	{
		pwd.sendKeys(lpwd);
	}
	public void cLpwd_change(String clpwd)
	{
		cpwd.sendKeys(clpwd);
	}
	public void continu()
	{
		cont.click();
	}

}
