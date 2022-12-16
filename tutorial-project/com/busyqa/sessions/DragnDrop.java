package com.busyqa.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement fromElement = driver.findElements(By.xpath(".//a[@class='button button-orange']")).get(5);
		
		WebElement toElement = driver.findElement(By.id("loan"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(fromElement, toElement).perform();		
		
		
		
		
		
		
		
		
		
		
		

	}

}
