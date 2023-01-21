package crudOperationWithBdd;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetAllProjects {
	@Test
	public void getAllProjects()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		//step2====>TO PERFORMACTIONS
		when()
		.get("/projects")
		
		//Step3 =====>TO VALIDATE
		.then()
		.log().all();
	}

}
