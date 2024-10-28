package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement myacnt;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement Reg;
//	@FindBy(xpath="//a[normalize-space()='Login']") WebElement log;
	@FindBy(linkText="Login") WebElement log;
	@FindBy(xpath="//input[@placeholder='Search']") WebElement ser;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") WebElement cser;
	
	
	
	public void MyAccount()
	{
		myacnt.click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()",myacnt);
		
	}
	public void Registration() 
	{
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()",Reg);
		
		
		Reg.click();
	}
	public void Login()
	{
		log.click();
	}
	public void search(String product)
	{
		ser.sendKeys(product);
	}
	public void cl_search()
	{
		cser.click();
	}
	
}


