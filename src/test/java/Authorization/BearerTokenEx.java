package Authorization;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerTokenEx {

	@Test
	public void usingBearerToken()
	{
		baseURI=" https://api.github.com";
		
		JSONObject js=new JSONObject();
		js.put("name","RepoNameByRestAssured");
		
		
		given()
		.auth()
		.oauth2("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")
		.body(js)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/user/repos")
		
		.then()
		.log().all();
		
		
	}
}
