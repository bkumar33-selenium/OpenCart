package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SlideShowAction extends BasePage {
	public SlideShowAction(WebDriver driver)
	{
		super(driver);
	}
	//SlideShow Locater
	//@FindBy(xpath="//div[@class='\\}|']//a//img") WebElement SSHL;
	
	@FindBy(xpath="//div[@data-swiper-slide-index='1']//img") WebElement SSHL1;
	@FindBy(xpath="//div[@data-swiper-slide-index='0']//img") WebElement SSHL0;
	//div[@class='swiper-slide text-center swiper-slide-prev swiper-slide-duplicate-next']//img[@alt='MacBookAir']
	//div[@class='swiper-slide text-center swiper-slide-prev swiper-slide-duplicate-next']//img[@alt='MacBookAir']
	public String[] SlideshowProducts()
	{
		String gt1=SSHL1.getAttribute("alt");
		String gt0=SSHL0.getAttribute("alt");
		String a[]= {gt1,gt0};
		return a;
	}

}
