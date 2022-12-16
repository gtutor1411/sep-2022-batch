package com.busyqa.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session7 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());	
		WebElement checkBox =driver.findElement(By.xpath(".//input[@name='agree']"));
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		checkBox.click();
		boolean result = checkBox.isSelected();
		
		if(result) {
			System.out.println("Check box selected as expected");
		}else {
			System.out.println("Check box not working");
		}		
		driver.navigate().back();
		
		
		
		
	}

}
