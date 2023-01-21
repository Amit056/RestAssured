package GitHubPractice;
import static io.restassured.RestAssured.given;
import java.util.List;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.response.Response;
public class PrintingAllRepoFromGitHub {
	@Test
	public void patchARequest()
	{
		JSONObject js=new JSONObject();
		js.put("name", "ak99");



		Response resp =given()
				.pathParam("username", "Amit056")
				.queryParam("page",1)

				.when()
				.get("https://api.github.com/users/{username}/repos");

		List<String> projectName=resp.jsonPath().get("name");

		for(String pName:projectName)
		{
			System.out.println(pName);
		}


	}
}
