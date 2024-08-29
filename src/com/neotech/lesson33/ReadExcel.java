package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		

		//lets get the location of excel file
		
		String filePath = System.getProperty("user.dir")+ "/test_data/Test.xlsx";
		
		FileInputStream fis = new  FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("TestData");
		
		// get the number of rows 
		
		int rows = sheet.getPhysicalNumberOfRows(); 
		
		System.out.println("number of rows --> " + rows);
		
		int colums = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of colums in first row --> " + colums);
		
		book.close();
		fis.close();
		
		
		
		

	}

}
