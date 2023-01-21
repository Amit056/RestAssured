package Authorization;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class UsingBasic {
@Test
public void usingBasic()
{
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given()
	.auth().basic("rmgyantra","rmgy@9999")
	
	
	.when()
	.get("/login")
	
	.then()
	.log().all()
	.assertThat().statusCode(202);
	
	


}
}
