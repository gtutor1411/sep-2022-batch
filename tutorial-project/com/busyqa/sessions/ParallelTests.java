package com.busyqa.sessions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelTests {

	@BeforeSuite
	public void preReqSetup() {

		System.out.println("Setting preconditions for tests");
	}

	@Test
	public void chromeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		assertEquals(driver.getTitle(), "Googles");

	}

	@Test(dependsOnMethods = "chromeTest")
	public void edgeTest() {
		System.setProperty("webdriver.edge.driver", "C:/Users/GirishGanapathi/Downloads/edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		assertEquals(driver.getTitle(), "Google");

	}

}
