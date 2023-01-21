package GitHubPractice;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PatchARepo {
	@Test
	public void patchARepo()
	{
		JSONObject js=new JSONObject();

		String deta="ak99";
		Response resp = given()
				.auth()	
				.oauth2("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")
				.pathParam("username","Amit056")

				.when()
				.get("https://api.github.com/users/{username}/repos");

		List<String> names = resp.jsonPath().get("name");

		for(String repoName:names)
		{

			if(deta.equals(repoName))
			{
				System.out.println(repoName);
				System.out.println("repository is found ");
				js.put("name","ak629999");

				given()
				.auth()
				.oauth2("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")
				.body(js)
				.contentType(ContentType.JSON)
				.pathParam("owner","Amit056")
				.pathParam("detaParameterRepo", repoName)
				.body(js)

				.when()
				.patch("https://api.github.com/repos/{owner}/{detaParameterRepo}")

				.then()
				.log().all();




			}
		}



	}
}
