package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sh;
	public XSSFRow row;
	public XSSFCell cell; 
	public CellStyle style;
	String path;
	
	public ExcelData(String path)
	{
		this.path=path;
	}
	
    public int getRowCount(String sheet) throws IOException  
		{
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
			sh=workbook.getSheet(sheet);
			int row=sh.getLastRowNum();
			workbook.close();
			fi.close();
			return row;					
		}
		public int getCellCount(String sheet,int rownum) throws IOException
		{
			fi=new FileInputStream(path);
			workbook=new XSSFWorkbook(fi);
			sh=workbook.getSheet(sheet);
			row=sh.getRow(rownum);
			int cellcount=row.getLastCellNum();
			workbook.close();
			fi.close();
			return cellcount;			
		}
		
        public String getCellData(String sheet,int rownum,int cellnum) throws IOException
        {
        	fi=new FileInputStream(path);
        	workbook=new XSSFWorkbook(fi);
        	sh=workbook.getSheet(sheet);
        	row=sh.getRow(rownum);
        	cell=row.getCell(cellnum);
        	String data;
        	DataFormatter formater=new DataFormatter();
        	try
        	{
        	//data=cell.toString();
        	
        	data=formater.formatCellValue(cell);
        	}
        	catch(Exception e)
        	{
        		data="";
        	}
        	workbook.close();
        	fi.close();
        	return data;
        }
    
        public void setCellData(String sheet,int rownum,int cellnum,String value) throws IOException
        {
        	File xfile=new File(path);
        	if(!xfile.exists())
        	{
        		workbook=new XSSFWorkbook();
        		fo=new FileOutputStream(path);
        		workbook.write(fo);
        	}
        	fi=new FileInputStream(path);
        	workbook=new XSSFWorkbook(fi);
        	
        	if(workbook.getSheetIndex(sh)==-1)   //if sheet not exist create new
        		workbook.createSheet(sheet);
        	sh=workbook.getSheet(sheet);
        	
        	if(sh.getRow(rownum)==null)
        		sh.createRow(rownum);
        	row=sh.getRow(rownum);
        	
        	//sh=workbook.getSheet(sheet);
        //	row=sh.getRow(rownum);
        	cell=row.createCell(cellnum);
        	cell.setCellValue(value);
        	fo=new FileOutputStream(path);
        	workbook.write(fo);
        	workbook.close();
        	fi.close();
        	fo.close();
        	
    }
     public void fillGreenColor(String sheet,int rownum,int cellnum) throws IOException   
     {
    	 fi=new FileInputStream(path);
     	workbook=new XSSFWorkbook(fi);
     	sh=workbook.getSheet(sheet);
     	
     	row=sh.getRow(rownum);
     	cell=row.getCell(cellnum);
     	
     	style=workbook.createCellStyle();
     	
     	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
     	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
     	
     	cell.setCellStyle(style);
     	workbook.write(fo);
     	workbook.close();
     	fi.close();
     	fo.close();

     }
     public void fillRedColor(String sheet,int rownum,int cellnum) throws IOException   
     {
    	 fi=new FileInputStream(path);
     	workbook=new XSSFWorkbook(fi);
     	sh=workbook.getSheet(sheet);
     	row=sh.getRow(rownum);
     	cell=row.getCell(cellnum);
     	
     	style=workbook.createCellStyle();
     	
     	style.setFillForegroundColor(IndexedColors.RED.getIndex());
     	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
     	
     	cell.setCellStyle(style);
     	workbook.write(fo);
     	workbook.close();
     	fi.close();
     	fo.close();

     }
	}





