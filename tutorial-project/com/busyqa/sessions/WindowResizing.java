package com.busyqa.sessions;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowResizing {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://naveenautomationlabs.com/opencart/");
		// Dimension dim = new Dimension(500, 500);

		Dimension dim = new Dimension(500, 500);
		driver.manage().window().setSize(dim);

	}

}
