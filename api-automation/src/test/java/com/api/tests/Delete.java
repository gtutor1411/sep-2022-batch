package com.api.tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Delete {
	
	
	@Test
	public void deleteBooking() {
		
		given()
			.auth()			
			.preemptive()
			.basic("admin", "password123")		
			.header("Accept", ContentType.JSON.getAcceptHeader())
		.when()
			.delete("https://restful-booker.herokuapp.com/booking/2385")		
		.then()
			.statusCode(201)			
			.log().all();
		
	}

}
