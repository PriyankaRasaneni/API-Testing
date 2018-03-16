package com.api.test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import common.EndPoint;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Employee {

	@Test(groups = "demo")
	public void ValidateEmployee(){
	
//given().get("https://jsonplaceholder.typicode.com/posts/1").then().statusCode(200).log().all();

Response resp=	RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
	
	int code = resp.getStatusCode();
	System.out.println("Status code is "+code);
	
	String data = resp.asString();
	
	System.out.println("Data is "+data);
	
	Assert.assertEquals(code, 200);
	
	System.out.println("Response Time is "+resp.getTime());
	
	
	}
//@Test(groups = "demo")
//public void validateEploye(){
//	
//	given().get(EndPoint.GET_userId).then().statusCode(200).log().all();
//	
//	
//}



}


