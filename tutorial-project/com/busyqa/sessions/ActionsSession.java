package com.busyqa.sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElements(By.xpath(".//a[@class='dropdown-toggle']")).get(1);
		
		  Actions action = new Actions(driver); //mouse hovering
		  action.moveToElement(element).perform(); Thread.sleep(2000);
		 
		 //right-click action.contextClick(element).perform();
		 
		 //double click
		 WebElement currDropdown = driver.findElement(By.xpath(".//i[@class='fa fa-caret-down']"));
		 action.doubleClick(currDropdown).perform();
		
		try {
			WebElement tip = driver.findElement(By.xpath(".//span[@title='My Account']"));
		} catch (Exception e) {

			System.out.println("Tool Tip not found");
		}

	}

}
