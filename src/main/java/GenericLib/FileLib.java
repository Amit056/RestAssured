package GenericLib;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;

public class FileLib {

	/*
	 * 
	 * DATA provider
	 */
	public String[][]  readDetaFromExcel(String sheetName,Workbook workbook) throws Throwable
	{
		
		DataFormatter df=new DataFormatter();
		int  rownum=workbook.getSheet(sheetName).getLastRowNum();
		int cellnum=workbook.getSheet(sheetName).getRow(0).getLastCellNum();
		String[][] arr=new String[rownum][cellnum];
		for(int i=0;i<rownum;i++)
		{
			for(int j=0;j<cellnum;j++)
			{
				arr[i][j]=df.formatCellValue(workbook.getSheet(sheetName).getRow(i+1).getCell(j));
			}
	
		
		}
		return arr;
}
}
