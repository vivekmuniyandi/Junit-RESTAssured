package com.example.sample.test;

import org.junit.Test;

import org.hamcrest.Matchers;
import io.restassured.RestAssured;

public class SampleRESTAssuredTest {

  @Test
  public void checkStatus() {
    RestAssured.given().when().get("http://localhost:8184/sample").then().statusCode(200);
  }

  @Test
  public void checkContent() {
    RestAssured.given().when().get("http://localhost:8184/sample").then().body("result", Matchers.equalTo("success"));
  }
}
