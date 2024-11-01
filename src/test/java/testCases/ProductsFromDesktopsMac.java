package testCases;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MainPageHeaders;
import testBase.BaseClass;

public class ProductsFromDesktopsMac extends BaseClass{
	@Test
	public void MacProducts() throws InterruptedException
	{
		try
		{
		logger.info("***Process started****");
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
    WebElement desk = m.d();
    WebElement mac=m.m();
    Actions a= new Actions(driver);
    a.moveToElement(desk).moveToElement(mac).click().build().perform();
    logger.info("Products Displayed succesfully");
    TakesScreenshot sc=(TakesScreenshot)driver;
    File sourcepath=sc.getScreenshotAs(OutputType.FILE);
    File targetpath=new File(System.getProperty("user.dir")+"\\screenshots\\MacProducts.png ");
    sourcepath.renameTo(targetpath);
    logger.info("screen shot saved in Folder-screenshot");
    
	
	}catch(Exception e)
	{
		e.getMessage();
	}
}
}
