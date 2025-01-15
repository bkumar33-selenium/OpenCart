package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.UI_Components;
import testBase.BaseClass;

public class UI_Currency extends BaseClass {
	
	@Test
	void Cur() throws Exception 
	{
		UI_Components uic=new UI_Components(driver);
		logger.info("Start");
		Thread.sleep(3000);
	//	WebElement w=uic.cur;
	//	System.out.println(w.getText());
	uic.currency();
	//System.out.println(st);
		logger.info("cur");
	//	uic.Dropdown();
	}

}
