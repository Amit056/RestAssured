package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import GenericLib.EmployDetailsClass;

public class DeserializationEx {
	
	@Test
	public void deserializationEx() throws JsonParseException, JsonMappingException, IOException 
	{
			ObjectMapper map=new ObjectMapper();
			//File file=new File("D:\\Users\\Abhinav\\eclipse-workspace\\amitRay\\RestAssured\\Sample.json");
			File file=new File("./Sample.json");
		//	EmployDetailsClass emp =map.readValue(new File("./Sample.json"),EmployDetailsClass.class );
			//EmployDetailsClass emp=map.readValue(file, EmployDetailsClass.class);
			EmployDetailsClass emp=map.readValue(file,EmployDetailsClass.class);
			System.out.println(emp.getCreatedBy());
		
		
		
	}

}