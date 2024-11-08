package testCases;


import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {
	
	@Test(groups= {"Regression","Master"})
	void AccountRegister() 
	{
		logger.info("****Registration Test Started****");
		try
		{
		
		HomePage hp=new HomePage(driver);
		
		hp.MyAccount();
		logger.info("Clicked MyAccount Dropdown");
		hp.Registration();
		logger.info("Clicked Registration link");
		RegistrationPage rp=new RegistrationPage(driver);
		logger.info("Providing Customer Details");
		rp.setFirstname(randomAlphabaticStrings().toUpperCase());
		rp.setLastname(randomAlphabaticStrings().toUpperCase());
		rp.setEmail(randomAlphabaticStrings()+"@gmail.com");
		rp.setTelephone(randomNumaricStrings());
		String password=randomAlphaNumaricStrings();
	    System.out.println(password);
		rp.setPassword(password);
		rp.setConfirmPassword(password);
		rp.setAgree();
		Thread.sleep(5000);
		rp.continueb();
		
		if(rp.getmessage().equals("Your Account Has Been Created!"))
		{
	//Assert.assertEquals(rp.getmessage(), "Your Account Has Been Created!");
			Assert.assertTrue(true);
			logger.info("Registered Account");
		}
		else {
			logger.error("Test Failed");
			System.out.println("Please read the message and do needfull to register the page"+rp.getWarningMesg());
			logger.debug("Debug logs");	
			logger.info("Account  Not created");
			logger.info("**Registration Test Not Completed**");
			Assert.assertTrue(false);
		}
			
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			logger.debug("Debug logs");	
			logger.info("Account  Not created");
			Assert.fail();
		}
		
		logger.info("**Registration Test Completed**");
}
}