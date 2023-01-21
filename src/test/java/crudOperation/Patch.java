package crudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Patch {
	@Test
	public void updatingProject()
	{

		JSONObject js=new JSONObject();
		//step1:create the pre-requests-request body
		
		js.put("createdBy", "amit");
		js.put("projectName", "ty_ak-1186");
		js.put("status","completed");
		js.put("teamSize", 10);
		
		RequestSpecification req = RestAssured.given();
		req.body(js);
		req.contentType(ContentType.JSON);
		
		//step2:perform the actions;
		
		Response response = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_16229");
		//validate the response
		response.then().log().all();
		
	}
}
