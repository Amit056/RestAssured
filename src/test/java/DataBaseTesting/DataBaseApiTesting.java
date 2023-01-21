package DataBaseTesting;

import static io.restassured.RestAssured.baseURI;

import java.sql.SQLException;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.testng.annotations.Test;

import GenericLib.EmployDetailsClass;
import GenericLib.GenerateRandomNumber;
import GenericLib.SqlUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DataBaseApiTesting {
	@Test
	public void dataBaseApiTesting() throws Throwable
	{
		GenerateRandomNumber g=new GenerateRandomNumber();
		EmployDetailsClass emp=new EmployDetailsClass("ak6378"+g.generateRandomNum(),"ty_K-075"+g.generateRandomNum(), 10,201);
		baseURI="http://rmgtestingserver";
		port=8084;
		
	Response resp = given()
		.body(emp)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject");
		
	JsonUtility js=new JsonUtility();
	String expDeta = js.getJsonDeta(resp, "projectId");
	System.out.println("EXPECTED deta====>"+expDeta);
	//String expDeta = resp.jsonPath().get;
	
	
	String querry = "select * from project";
	
	SqlUtility  mySql=new SqlUtility();
	String actualData  = mySql.readDetaFromDataBase(querry,1,expDeta );
	System.out.println("ACTUALDeta======>"+actualData);
	resp.then().log().all();
		}

}
