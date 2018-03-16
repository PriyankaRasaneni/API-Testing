package com.Sisense.framework;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

//import com.api.test.RequestSpecification;
//import com.api.test.Response;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredConfiguration {

	@BeforeSuite(alwaysRun = true)
	public void configure(){
		
		RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
		RestAssured.basePath="/posts";
	
		
	}
		public RequestSpecification getRequestSpecification(){
			return RestAssured.given().contentType(ContentType.JSON);
		
			
	}
		
	 public Response getResponse(RequestSpecification requestSpecification,String endpoint, int status){
		 
		 Response response = requestSpecification.get(endpoint);
		 Assert.assertEquals(response.getStatusCode(), status);
		 Assert.assertEquals(response.getTimeIn(TimeUnit.SECONDS)<=10, "Response Time is not within limit");
		 response.then().log().all();
		 return response;
		 
		 
		 
		 
	 }

}
