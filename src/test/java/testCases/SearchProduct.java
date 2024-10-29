package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class SearchProduct extends BaseClass {
	@Test
	void searchTest()
	{
		try {
		logger.info("Searching started");
		HomePage hp=new HomePage(driver);
		hp.search("mac");
		logger.info("Entered product");
		hp.cl_search();
		logger.info("Clicked Search button");
		SearchPage sp=new SearchPage(driver);
		boolean ex=sp.isProductExist("MacBoo");
		if(ex==true)
		{
			Assert.assertTrue(true);
			logger.info("Product exist");
		}
		else
		{
		Assert.assertTrue(false);
		logger.info("Product does not exist");
		}
		logger.info("Searching Finished");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	


}
