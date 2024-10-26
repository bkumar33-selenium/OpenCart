package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUtility {
	
	@DataProvider(name="logindata")
	 public String  [][] dataprov() throws IOException
	 {
		 String path=".\\testData\\OpenCartLoginData.xlsx";
		 ExcelData ex=new ExcelData(path);
		 int rownum= ex.getRowCount("Sheet1");
		 int cellnum=ex.getCellCount("Sheet1", 1);
		 String logindata[][]=new String[rownum][cellnum];
		 for(int i=1;i<=rownum;i++)
		 {
			 for(int j=0;j<cellnum;j++)
			 {
				 logindata[i-1][j]=ex.getCellData("Sheet1", i, j);
			 }
		 }
		 return logindata;
		 
	 }

}



