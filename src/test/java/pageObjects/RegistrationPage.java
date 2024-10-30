package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	WebDriver driver;
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-firstname']") WebElement fname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement lname;
	@FindBy(xpath="//input[@id='input-email']") WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement tel;
	@FindBy(xpath="//input[@id='input-password']") WebElement pwd;	
    @FindBy(xpath="//input[@id='input-confirm']") WebElement confp;
    @FindBy(xpath="//input[@name='agree']") WebElement agre;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement warn;
    @FindBy(xpath="//input[@value='Continue']") WebElement contn;
    @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") public WebElement content;
    
	public void setFirstname(String name)
	{
		fname.sendKeys(name);
	}
	public void setLastname(String lsname)
	{
		lname.sendKeys(lsname);
	}
	public void setEmail(String iemail)
	{
		email.sendKeys(iemail);
	}
	public void setTelephone(String telphn)
	{
		tel.sendKeys(telphn);
	}
	public void setPassword(String passw)
	{
		pwd.sendKeys(passw);
	}
	public void setConfirmPassword(String conpwd)
	{
		confp.sendKeys(conpwd);
	}
	public void setAgree()
	{
		agre.click();
	}
	public String getWarningMesg()
	{
		String wm=warn.getText();
		return wm;
	}
	public void continueb()
	{
		contn.click();
	}
	public String getmessage()
	{
		try {
		return(content.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
		
	
}
