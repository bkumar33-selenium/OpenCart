package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class LoginPasswordChange extends BaseClass {
	
    @Test
	void loginPasswordchng()
	{
		logger.info("****Login PasswordReset-Test Started****");
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
		lp.pswd_change();
		logger.info("Clicked on Password Reset");
		//String password=randomAlphaNumaricStrings();
	    //System.out.println(password);
		String p="T123pc1", pc="T123pc1";
		if(p.equals(pc))
		{
			lp.Lpwd_change(p);
			lp.cLpwd_change(pc);	
			Thread.sleep(3000);
		lp.ClickContinue();
		System.out.println(lp.completedMessage());
		logger.info("Password Change process completed");
		}
		else
		{
			Thread.sleep(3000);
			logger.info("Cannot Proceed:'Password confirmation does not match password!'");
			logger.info("Password Change process Not completed");
		}
		
		
		}
		catch(Exception e)
		{
			Assert.fail();
			logger.info("login failed");
		}
		
		}
	}

