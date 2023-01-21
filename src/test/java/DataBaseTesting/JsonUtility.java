package DataBaseTesting;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class JsonUtility {
@Test
public String getJsonDeta(Response response,String path)
{ 
	String jsonDetaString=response.jsonPath().get(path);
	return jsonDetaString;
}
}
