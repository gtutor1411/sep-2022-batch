package com.busyqa.sessions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {

	WebDriver driver;

	@BeforeClass
	public void initiate() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	}

	@Test(enabled = false)
	@Parameters({ "userName", "password" })
	public void loginTestOld(String userName, String password) {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean isElementVisible = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"))
				.isDisplayed();
		assertTrue(isElementVisible);
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String userName, String password) {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean isElementVisible = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"))
				.isDisplayed();
		assertTrue(isElementVisible);
	}

	@DataProvider(name = "loginData")
	String[][] loginData() {
		String[][] data = { { "radomusera@gmail.com","password0" }, { "randomuserb@gmail.com","password0"}, { "hetvi@gmail.com","password0"}};
		return data;
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("Tests completed");
	}

}
