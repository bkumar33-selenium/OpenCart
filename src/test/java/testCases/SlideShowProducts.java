package testCases;

import org.testng.annotations.Test;

import pageObjects.SlideShowAction;
import testBase.BaseClass;

public class SlideShowProducts extends BaseClass{
	
	@Test
	void SlidShowPr()
	{
		SlideShowAction ssa=new SlideShowAction(driver);
		String gtvalue[]=ssa.SlideshowProducts();
		//System.out.println(gtvalue[0]);
		//System.out.println(gtvalue[1]);
		for(String a:gtvalue)
		{
			System.out.println(a);
		}
	}

	
	

}
