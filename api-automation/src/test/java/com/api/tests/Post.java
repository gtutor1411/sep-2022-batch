package com.api.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post {
	
	
	@Test
	public void postTest() {
		String body ="{\"firstname\":\"Garry\",\"lastname\":\"Thomas\",\"totalprice\":500,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}";		
		
		given()
		.contentType("application/json")
		.body(body)	
		
		.when()
			.post("https://restful-booker.herokuapp.com/booking")
		.then()
			.statusCode(200)
			.log().body();
		
		
		
	}	
	



}
