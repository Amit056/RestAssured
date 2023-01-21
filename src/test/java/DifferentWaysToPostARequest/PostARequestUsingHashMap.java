package DifferentWaysToPostARequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostARequestUsingHashMap {
@Test
public void postingRequestUsingHashMap()
{
	HashMap<Object,Object> h=new HashMap<Object,Object>();
	h.put("createdBy","ak");
	h.put("projectId", "akb17");
	h.put("projectName", "ak9191919");
	h.put("teamSize",10);
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given()
	.body(h)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then()
	.log().all()
	.assertThat().statusCode(201);
	
	
	}

}
