package com.busyqa.sessions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("girish@busy.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Happy@123");
		driver.findElement(By.xpath(".//input[@value='Login']")).click();
		Thread.sleep(5000);

		Set<Cookie> allCookies = driver.manage().getCookies();

		for (Cookie cookie : allCookies) {

			System.out.println(cookie.getName() + "--" + cookie.getValue() + "--" + cookie.getPath() + "--"
					+ cookie.getSameSite() + "--" + cookie.getDomain());

		}

		Cookie sessionCookie = driver.manage().getCookieNamed("OCSESSID");
		driver.quit();

		WebDriver newDriver = new ChromeDriver();
		Cookie myRandomCookie = new Cookie("Girish", "TheAwesomeGuy");
		newDriver.manage().window().maximize();
		newDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		newDriver.manage().deleteCookieNamed("OCSESSID");
		newDriver.manage().addCookie(sessionCookie);		
		newDriver.manage().addCookie(myRandomCookie);
		newDriver.navigate().refresh();
		
		
		
		
		
		

	}

}

