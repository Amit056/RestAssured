package crudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProjectFromServer {
@Test
public void GetAllProjects()
{
Response response = RestAssured.get("http://rmgtestingserver:8084/projects");
	response.then().log().all();
	}
}
