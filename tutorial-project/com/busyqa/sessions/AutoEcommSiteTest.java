package com.busyqa.sessions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoEcommSiteTest {
	WebDriver driver;

	@BeforeClass()
	public void checkPreconditions() {
		System.out.println("Checked Preconditons and passed");

	}

	@BeforeMethod(groups = "regression")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	}

	@Test(priority = 1, groups = "regression")
	public void ecommerceTitleTest() {
		String expectedTitle = "Account Login";
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 0, groups = "functional")
	public void googleTitleTest() {
		String expectedTitle = "Google";
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}

	@AfterMethod(groups = "regression")
	public void closeBrowser() {
		driver.quit();

	}

	@AfterClass()
	public void tearDown() {
		System.out.println("Kill remaining browser/files,clean up environment");

	}

}
