package com.busyqa.sessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String pathOfExcel = "D:/Training/TestData.xlsx";
		FileInputStream fis = new FileInputStream(pathOfExcel);
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = excelBook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCols = sheet.getRow(0).getLastCellNum();

		System.out.println(totalRows);
		System.out.println(totalCols);

		int rowNumber = 1;
		int colNumber = 0;

		XSSFRow row = sheet.getRow(rowNumber);
		String firstName = row.getCell(colNumber).toString();
		//System.out.println(cellValue);
		excelBook.close();
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		
		

	}
}
