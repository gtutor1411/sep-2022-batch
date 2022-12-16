package com.api.tests;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class XmlResponses {

	@Test
	public void xmlTest1() {

		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/").then().statusCode(200)
				.body("CUSTOMER.FIRSTNAME", equalTo("Bill")).body("CUSTOMER.LASTNAME", equalTo("Clancy"))
				.body("CUSTOMER.CITY", equalTo("Seattle")).log().body();
	}

	@Test
	public void lazyTest() {
		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")

				.then().body("CUSTOMER.text()", containsString("Seattle")).statusCode(200);
	}

	@Test
	public void testUsingXpath() {
		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")

				.then().body(hasXPath("/CUSTOMER/FIRSTNAME"), containsString("Bill")).statusCode(200);

	}

}
