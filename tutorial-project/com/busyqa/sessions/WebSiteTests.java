package com.busyqa.sessions;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WebSiteTests {

	@BeforeSuite
	public void initiateTests() {
		System.out.println("Initiated Tests by checking infra");

	}

	@AfterSuite
	public void cleanUp() {
		System.out.println("Clean up");

	}

	@BeforeMethod
	public void browserLaunch() {

		System.out.println("Launch Browser");

	}

	@AfterMethod
	public void quitBrowser() {

		System.out.println("Quit Browser");

	}

	@Test
	public void test1() {
		System.out.println("Verify Registration");
		assertEquals("INDIA", "CANADA");
		
	}

	@Test
	public void test2() {
		System.out.println("Verify Login using registered user");
		assertEquals("INDIA", "CANADA");
		
	}

}
