package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReport;
	public ExtentReports extent;
	public ExtentTest test;
	String repname;
	 public void onStart(ITestContext testContext) {
		/* SimpleDateFormat df=new SimpleDateFormat("YYYY:MM:dd:HH:mm:ss");
		 Date dt=new Date();
		 String currentdtString=df.format(dt);*/
		 
		 String timestamp=new SimpleDateFormat("YYYYMMddHHmmss").format(new Date());
		 //System.out.println(timestamp);
		 repname="Test-Report-"+ timestamp +".html";
		// String rep1="Test report-2024-19-10";
		 //String rep2=".html";
		// String rep=rep1+timestamp+rep2;
		// String repname1=System.getProperty("user.dir")+"\\reports\\"+repname;
		 //System.out.println(repname1);
		 //repname="Test-Report-"+ currentdtString +".html";
		 sparkReport=new ExtentSparkReporter(".\\reports\\"+repname);
		 sparkReport.config().setDocumentTitle("OpenCart Automation Report");
		 sparkReport.config().setReportName("OpenCart Functional Testing");
		 sparkReport.config().setTheme(Theme.DARK);
		  
		 extent=new ExtentReports();
		 extent.attachReporter(sparkReport);
		 extent.setSystemInfo("Application", "OpenCart");
		 extent.setSystemInfo("Module","Admin");
		 extent.setSystemInfo("Sub-Module", "Customer");
		 extent.setSystemInfo("username", System.getProperty("user.name"));
		 extent.setSystemInfo("Environment", "QA");
		 
		 String os=testContext.getCurrentXmlTest().getParameter("os");
		 extent.setSystemInfo("Operating System", os);
		 
		 String browser=testContext.getCurrentXmlTest().getParameter("Browser");
		 extent.setSystemInfo("Browser", browser);
		 
		 List<String> includeGroups=testContext.getCurrentXmlTest().getIncludedGroups();
		 if(!includeGroups.isEmpty()) {
			 extent.setSystemInfo("Groups", includeGroups.toString());
		 }
		
		  }
	 public void onTestSuccess(ITestResult result)
	 {
		 test=extent.createTest(result.getTestClass().getName());
		 test.assignCategory(result.getMethod().getGroups());
		 test.log(Status.PASS,result.getName()+"got succesfully excecuted");
		/* try {
				// BaseClass bs=new BaseClass();
				 String imgpath1=new BaseClass().captureScreenShot(result.getName());
				 test.addScreenCaptureFromPath(imgpath1);
			 }
			 catch(IOException e)
			 {
				 e.printStackTrace();
			 }*/
	 }
	 public void onTestFailure(ITestResult result)
	 {
		 test=extent.createTest(result.getTestClass().getName());
		 test.assignCategory(result.getMethod().getGroups());
		 
		 test.log(Status.FAIL,result.getName()+"get failed");
		 test.log(Status.INFO, result.getThrowable().getMessage());
		 
		 try {
			// BaseClass bs=new BaseClass();
			 String imgpath=new BaseClass().captureScreenShot(result.getName());
			 test.addScreenCaptureFromPath(imgpath);
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, result.getName()+" got Skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());
	}
	public void onFinish(ITestContext context)
	{
		extent.flush();
		String rfilepath=System.getProperty("user.dir")+"\\reports\\"+repname;
		File extentreport=new File(rfilepath);
		try {
			Desktop.getDesktop().browse(extentreport.toURI());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

}
