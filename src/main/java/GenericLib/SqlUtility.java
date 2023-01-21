package GenericLib;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SqlUtility {
@Test
public String readDetaFromDataBase(String querry,int index,String expectedDeta) throws SQLException
{
	Driver db=new Driver();
	DriverManager.registerDriver(db);
	Boolean deta =false;
	 String actualData=null;
	Connection connection = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
	Statement statement = connection.createStatement();
	 ResultSet result = statement.executeQuery(querry);
	
	 while(result.next())
	 {
		 if(result.getString(index).equalsIgnoreCase(expectedDeta))
		 {
			 actualData= result.getString(index);
			 deta=true;
			 break;
		 }
		 
		 else {
			 actualData= result.getString(index);
		}
	 }
	 if(deta==false) 
	 {
		 System.out.println("data not found and VERIFICATION FALL");
		 return actualData;
	 }
	 else {
		 System.out.println("data is found and VERIFICATION PASS");
		 return actualData;
	}
	
}
}
