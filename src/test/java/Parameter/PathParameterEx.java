package Parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameterEx {
	@Test
	public void PathParameterEx ()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.pathParam("pid","TY_PROJ_16910")
		
		.when()
		.get("/projects/{pid}")
		
		.then()
		.log().all();
	}

}
