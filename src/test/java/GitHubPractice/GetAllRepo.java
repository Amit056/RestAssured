package GitHubPractice;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;

public class GetAllRepo {
@Test
public void getAllRepo()
{
	{
		String expDeta = "R_kgDOIn045Q";

		ValidatableResponse resp = given()
				.auth()	
				.oauth2("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")
				.pathParam("username","Amit056")

				.when()
				.get("https://api.github.com/users/{username}/repos")
				.then().log().all();
		

		
	}
}
}

