package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import pageObjects.RightSideMenuChecking;
import testBase.BaseClass;

public class RightSideMC_Confirmation extends BaseClass{
	@Test
	void edm()
	{
		logger.info("****Validate Edit Account ****");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.MyAccount();
		logger.info("Clicked MyAccount link");
		String lpg=p.getProperty("loginpage");
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
		logger.info("Providing Login Details");
		lp.email(p.getProperty("email"));
		lp.password(p.getProperty("password"));
		
		lp.login();
		logger.info("Logged in Succesfully");
		RightSideMenuChecking rsmc=new RightSideMenuChecking(driver);
		String mesg=rsmc.editaccount();
		System.out.println(mesg);
		logger.info(" Edit Account verification completed");
		}
		catch(Exception e)
		{
			Assert.fail();
			logger.info("login failed");
		}
		logger.info("****Test completed*****");
		}
	
		
	}


