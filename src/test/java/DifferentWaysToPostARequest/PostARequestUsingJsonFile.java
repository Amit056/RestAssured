package DifferentWaysToPostARequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostARequestUsingJsonFile {
	@Test
	public void usingJsonFile()
	{
		//File file=new File("D:\\Users\\Abhinav\\eclipse-workspace\\amitRay\\RestAssured\\src\\test\\resources\\Amit.json");
		File file=new File("./src/test/resources/JsonFile/ak.json");
		baseURI="http://rmgtestingserver";
		
		port=8084;
		 given()
		 .body(file)
		 .contentType(ContentType.JSON)
		 
		 .when()
		 .post("/addProject")
		 .then()
		 .assertThat().statusCode(201)
		 .log().all();
	}

}
