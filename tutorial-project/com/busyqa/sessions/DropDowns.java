package com.busyqa.sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// Text Box/Input Box
		//WebElement tboxElement = driver.findElement(By.xpath("//input[@id='input-firstname']"));
		//tboxElement.sendKeys("Girish");

		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24");
		Select sortDropDown = new Select(driver.findElement(By.xpath(".//select[@id='input-sort']")));
		System.out.println(sortDropDown.getOptions().size());
		sortDropDown.selectByIndex(5);
		sortDropDown.selectByVisibleText("Rating (Lowest)");
		sortDropDown.selectByValue("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24&sort=p.price&order=ASC");
		//sortDropDown.deselectByIndex(5);
	}

}
