package RequestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLib.GenerateRandomNumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import pogoClass.PojoClassEx;


public class RequestChainingEx {
	
	@Test
	public void requestChainingEx()
	{
		GenerateRandomNumber g=new GenerateRandomNumber();
		PojoClassEx p=new PojoClassEx("ak"+g.generateRandomNum(), "ty-ak-"+g.generateRandomNum(), "10","201");
		baseURI="http://rmgtestingserver";
		port=8084;
		
		Response resp =
				
				given()
				.body(p)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject");
		
		String proid = resp.jsonPath().get("projectId");
		
		resp.then().log().all();
		//sending another request using PATHPARAMETER
		given()
		.pathParam("id",proid)
		.when()
		.get("/projects/{id}")
		
		.then()
		.log().all();
		
			}

}
