package com.busyqa.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session5_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GirishGanapathi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();

		// Locator -->ID
		WebElement LastNameTbox = driver.findElement(By.id("input-lastname"));
		LastNameTbox.sendKeys("Ganapathi");

		WebElement EmailTbox = driver.findElement(By.id("input-email"));
		EmailTbox.sendKeys("enggdeepikagupta09@gmail.com");
		WebElement TelephoneTbox = driver.findElement(By.id("input-telephone"));
		TelephoneTbox.sendKeys("0123456789");
		WebElement PasswordTbox = driver.findElement(By.id("input-password"));
		PasswordTbox.sendKeys("12345");
		WebElement ConfirmPasswordTbox = driver.findElement(By.id("input-confirm"));
		ConfirmPasswordTbox.sendKeys("12345");
		ConfirmPasswordTbox.click();
		ConfirmPasswordTbox.clear();

		// Locator -->name
		WebElement radioNewsLetters = driver.findElement(By.name("search"));
		radioNewsLetters.sendKeys("iPhone");

		// Locator -->linkText
		WebElement linkLoginPage = driver.findElement(By.linkText("login page"));
		// linkLoginPage.click();

		// Locator -->Partial linkText
		WebElement linkLoginPageAgain = driver.findElement(By.partialLinkText("in page"));
		// linkLoginPageAgain.click();

		// Locator-->cssselector

		// Id--><HTML tag><#><Value of ID attribute>
		WebElement tBoxfirstName = driver.findElement(By.cssSelector("input#input-firstname"));
		tBoxfirstName.sendKeys("Girish");

		// class--><HTML tag><.><Value of Class attribute>
		WebElement radioSubscribe = driver.findElement(By.cssSelector("label.radio-inline"));
		radioSubscribe.click();

		// attribute--><HTML tag><[attribute=Value of attribute]>
		WebElement tboxPassword = driver.findElement(By.cssSelector("input[type='password']"));
		tboxPassword.sendKeys("Girish");

		// Combination=<HTML tag><. Or #><value of Class or ID
		// attribute><[attribute=Value of attribute]>
		WebElement tboxSearch = driver.findElement(By.cssSelector("input.form-control.input-lg[name='search']"));
		tboxSearch.sendKeys("cssselectorcombo");

		// Locator -->xpath
		WebElement tBoxfirstNameWithId = driver.findElement(By.cssSelector(".//input[@id='input-firstname']"));
		tBoxfirstNameWithId.sendKeys("GirishWiothIdXpath");

		WebElement buttonContinue = driver.findElement(By.cssSelector(".//input[@type='submit']"));
		buttonContinue.click();
	}

}
