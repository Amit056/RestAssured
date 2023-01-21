package DifferentWaysToPostARequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostARequestUsingJsonObject {
	@Test
	public void postingRequestUsingJsonObject()
	{
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
		
		.when()
		.post("/addProject")
		
		.then()
		.log().all()
		.assertThat().statusCode(201);
		
		
	}
		
	}


