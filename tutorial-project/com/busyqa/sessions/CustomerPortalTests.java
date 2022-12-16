package com.busyqa.sessions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CustomerPortalTests {

	@Test(priority=1, invocationCount = 2,enabled=false)
	public void ecommerceTest() {
		String expectedTitle = "Your Store";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);		
		driver.quit();

	}
	
	@Test(priority=2,enabled = false)
	public void agoogleTest() {

		String expectedTitle = "Google";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);		
		driver.quit();

	}

}
