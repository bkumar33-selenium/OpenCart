package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RightSideMenuChecking extends BasePage {
	public RightSideMenuChecking(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement msgm;
	@FindBy(xpath="//a[normalize-space()='Edit Account']") WebElement msg0e;
	@FindBy(xpath="//legend[normalize-space()='Your Personal Details']") WebElement msg0;
	
	@FindBy(xpath="//a[normalize-space()='Password']") WebElement msg1p;
	@FindBy(xpath="//h1[normalize-space()='Change Password']") WebElement msg1;

	
	@FindBy(xpath="//a[normalize-space()='Address Book']") WebElement msg2a;
	@FindBy(xpath="//h2[normalize-space()='Address Book Entries']") WebElement msg2;
	
	@FindBy(xpath="//a[normalize-space()='Wish List']") WebElement msg3w;
	@FindBy(xpath="//h2[normalize-space()='My Wish List']") WebElement msg3;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Order History']") WebElement msg4o;
	@FindBy(xpath="//h1[normalize-space()='Order History']") WebElement msg4;
	
	
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Downloads']") WebElement msg5d;
	@FindBy(xpath="//h2[normalize-space()='Account Downloads']") WebElement msg5;
	
	
	@FindBy(xpath="//a[normalize-space()='Recurring payments']") WebElement msg6r;
	@FindBy(xpath="//h1[normalize-space()='Recurring Payments']") WebElement msg6;
	
	
	@FindBy(xpath="//a[normalize-space()='Reward Points']") WebElement msg7r;
	@FindBy(xpath="//h1[normalize-space()='Your Reward Points']") WebElement msg7;
	
	@FindBy(xpath="//a[normalize-space()='Returns']") WebElement msg8r;
	@FindBy(xpath="//h1[normalize-space()='Product Returns']") WebElement msg8;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Transactions']") WebElement msg9t;
	@FindBy(xpath="//h1[normalize-space()='Your Transactions']") WebElement msg9;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Newsletter']") WebElement msg10n;
	@FindBy(xpath="//h1[normalize-space()='Newsletter Subscription']") WebElement msg10;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement msg11l;
	@FindBy(xpath="//h1[normalize-space()='Account Logout']") WebElement msg11;
	
	
	
	public String  MyAccount()
	{
		
		String confmsg=msgm.getText();
		return confmsg;
		
	}
	public String  editaccount()
	{
		msg0e.click();
		String confmsg0=msg0.getText();
		return confmsg0;
		
	}
	public String Password()
	{
        msg1p.click();
		String confmsg1=msg1.getText();
		return confmsg1;
		
	}
	public String AddressBook()
	{
		msg2a.click();
		String confmsg2=msg2.getText();
		return confmsg2;
		
	}
	public String WishList()
	{
		msg3w.click();
		String confmsg3=msg3.getText();
		return confmsg3;
		
	}
	public String OrderHistory()
	{
		msg4o.click();
		String confmsg4=msg4.getText();
		return confmsg4;
		
	}
	public String Downloads()
	{
		msg5d.click();
		String confmsg5=msg5.getText();
		return confmsg5;
		
	}
	public String  Recurringpayments()
	{
		msg6r.click();
		String confmsg6=msg6.getText();
		return confmsg6;
		
	}
	public String  RewardPoints()
	{
		msg7r.click();
		String confmsg7=msg7.getText();
		return confmsg7;
		
	}
	public String  Returns()
	{
		msg8r.click();
		String confmsg8=msg8.getText();
		return confmsg8;
		
	}
	public String  Transaction()
	{
		msg9t.click();
		String confmsg9=msg9.getText();
		return confmsg9;
		
	}
	public String  Newsletter()
	{
		msg10n.click();
		String confmsg10=msg10.getText();
		return confmsg10;
		
	}
	public String  Logout()
	{
		msg11l.click();
		String confmsg11=msg11.getText();
		return confmsg11;
		
	}

}
