package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ValidatingADynamicRespose {
@Test
public void validatingADynamicRespose()
{
	String expectedDeta="TY_PROJ_16896";
	baseURI="http://rmgtestingserver";
	port=8084;
	
	Response rep = when().get("/projects");
	
  List<String> pid = rep.jsonPath().get("projectId");
  
  for(String actualDeta:pid)
  {
	  // System.out.println(actualDeta);
	  
	  if(expectedDeta.equals(actualDeta))
	  {  System.out.println(actualDeta);
	  System.out.println("deta verified");
	  }
	  }
  }
}

