package crudOperationWithBdd;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;



public class PostARequest {
	@Test
	public void postingARequest()
	{
		//step1 precondition
		JSONObject js=new JSONObject();
		js.put("createdBy", "amit");
		js.put("projectName", "ty_ak-11811");
		js.put("status","completed");
		js.put("teamSize", 10);
		baseURI="http://rmgtestingserver";
		port=8084;
		
		
		given()
		.body(js)
		.contentType(ContentType.JSON)
		//step2====>TO PERFORMACTIONS
		
		
		.when()
		.post("/addProject")
		
		//Step3 =====>TO VALIDATE
		
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();

		
		
		
		
	}



	

}
