package com.busyqa.sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement frame = driver.findElement(By.xpath(".//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.xpath(".//span[contains(@class,'ui-slider')]"));

		// click and move the slider to the right once *50
		for (int i = 1; i <= 51; i++) {
			slider.sendKeys(Keys.ARROW_RIGHT);
		}	
		
		driver.switchTo().defaultContent();

	}

}
