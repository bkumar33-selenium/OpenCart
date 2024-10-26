package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//h2[text()='My Account']") WebElement myacnt;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement logout;
	public boolean IsMyyAccountDisplayed()
	{
		try {
		boolean dis=myacnt.isDisplayed();
		return dis;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void logout()
	{
		logout.click();
	}
    
}
