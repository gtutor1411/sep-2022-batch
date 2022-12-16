package com.busyqa.sessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session6_Waits {

	public static void main(String[] args) throws InterruptedException {
		// Start browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Start application
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		// Click on timer button to start
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		/********************************************************/
		// NO WAIT
		// Thread.sleep(30000);
		 WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));

		/**********************************************************/
		// Create object of WebDriverWait class and it will wait max of 20 seconds.
		// By default it will accepts in Seconds
		// WebDriverWait wait = new WebDriverWait(driver, 30);this does not work anymore
		 /*
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		/*******************************************************/

		// if element found then we will use- In this example I just called isDisplayed
		// method
		boolean status = element.isDisplayed();

		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}

	}

}
