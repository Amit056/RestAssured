package Parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QuerryParameter {
	@Test
	public void querryParameter()
	{
		
		baseURI="https://reqres.in";
		
		
		
		given()
		.queryParam("page", 2)
		
		.when()
		.get("/api/users")
		
		.then()
		.log().all()
		.assertThat().statusCode(200);
	}

}
