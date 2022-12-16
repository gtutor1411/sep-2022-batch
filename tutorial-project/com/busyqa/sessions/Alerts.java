package com.busyqa.sessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoqa.com/alerts");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath(".//button[@id='confirmButton']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		alert.dismiss();
		alert.getText();

	}

}
