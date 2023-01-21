package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import GenericLib.PojoArrayEx;

public class DeserializationArrayEx {
@Test
	public void deserializationEx() throws JsonParseException, JsonMappingException, IOException 
	{
			ObjectMapper map=new ObjectMapper();
			File file=new File("./Sample.json");
			PojoArrayEx emp=map.readValue(file,PojoArrayEx.class);
			System.out.println(emp.getCreatedBy());
	System.out.println(emp.getTeamSize()[0]);
		
		
}
}