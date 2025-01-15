package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class UI_Components extends BasePage  {
	public UI_Components(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md']") public WebElement cur;
//@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']") public WebElement cur;
	//@FindBy(linktext("Currency")) WebElement cur;
//WebElement we=driver.findElement(By.linkText("Currency"));
@FindBy(xpath="//ul[@class='dropdown-menu']") WebElement Ddn;



public  void currency()
{
	//cur.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", cur);
}
public void Dropdown()
{
	Select sel=new Select(Ddn);
	sel.selectByValue("€Euro");
	sel.selectByValue("£Pound Sterling");
	sel.selectByValue("$US Dollar");
}
}
