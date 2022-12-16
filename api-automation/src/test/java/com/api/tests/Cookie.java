package com.api.tests;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Cookie {
	

	@Test
	public void testUsingXpath() {

		Response response =given()		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/");	
		
		//header
		System.out.println(response.getHeader("Content-Type"));		
		//cookies
		System.out.println(response.getCookie("cookie"));		
		//body
		ResponseBody rb =response.getBody();		
		System.out.println("***************************$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(rb.asString());		
	
	}
	

}
