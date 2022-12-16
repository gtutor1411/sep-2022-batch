package com.api.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ResponseObject {
	
	
	@Test(enabled=true)
	public void getTest() {	
		//reporting
		Response respo= given()
		.pathParams("userid","79")
		.when()
			.get("https://gorest.co.in/public/v2/users/{userid}");
		
		/*
		.then()
			.statusCode(200)
			.body("gender", equalTo("female"))
			.log().body();
			*/
		System.out.println(respo.getHeader("Content-Type"));
		
		Headers headers =respo.getHeaders();
		//n numbers of headers 
		
		for(Header h: headers) {
			System.out.println(h.getName()+"--->"+h.getValue());
		}
		
		
		ResponseBody rb =respo.getBody();
		
		System.out.println("***************************$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(rb.asString());
		rb.asString().contains("id");
		
	}
	
	

}
