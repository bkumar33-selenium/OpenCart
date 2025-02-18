package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.EditAccount_Obj;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RightSideMenuChecking;
import testBase.BaseClass;
import testBase.Login;

public class Edit_Account extends Login {
	
	@Test
	void edit()
	
	{
		try
		{
		/*logger.info("****TestBegin****");
		HomePage h=new HomePage(driver);
		h.MyAccount();
		h.Login();
		logger.info("LoginPage");
		LoginPage lp=new LoginPage(driver);
		lp.email(p.getProperty("email"));
		lp.password(p.getProperty("password"));
		lp.login();
		logger.info("LoggedIn");
		Thread.sleep(3000);*/
			
			//Login lgn=new Login();
			//lgn.getMoniter();
			Thread.sleep(3000);
        EditAccount_Obj ed=new EditAccount_Obj(driver);
        
		ed.edit_account();
		ed.firstname();
		ed.lastname();
		ed.email();
		ed.telephone();
		ed.Continue();
		String scm=ed.Get_success_msg();
		System.out.println(scm);
		RightSideMenuChecking rsc=new RightSideMenuChecking(driver);
		System.out.println(rsc.Logout());
		logger.info("Opened Edit Account page");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
		
	}

}
