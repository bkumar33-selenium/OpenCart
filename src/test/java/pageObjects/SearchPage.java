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
	@FindBy(xpath="//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[1]//span[1]") WebElement add;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement msg;
	@FindBy(xpath="//span[@id='cart-total']") WebElement itm;
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]") WebElement tot;
	
	
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
	public void AddToCart()
	{
		add.click();
	}
	public String getSuccessmessage()
	{
		String message=msg.getText();
		String a[]=message.split("!");	
		return a[0];
	}
	public void clickItemsAddedtoCart()
	{
		itm.click();
	}
	public String getTotalAmnttoPaid()
	{
		String Tamnt=tot.getText();
		return Tamnt;
	}

}
