package crudOperationWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Delete {
	@Test
	public void deleting()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		//TO PERFORM ACTIONS
		when()
		.delete("/projects/TY_PROJ_9573")
		//TO VALIDATE
		.then()
		.statusCode(204)
		.log().all();
	}

}
