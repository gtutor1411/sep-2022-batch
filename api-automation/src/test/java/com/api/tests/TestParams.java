package com.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class TestParams {
	
	@Test(enabled=true)
	public void getTest() {	
		//reporting
		given()
		.pathParams("userid","79")
		.when()
			.get("https://gorest.co.in/public/v2/users/{userid}")	
		.then()
			.statusCode(200)
			.body("gender", equalTo("female"))
			.log().body();
	}
	
	
	@Test
	public void queryTest() {
		
		given()
		//.queryParam("postId", "1")		
		.when()
			.get("https://jsonplaceholder.typicode.com/comments?postId=1")
		
		.then()
			.statusCode(200)			
			.log().body();
		
	}

}
