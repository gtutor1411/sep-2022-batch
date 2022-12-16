package com.busyqa.sessions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		String mainWindow = driver.getWindowHandle();
		System.out.println("Parent Window-->" + mainWindow);
		driver.findElement(By.xpath(".//button[@id='windowButton']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("After clicking -->" + allWindows);

		for (String window : driver.getWindowHandles()) { // [CDwindow-6389A6004A8DF9FCC02C7D9D55C3A89C,
															// CDwindow-94E5B964D5E4329A2B9834325210891E]
			if (!mainWindow.contentEquals(window)) {
				// driver.switchTo().window("CDwindow-94E5B964D5E4329A2B9834325210891E");
				driver.switchTo().window(window);				
				break;
			}
		}		
		// Code to be executed in the new window
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.close();
		driver.switchTo().window(mainWindow);
		driver.quit();
		
	}
}
