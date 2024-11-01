package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageHeaders extends BasePage {
	
	public MainPageHeaders(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[normalize-space()='Desktops']") public WebElement desk;
	@FindBy(xpath="//a[normalize-space()='Mac (1)']") WebElement mac;
	@FindBy(xpath="//a[normalize-space()='Laptops & Notebooks']") WebElement lap;
	@FindBy(xpath="//a[normalize-space()='Components']") WebElement com;
	@FindBy(xpath="//a[normalize-space()='Tablets']") WebElement tab;
	@FindBy(xpath="//a[normalize-space()='Software']") WebElement soft;
	@FindBy(xpath="//a[normalize-space()='Phones & PDAs']") WebElement phn;
	@FindBy(xpath="//a[normalize-space()='Cameras']") WebElement camr;
	@FindBy(xpath="//a[normalize-space()='MP3 Players']")WebElement mp3;
	
	public WebElement d()
	{
		return desk;
	}
	public WebElement m()
	{
		return mac;
	}
	
	public boolean Desktops()
	{
		boolean d=desk.isDisplayed();
		return d;
	}
	
	public boolean Laptops()
	{
		boolean l=lap.isDisplayed();
		return l;
	}
	public boolean Components()
	{
		boolean c=com.isDisplayed();
		return c;
	}
	public boolean Tablets()
	{
		boolean t=tab.isDisplayed();
		return t;
	}
	public boolean Software()
	{
		boolean s=soft.isDisplayed();
		return s;
	}
	public boolean Phn()
	{
		boolean p=phn.isDisplayed();
		return p;
	}

	public boolean Cameras()
	{
		boolean cam=camr.isDisplayed();
		return cam;
	}
	public boolean mp3players()
	{
		boolean mp3p=mp3.isDisplayed();
		return mp3p;
	}
	

}
