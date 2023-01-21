package DataProvider;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLib.FileLib;
import GenericLib.GenerateRandomNumber;
import io.restassured.http.ContentType;
import pogoClass.PojoClassEx;

public class DataProviderFromExcel {
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
	public Object[][] detaProviderEx() throws Throwable
	{
		FileLib fileLib=new FileLib();
		FileInputStream f=new FileInputStream("./src/test/resources/Data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String[][] detaProvder = fileLib.readDetaFromExcel("Sheet1",wb);
		Object[][] data=detaProvder;
		System.out.println("AMIT KUMAR RAY");

		return data;
	}

}
