package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RightSideMenuChecking extends BasePage {
	public RightSideMenuChecking(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[normalize-space()='Edit Account']") WebElement editAcc;
	@FindBy(xpath="//legend[normalize-space()='Your Personal Details']") WebElement editmesg;
	
	
	public String editaccount()
	{
		editAcc.click();
		String confmsg=editmesg.getText();
		return confmsg;
		
	}

}
