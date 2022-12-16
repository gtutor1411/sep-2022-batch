package com.busyqa.sessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		// grab headers
		List<WebElement> headers = driver.findElements(By.xpath(".//th"));
		int headerSize = headers.size();
		for (int i = 0; i < headerSize; i++) {
			// System.out.println(headers.get(i).getText());

		}

		// grab rows
		List<WebElement> rows = driver.findElements(By.xpath(".//table[@class='dataTable']//tr"));
		int rowSize = rows.size();
		for (int i = 0; i < rowSize; i++) {
			// System.out.println(rows.get(i).getText());
		}

		// grab columns
		List<WebElement> cols = driver.findElements(By.xpath(".//table[@class='dataTable']//td"));
		int colSize = cols.size();
		for (int i = 0; i < colSize; i++) {
			// System.out.println(cols.get(i).getText());
		}

		System.out.println(driver.findElements(By.xpath(".//table[@class='dataTable']//td[1]")).get(0).getText());

		//handling by giving rows/colum indices
		System.out.println(driver.findElement(By.xpath(".//table[@class='dataTable']//tr[4]/td[1]")).getText());

	}

}
