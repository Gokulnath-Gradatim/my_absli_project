package com.absli.utill;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.absli.base.AbsliBase;

public class TestUtill extends AbsliBase {
	
	public static long Implicitly_Wait = 30;
	public static long pageLoad_Timeout = 30;
	public static long Explicitly_Wait = 5;

	public static void takeScreenshotAtEndOfTest(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String time = LocalTime.now().toString().replace(":", "-");
		File permFile = new File(".//ScreenShot//"+name+"-"+time+"-absli.png");
		FileUtils.copyFile(tempFile, permFile);
	}
	
	public static String getDateTimeString()
	{
		Calendar cal =Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy_HHmmss");
		return sf.format(cal.getTime());
	}
	
	public static Object[][] getDataFromExcel(String FileName, String sheetName)
	{
	
		Object [][] data = null;
	{
		try {
			FileInputStream fis = new FileInputStream(FileName);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow row = sheet.getRow(0);
			int noOfRows = sheet.getPhysicalNumberOfRows();
			int noOfCols = row.getLastCellNum();
			Cell cell;
			
			data = new Object[noOfRows-1][noOfCols];
			
			for(int i=1;i<noOfRows;i++)
			{
				for(int j=0;j<noOfCols;j++)
				{
					row = sheet.getRow(i);
					cell=row.getCell(j);
					data[i-1][j]=cell.toString();
//					 if (cell.getCellType() == CellType.STRING) {
//				            // If cell contains string value
//						 data[i-1][j] = cell.getStringCellValue();
//				        } else if (cell.getCellType() == CellType.NUMERIC) {
//				            // If cell contains numeric value
//				        	data[i-1][j] = String.valueOf(cell.getNumericCellValue());
//				        }
				}
			}
			
		} catch (IOException e) {
			System.out.println("The exception is: "+e.getMessage());
		}
		catch (Exception e) {
		    e.printStackTrace(); // Print stack trace for any other exceptions
		}
	}
	
	return data;
	}
}
