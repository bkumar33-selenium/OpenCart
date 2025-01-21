package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccount_Obj extends BasePage{
	public EditAccount_Obj(WebDriver driver)
	{
		super(driver);
	}
	//Edit_Account element
	@FindBy(xpath="//div[@id='account-account']//div[@class='list-group']//a[2]") WebElement edt;
	//Personal Details
	@FindBy(xpath="//input[@name='firstname']") WebElement fname;
	@FindBy(xpath="//input[@name='lastname']") WebElement lnm;
	@FindBy(xpath="//input[@name='email']") WebElement eml;
	@FindBy(xpath="//input[@name='telephone']") WebElement tel;
	@FindBy(xpath="//input[@value='Continue']") WebElement cont;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement suc;

	
	public void edit_account()
	{
		edt.click();
	}
	public void firstname()
	{
		fname.clear();
		fname.sendKeys("prashanth");
	}
	public void lastname()
	{
		lnm.clear();
		lnm.sendKeys("kumar");
	}
	public void email()
	{
		eml.clear();
		eml.sendKeys("prashanth.wm123@gmail.com");
	}
	public void telephone()
	{
		tel.clear();
		tel.sendKeys("034-219031");
	}
	public void Continue()
	{
		
		cont.click();
	}
	public String Get_success_msg()
	{
		String str=suc.getText();
		return str;
	}
}
