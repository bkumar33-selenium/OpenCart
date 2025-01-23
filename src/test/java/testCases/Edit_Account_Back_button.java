package testCases;

import org.testng.annotations.Test;

import pageObjects.EditAccount_Obj;
import testBase.Login;


public class Edit_Account_Back_button extends Login {
	@Test
	void bckbutton()
	{
		try
		{
		EditAccount_Obj edj=new EditAccount_Obj(driver);
		edj.edit_account();
		Thread.sleep(5000);
		edj.Back();
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	

}
