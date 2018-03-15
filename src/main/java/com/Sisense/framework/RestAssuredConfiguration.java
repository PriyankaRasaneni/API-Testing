package com.Sisense.framework;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class RestAssuredConfiguration {

	@BeforeSuite(alwaysRun = true)
	public void configure(){
		
		RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
		RestAssured.basePath="/posts";
		
		
		
		
	}
		
		
	

}
