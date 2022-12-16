package com.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Put {
	
	
	@Test
	public void putTestUpdated() {		
		String body ="{\"name\":\"Girish\",\"job\":\"ottawaresident\"}";
		given()		
			.contentType("application/json")
			.accept("application/json")		
			.body(body)
	
		.when()					
			.put("https://reqres.in/api/users/7")					
		.then()
			.statusCode(200)
			.log().all();

	}

}
