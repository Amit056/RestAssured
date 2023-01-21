package RequestChaining;


import org.testng.annotations.Test;

import GenericLib.GenerateRandomNumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pogoClass.PojoClassEx;

public class RequestChaining23 {

	@Test
	public void prac()
	{
		GenerateRandomNumber g=new GenerateRandomNumber();
		PojoClassEx p=new PojoClassEx("ak"+g.generateRandomNum(), "ty-ak-"+g.generateRandomNum(), "10","201");
		
		RequestSpecification req = RestAssured.given();
		
		req.body(p);
		req.contentType(ContentType.JSON);
		
		
		Response resp = req.post("http://rmgtestingserver:8084/addProject");
		/*String proid = resp.jsonPath().d
		System.out.println(proid);
		
		req.pathParam("id", proid);
		RestAssured.get("http://rmgtestingserver:8084/projects/{id}");*/
	
		System.out.println(resp.then().log().all());
		
		String proid = resp.jsonPath().get("projectId");
		System.out.println(proid);
		
		req.pathParam("id", proid);
		RestAssured.get("http://rmgtestingserver:8084/projects/:{id}");
		//System.out.println(resp.getBody().asString());
		//resp.statusCode();
		//System.out.println(resp.asPrettyString());

		
	}
}
