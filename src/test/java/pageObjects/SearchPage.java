package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePage{
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[normalize-space()='MacBook']") WebElement mb;
	
	
	public boolean isProductExist(String value)
	{
		if((mb.getText()).equals(value))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}

}
