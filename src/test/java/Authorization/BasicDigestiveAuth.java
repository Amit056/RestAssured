package Authorization;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicDigestiveAuth {
	
	@Test
	
	public void basicDigestiveAuth()
	{
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.auth().digest("rmgyantra","rmgy@9999")
		
		.when()
		.get("/login")
		
		.then()
		.log().all();
		
	}

}
