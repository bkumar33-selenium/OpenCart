package testBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Login extends BaseClass{
	@BeforeClass
	public void getMoniter()
	{
		
		try
		{
		logger.info("****TestBegin****");
		HomePage h=new HomePage(driver);
		h.MyAccount();
		h.Login();
		logger.info("LoginPage");
		LoginPage lp=new LoginPage(driver);
		lp.email(p.getProperty("email"));
		lp.password(p.getProperty("password"));
		lp.login();
		Thread.sleep(3000);
		logger.info("LoggedIn");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
