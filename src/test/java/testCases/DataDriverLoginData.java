package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviderUtility;

public class DataDriverLoginData extends BaseClass
{
	@Test(dataProvider="logindata",dataProviderClass=DataProviderUtility.class)
	public void logindatadriven(String email,String password,String exp)
	{
	
	logger.info("****This is Starting Point****");
	try {
		
	HomePage hp=new HomePage(driver);
	hp.MyAccount();
	hp.Login();
	
	
	LoginPage lp=new LoginPage(driver);
	lp.email(email);
	lp.password(password);
	lp.login();
	
	
	MyAccountPage myacnt=new MyAccountPage(driver);
	boolean targetpage=myacnt.IsMyyAccountDisplayed();
	
	if(exp.equalsIgnoreCase("valid"))
	{
		if(targetpage==true)
		{
			myacnt.logout();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	if(exp.equalsIgnoreCase("invalid"))
	{
		if(targetpage==true)
		{
			myacnt.logout();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	
	}
}
