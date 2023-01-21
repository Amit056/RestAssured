package crudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjects {
	@Test
	public void GetAllProjects()
	{
	Response response = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_16229");
		response.then().log().all();
		}
	}


