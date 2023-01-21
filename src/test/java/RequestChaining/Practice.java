package RequestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import GenericLib.GenerateRandomNumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pogoClass.PojoClassEx;

public class Practice {
	@Test
	public void requestChainingEx()
	{
		GenerateRandomNumber g=new GenerateRandomNumber();
		PojoClassEx p=new PojoClassEx("ak"+g.generateRandomNum(), "ty-ak-"+g.generateRandomNum(), "10","201");
		baseURI="http://rmgtestingserver";
		port=8084;
		
		
	 Response resp = RestAssured.given()
			
			.body(p) 
			.contentType(ContentType.JSON)
			
			.when()
			.post("/addProject");
	 
	String exp = resp.jsonPath().get(baseURI);		
			 
}
}