package GitHubPractice;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class DeleteARepo {
@Test
public void deleteARepoFromGitHub()
{
	given()
	.pathParam("owner","Amit056")
	.pathParam("repo","importantPrpgram")
	
	.when()
	.delete("https://api.github.com/repos/{owner}/{repo}/automated-security-fixes")
	
	.then().log().all();

}
}
