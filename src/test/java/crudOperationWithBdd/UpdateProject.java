package crudOperationWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject {
	@Test
	public void updatingAProject()
	{
		JSONObject js=new JSONObject();
		js.put("createdBy", "amit");
		js.put("projectName", "ty_ak-11811");
		js.put("status","completed");
		js.put("teamSize", 10);
		baseURI="http://rmgtestingserver";
		port=8084;
		
		//PreCONDitions
		given()
		.body(js)
		.contentType(ContentType.JSON)
		
		//ACTIONS
		.when()
		.put("/projects/TY_PROJ_9573")
		
		//Validate
		.then()
		.statusCode(200)
		.log().all();
		
	}

}
