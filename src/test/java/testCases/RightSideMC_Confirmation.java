package testCases;

import javax.sound.midi.SysexMessage;

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
		String mesg=rsmc.MyAccount();
		System.out.println(mesg);
	    String mesg0=rsmc.editaccount();
		System.out.println(mesg0);
		String mesg2=rsmc.Password();
		System.out.println(mesg2);
		String mesg3=rsmc.AddressBook();
		System.out.println(mesg3);
		String mesg4=rsmc.WishList();
		System.out.println(mesg4);
		String mesg5=rsmc.OrderHistory();
		System.out.println(mesg5);
		String mesg6=rsmc.Downloads();
		System.out.println(mesg6);
		String mesg7=rsmc.Recurringpayments();
		System.out.println(mesg7);
		String mesg8=rsmc.RewardPoints();
		System.out.println(mesg8);
		String mesg9=rsmc.Returns();
		System.out.println(mesg9);
		String mesg10=rsmc.Transaction();
		System.out.println(mesg10);
		String mesg11=rsmc.Newsletter();
		System.out.println(mesg11);	
		String mesg12=rsmc.Logout();
		System.out.println(mesg12);
		
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


