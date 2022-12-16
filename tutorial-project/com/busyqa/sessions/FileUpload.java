package com.busyqa.sessions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php?controller=contact");
		driver.findElement(By.id("fileUpload")).sendKeys("D:\\Training\\TestUpload.txt");
		
		String pathOfFile ="D:\\Training\\TestUpload.txt";
		copyToClipBoard(pathOfFile);
		driver.findElement(By.xpath(".//div[@id='uniform-fileUpload']")).click();
		
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}
	
	
	public static void copyToClipBoard(String path) {
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	}

}
