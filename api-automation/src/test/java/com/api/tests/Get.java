package com.api.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Get {
	
	@Test
	public void getTest() {	
		//reporting
		given()
		//here give all necessary params if needed
		.when()
			.get("https://gorest.co.in/public/v2/users/79")	
		.then()
			.statusCode(200)
			.body("gender", equalTo("female"))
			.log().body();
	}
	
	
	@Test
	public void getTest2() {
		
		given()
		
		.when()
			.get("https://gorest.co.in/public/v2/users/79")			
		.then()
			.statusCode(200);
		
	}
	
	

}
