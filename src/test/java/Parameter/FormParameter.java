package Parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class FormParameter {
	@Test
	public void formParameter()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.formParam("createdBy", "ram09876")
		.formParam("status", "completed")
		.formParam("projectName", "ty-ak--796496177")
		.formParam("msg","Successfully Added")
		
		
		.when()
		.post("/addProject")
		
		
		.then()
		.log().all()
		.assertThat().statusCode(201);
		
}


}