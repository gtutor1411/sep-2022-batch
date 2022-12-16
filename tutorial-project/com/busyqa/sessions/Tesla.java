package com.busyqa.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tesla {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Tesla motors");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);		
		//driver.findElements(By.xpath("//input[@value='Google Search']")).get(0).click();
		
		driver.findElement(By.xpath(".//h3[contains(text(),'Tesla: Electric Cars, Solar & Clean Energy')]")).click();
		driver.findElement(By.xpath(" //a[@aria-label='Tesla Logo']")).click();
	}

}
