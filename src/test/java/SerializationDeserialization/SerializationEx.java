package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import GenericLib.EmployDetailsClass;


public class SerializationEx {
	@Test
	public void serializationEx() throws JsonGenerationException, JsonMappingException, IOException
	{
		EmployDetailsClass emp=new EmployDetailsClass("ak18764","ty_ak_122", 10, 204);
		
		ObjectMapper map=new ObjectMapper();
		map.writeValue(new File("./Sample.json"), emp);
		
		}
}
