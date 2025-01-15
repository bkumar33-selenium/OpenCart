package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MainPageHeaders;
import pageObjects.UI_Components;
import testBase.BaseClass;

public class Components extends BaseClass  {
	
	@Test
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
		logger.info("LoggedIn");
		MainPageHeaders mnh=new MainPageHeaders(driver);
		WebElement component=mnh.com;
		//System.out.println(mnh.displayComponent());
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(component).build().perform();
		mnh.moniters();
		String b[]=mnh.MonitorNames();
		System.out.println(b[0]);
		System.out.println(b[1]);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
		
	}

}
