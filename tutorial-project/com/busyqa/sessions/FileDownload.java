package com.busyqa.sessions;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String folderPath = "D:\\Training\\TrainingDownLoadFolder";
		File folder = new File(folderPath);

		ChromeOptions options = new ChromeOptions();

		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\Training\\TrainingDownLoadFolder");

		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();

		// String[] files = folder.list();

		String[] files = folder.list();
		System.out.println(files.length);
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}

	}

}
