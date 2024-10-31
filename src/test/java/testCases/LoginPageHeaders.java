package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MainPageHeaders;
import testBase.BaseClass;

public class LoginPageHeaders extends BaseClass {
	@Test
	public void headers() throws InterruptedException
	{
		logger.info("------Validation starts-------");
		HomePage h=new HomePage(driver);
		h.MyAccount();
		h.Login();
		logger.info("Clicked Login Page");
		
    LoginPage l=new LoginPage(driver);
    l.email(p.getProperty("email"));
    l.password(p.getProperty("password"));
    l.login();
    logger.info("Logged in succesfully");
    Thread.sleep(3000);
	MainPageHeaders m=new MainPageHeaders(driver);
	Assert.assertTrue(m.Desktops());
	logger.info("'Desktops' is displayed");
	Assert.assertTrue(m.Laptops());
	logger.info("'Laptops' is displayed");
	Assert.assertTrue(m.Cameras());
	logger.info("'Cameras' is displayed");
	Assert.assertTrue(m.Phn());
	logger.info("'Phones section' is displayed");
	Assert.assertTrue(m.Software());
	logger.info("'Software' is displayed");
	Assert.assertTrue(m.Tablets());
	logger.info("'Tablets' is displayed");
	Assert.assertTrue(m.Components());
	logger.info("'Components' is displayed");
	Assert.assertTrue(m.mp3players());
	logger.info("'mp3playes' is displayed");
	
	}
	

}
