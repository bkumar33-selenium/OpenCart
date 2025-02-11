package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart_Obj extends BasePage {
	public ShoppingCart_Obj(WebDriver driver)
	{
		super(driver);
	}
	//@FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md']")WebElement shop;
	//Shopping Cart element
	@FindBy(xpath="//div[@id='top-links']//li[4]//a")WebElement shop;
	//Empty message in shopping cart
	@FindBy(xpath="//div[@id='content']//p")WebElement msg;
	//Continue button in shopping cart
	@FindBy(xpath="//div[@class='pull-right']//a")WebElement contB;
	//Featured in home page
	@FindBy(xpath="//div[@id='content']//h3")WebElement Fetur;
	
	public String ShoppingCart() throws InterruptedException
	{
		shop.click();
		Thread.sleep(3000);
		String m=msg.getText();
		return m;
	}
	public void Continue_ShopCart()
	{
		contB.click();
	}
	public String Featured()
	{
		String fp=Fetur.getText();
		return fp;
	}

}
