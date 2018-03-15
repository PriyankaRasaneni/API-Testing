package com.api.test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import common.EndPoint;
public class Employee {

	@Test
	public void ValidateEmployee(){
		
		given().get("https://jsonplaceholder.typicode.com/posts/1").then().statusCode(200).log().all();
	}
@Test(groups = "demo")
public void validayeEployee(){
	
	given().get(EndPoint.GET_userId).then().statusCode(200).log().all();
	
	
}



}


