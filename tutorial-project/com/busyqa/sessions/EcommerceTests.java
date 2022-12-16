package com.busyqa.sessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EcommerceTests {

	@BeforeSuite
	public void test1() {
		System.out.println("ecommercetest-test1@BeforeSuite");
	}

	@AfterSuite
	public void test2() {
		System.out.println("ecommercetest-test2@AfterSuite");
	}

	@BeforeClass
	public void test3() {
		System.out.println("ecommercetest-test3@BeforeClass");
	}

	@AfterClass
	public void test4() {
		System.out.println("ecommercetest-test4@AfterClass");
	}

	@BeforeTest
	public void test5() {
		System.out.println("ecommercetest-test5@BeforeTest");
	}

	@AfterTest
	public void test6() {
		System.out.println("ecommercetest-test6@AfterTest");
	}

	@BeforeMethod
	public void test7() {
		System.out.println("ecommercetest-test7@BeforeMethod");
	}

	@AfterMethod
	public void test8() {
		System.out.println("ecommercetest-test6@AfterMethod");
	}

	@Test()
	public void atest1() {
		System.out.println("ecommercetest-atest1@Test");
	}

	@Test
	public void atest2() {
		System.out.println("ecommercetest-atest2@Test");
	}

}
