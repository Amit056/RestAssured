import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import GenericLib.FileLib;

public class Practice {
@Test
public void ex() throws Throwable
{
	

	FileLib fileLib=new FileLib();
	FileInputStream f=new FileInputStream("./src/test/resources/Data/Book1.xlsx");
	Workbook wb = WorkbookFactory.create(f);
	String[][] detaProvder = fileLib.readDetaFromExcel("Sheet1",wb);
	Object[][] data=detaProvder;
	System.out.println("AMIT KUMAR RAY");
	
	System.out.println(data[1][3]);

}
}
