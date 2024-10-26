package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseClass {
	public static WebDriver driver;
	public Logger logger;
	public Properties p;
		
	
	@BeforeClass(groups={"Sanity","Regression","Master"})
	@Parameters({"Browser","os"})
	public void setup(String b,String op) throws IOException
	{
		logger=LogManager.getLogger(this.getClass());
		FileReader fr=new FileReader("./src//test//resources//OpenCartConfig.properties");
		p=new Properties();
		p.load(fr);
		//String env01=p.getProperty("execution_env");
		
		
		//String env1="local";
		//String env02=p.getProperty("environment_remote");
		//String env2="remote";
		//System.out.println(env01);
		//System.out.println(env02);
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
           {
	        DesiredCapabilities cap=new DesiredCapabilities();
	        if(op.equalsIgnoreCase("Windows"))
	        {
	        cap.setPlatform(Platform.WIN11);
	        }
	        else if( op.equalsIgnoreCase("Linux"))
	        {
	        	 cap.setPlatform(Platform.LINUX);
	        }
	        else if(op.equalsIgnoreCase("mac"))
	        {
	        	cap.setPlatform(Platform.MAC);
	        }
	        else
	        {
	        	System.out.println("No Matching OS");
	        	return;
	        }
	        switch(b)
	        {
	        case "Chrome":cap.setBrowserName("chrome");break;
	        case "Edge":cap.setBrowserName("MicrosoftEdge");break;
	        case "Firefox":cap.setBrowserName("Firefox");break;
	        default :System.out.println("No matching Browser"); return;
	        
	        }
        		   
	        driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	        
           }
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			
			switch(b)
			{
			case "Chrome":driver=new ChromeDriver(); break;
			case "Edge":driver=new EdgeDriver(); break;
			case "FireFox":driver=new FirefoxDriver();break;
			default:System.out.println("Invalid link");return;
			}
			
		}  
		
		//driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(p.getProperty("appURL"));
		//driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
@AfterClass(groups= {"Sanity","Regression","Master"})
	public void teardown()
	{
		driver.quit();
	}
	public String randomAlphabaticStrings()
	{
	 String ran=RandomStringUtils.randomAlphabetic(6);	
	 return ran;
	}
	public String randomNumaricStrings()
	{
	 String ran=RandomStringUtils.randomNumeric(6);	
	 return ran;
	}
	public String randomAlphaNumaricStrings()
	{
	 String ran1=RandomStringUtils.randomNumeric(3);	
	 String ran2=RandomStringUtils.randomAlphabetic(6);
	 return ran1+ran2;
	}
	public String captureScreenShot(String tname) throws IOException
	{
		String timestamp=new SimpleDateFormat("YYYYMMddHHmmss").format(new Date());
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		File sourcepath=takescreenshot.getScreenshotAs(OutputType.FILE);
		String targetfilepath=System.getProperty("user.dir")+"\\screenshots\\"+ tname +"_"+ timestamp +".png";
		File targetpath=new File(targetfilepath);
		sourcepath.renameTo(targetpath);
		return targetfilepath;
	}

}
