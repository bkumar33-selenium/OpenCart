package testCases;

import pageObjects.MainPageHeaders;
import testBase.Login;
import org.testng.annotations.Test;



public class EndToEndTest_Scenario extends Login {
	@Test
	void EndtEnd()
	{
		try
		{
		MainPageHeaders mph=new MainPageHeaders(driver);
		mph.Tablet();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
	
	
	
	


