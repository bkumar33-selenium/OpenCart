package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass  {
	@Test(groups= {"Sanity","Master"})
	void logintest()
	{
		logger.info("****Login Test Started****");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.MyAccount();
		logger.info("Clicked MyAccount link");
		String lpg=p.getProperty("loginpage");
		System.out.println(lpg);
		if(lpg.equalsIgnoreCase("RegistrationPageLogin"))
		{
		
		    hp.Registration();
		    RegistrationPage rp=new RegistrationPage(driver);
		    rp.RegPLogin();
		    logger.info("Clicked on Login Page from Registration Page");
		}
		
		else if(lpg.equalsIgnoreCase("LoginPage"))
		
		{
			hp.Login();
			logger.info("Clicked on Login Page");
		}
		LoginPage lp=new LoginPage(driver);
		logger.info("Providing Customer Details");
		lp.email(p.getProperty("email"));
		lp.password(p.getProperty("password"));
		lp.login();
		MyAccountPage myap=new MyAccountPage(driver);
		boolean lable=myap.IsMyyAccountDisplayed();
		Assert.assertTrue(lable);
		if(lable==false)
		{
			logger.info("login failed");
		}
		else {
		logger.info("**Logged in page**");
		logger.info("Test Passed");
		}
		}
		catch(Exception e)
		{
			Assert.fail();
			logger.info("login failed");
		}
		logger.info("****LoginTest Completed*****");
		
	}
	

}
