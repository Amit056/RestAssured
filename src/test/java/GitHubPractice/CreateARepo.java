package GitHubPractice;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class CreateARepo {

	@Test
	public void createARepo()
	{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", "ak0000");
		ValidatableResponse resp = given()
				.auth()	
				.oauth2("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")
				.body(jsonObject)
				.contentType(ContentType.JSON)
				.when()
				.post("https://api.github.com/user/repos")
				.then().log().all();



	}

}

