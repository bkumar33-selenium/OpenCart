package testCases;

import org.testng.annotations.Test;

import pageObjects.ShoppingCart_Obj;
import testBase.BaseClass;

public class ShoppingCart extends BaseClass {
	@Test
void shoping() throws InterruptedException
{
	ShoppingCart_Obj sh=new ShoppingCart_Obj(driver);
	String gmsg=sh.ShoppingCart();
	System.out.println(gmsg);
	sh.Continue_ShopCart();
	System.out.println(sh.Featured());
	if(sh.Featured().equals("Featured"))
			{
		System.out.println("Navigated to Home Page");
			}
	else
	{
		System.out.println("Something went wrong");
	}
}
	
}
