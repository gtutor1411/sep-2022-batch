package com.busyqa.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealWorld {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		ChromeDriver drive = new ChromeDriver();
		
		try {
		 driver.findElement(By.xpath("/hdkshfk"));
			
		}catch (NoSuchElementException e) {
			System.out.println("element not available");
		}finally 
		{
			System.out.println("Always exectued");
		}
		
		
	}

}
