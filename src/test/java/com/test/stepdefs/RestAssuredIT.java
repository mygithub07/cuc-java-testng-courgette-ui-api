package com.test.stepdefs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import io.restassured.RestAssured;
import org.apache.commons.lang3.StringUtils;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;


public class RestAssuredIT {
    
    public static Response response;
	public static ValidatableResponse json;
	public static RequestSpecification request;
	public  static String ISBN;
	//private String ENDPOINT_GET_BOOK_BY_ISBN = "https://www.googleapis.com/books/v1/volumes";
	
	@Given("a book exists with an isbn of {string}")
	public void a_book_exists_with_isbn(String isbn){
		RestAssuredIT.ISBN = isbn;
		RestAssured.baseURI = "https://www.googleapis.com/books/v1/volumes";
		RestAssuredIT.request = RestAssured.given();
		
	}
	
	@When("a user retrieves the book by isbn")
	public void a_user_retrieves_the_book_by_isbn(){
		RestAssuredIT.response =  RestAssuredIT.request.queryParam("q", RestAssuredIT.ISBN).get();
		Assert.assertNotNull(response);
		System.out.println("response: " + RestAssuredIT.response.getBody().prettyPrint());
	}
	
	@Then("the status code is {int}")
	public void verify_status_code(int statusCode){
		RestAssuredIT.json = RestAssuredIT.response.then().statusCode(statusCode);
		System.out.println("status code:  " + RestAssuredIT.response.getStatusCode());
		Assert.assertEquals(statusCode, RestAssuredIT.response.getStatusCode());
		
	}
	
	@And("response includes the following$")
	public void response_equals(Map<String,String> responseFields){
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if(StringUtils.isNumeric(field.getValue())){
				RestAssuredIT.json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
			}
			else{
				RestAssuredIT.json.body(field.getKey(), equalTo(field.getValue()));
			}
		}
	}
	
	@And("response includes the following in any order")
	public void response_contains_in_any_order(Map<String,String> responseFields){
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if(StringUtils.isNumeric(field.getValue())){
				RestAssuredIT.json.body(field.getKey(), containsInAnyOrder(Integer.parseInt(field.getValue())));
				
			}
			else{
				RestAssuredIT.json.body(field.getKey(), containsInAnyOrder(field.getValue()));
			}
		}
	}
	
	@AfterStep
    public void afterEveryStep(){
		System.out.println("***after every step****");
	}
	
	@After
    public void afterEverything(){
		System.out.println("***after everything****");
	}
}
