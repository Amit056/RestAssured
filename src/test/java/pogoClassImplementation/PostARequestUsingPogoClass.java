package pogoClassImplementation;
import static io.restassured.RestAssured.baseURI;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenericLib.GenerateRandomNumber;
import io.restassured.http.ContentType;
import pogoClass.PojoClassEx;

public class PostARequestUsingPogoClass {
@Test
public void postARequestUsingPogoClass()
{
	GenerateRandomNumber g=new GenerateRandomNumber();
	PojoClassEx p=new PojoClassEx("ak"+g.generateRandomNum(), "ty-ak-"+g.generateRandomNum(), "10","201");
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given()
	.body(p)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then()
	.log().all()
	.time(Matchers.lessThan(1500l),TimeUnit.MILLISECONDS)
	
	.assertThat().statusCode(201);
	}
}
