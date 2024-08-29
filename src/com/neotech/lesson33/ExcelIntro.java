package com.neotech.lesson33;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		// let get the location of the excel file

		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		// create a work book object(excel file)

		Workbook book = new XSSFWorkbook(filePath);

		Sheet testData = book.getSheet("TestData");

		// access certein row withing the sheet

		Row firstRow = testData.getRow(0);

		// create a certain cell within row
		Cell cell = firstRow.getCell(1);
		
		// let get the date inside cell object
		String inforInCell = cell.toString();
		
		System.out.println(inforInCell);
		
		Row rowNy = testData.getRow(2);

		// create a certain cell within row
		Cell nyCell = rowNy.getCell(3);
		
		// how to get NY
		String cellValue = nyCell.toString();
		
		System.out.println(cellValue);
		
		
		//lets get Garfiels using method chainign
		String cellValue2 = testData.getRow(1).getCell(2).toString();
		
		System.out.println(cellValue2);
				
		
		// how do i get numeric value from the cell
		
		double cellDoubleValue = testData.getRow(1).getCell(4).getNumericCellValue();
		
		System.out.println(cellDoubleValue);
		
		// we can convert it into an int downcating 
		
		int intValue = (int)cellDoubleValue;
		
		System.out.println(intValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
