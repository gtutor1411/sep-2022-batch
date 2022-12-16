package com.busyqa.sessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//List<WebElement> listOfFrames = driver.findElements(By.xpath(".//iframe"));		
		driver.get("https://demoqa.com/frames");
		int numberOfFrame = driver.findElements(By.xpath(".//iframe")).size();
		System.out.println(numberOfFrame);
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.xpath(".//h1[@id='sampleHeading']")).getText();
		driver.switchTo().defaultContent();

		System.out.println(text);

	}

}
