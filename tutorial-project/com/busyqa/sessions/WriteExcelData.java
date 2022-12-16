package com.busyqa.sessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws IOException {

		String pathOfExcel = "D:/Training/TestData.xlsx";
		int rowNumber = 1;
		int colNumber = 0;
		String myData = "Samantha";

		FileInputStream fis = new FileInputStream(pathOfExcel);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = excelBook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(rowNumber);
		XSSFCell cell = row.getCell(colNumber);

		cell.setCellValue(myData);

		FileOutputStream fos = new FileOutputStream(pathOfExcel);
		excelBook.write(fos);
		fos.close();
		excelBook.close();
	}

}
