package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NewTest4 {

	@Test
	
	public void testExcel()
	{
			File file=new File("src/test/resources/Book1.slsx");
			try {
				InputStream stream=new FileInputStream(file);
				XSSFWorkbook workbook=new XSSFWorkbook(stream);
				XSSFSheet sheet=workbook.getSheet("Sheet1");
				System.out.println("Starting row count:" +sheet.getFirstRowNum());
				System.out.println("No of rows: "+sheet.getLastRowNum());
				
				System.out.println("No of active cells "+sheet.getRow(0).getPhysicalNumberOfCells());
				
				for(int i=1;i<=sheet.getLastRowNum();i++)
				{
					System.out.print(sheet.getRow(i).getCell(0).getStringCellValue());
					System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
				}
				
				workbook.close();
				stream.close();
				
					
				}catch (FileNotFoundException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}catch (IOException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
					
				
			}
	}
	
}
