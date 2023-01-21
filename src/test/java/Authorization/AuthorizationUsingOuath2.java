package Authorization;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthorizationUsingOuath2 {
	@Test
	
	public void authorizationUsingOuath2()
	{
		
		//Create a request to generate accesss token 
Response	resp=  given()
	  .formParam("client_id", "AkR121")
	  .formParam("client_secret","d4cc34c42ba1f2d574a8fc264dc4d252")
	  .formParam("grant_type", "client_credentials")
	  .formParam("redirect_uri", "https://amitray.com")
	  .formParam("code", "authorization_code")
	  
	  .when()
	  .post("http://coop.apps.symfonycasts.com/token");

String token = resp.jsonPath().get("access_token");
System.out.println(token);

//Create another request and use the token to access the APIs
given()
.auth().oauth2(token)
.pathParam("USER_ID", 4217)

.when()
.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")

.then()
.log().all();
	  	  
}
}