package com.browser.allen;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DumbWayTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualTitles = driver.getTitle();
		driver.quit();
		
		WebDriver driver2 = new ChromeDriver();
		String expectedTitle = "Google";
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		driver.quit();
	}

}
