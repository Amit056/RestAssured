package DataProvider;

import static io.restassured.RestAssured.baseURI;


import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLib.GenerateRandomNumber;
import io.restassured.http.ContentType;
import pogoClass.PojoClassEx;

public class DataProviderEx {
@Test(dataProvider = "getDeta")
public void  dataProviderEx(String createdBy,String projectName, String teamSize,String statusCode)
{
	GenerateRandomNumber g=new GenerateRandomNumber();
	PojoClassEx pg=new PojoClassEx(createdBy+g.generateRandomNum(),projectName+g.generateRandomNum(), teamSize, statusCode);

	baseURI="http://rmgtestingserver";
	port=8084;
	
	given()
	.body(pg)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then()
	.log().all();
	
}
@DataProvider(name="getDeta")
public Object[][] detaProviderEx() {

	Object[][] data=new Object[3][4];	

	data[0][0] = "Chaitra";
	data[0][1] = "Dell";
	data[0][2] = "10";
	data[0][3] ="12";
	
	data[1][0] = "Vijay";
	data[1][1] = "HP";
	data[1][2] = "8";
	data[1][3] = "15";
	
	data[2][0] = "Pavan";
	data[2][1] = "TYSS";
	data[2][2] = "23";
	data[2][3] ="20";
	
	return data;
}
}
