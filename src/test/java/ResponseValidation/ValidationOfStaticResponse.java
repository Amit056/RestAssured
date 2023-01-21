package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class ValidationOfStaticResponse {
	
	@Test
	public void validationOfStaticResponse()
	{
		String expectedDetaString="TY_PROJ_11111";
		baseURI="http://rmgtestingserver";
		port=8084;
		
		Response rep = when().get("/projects");
		
		//validation
		 String actualDeta = rep.jsonPath().get("[0].projectId");
				 Assert.assertEquals(expectedDetaString, actualDeta);
		
		rep.then().log().all();
	}

}
