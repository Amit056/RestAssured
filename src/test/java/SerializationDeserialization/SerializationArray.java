package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import GenericLib.EmployDetailsClass;
import GenericLib.PojoArrayEx;

public class SerializationArray {
	@Test
	public void serializationEx() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] ar= {234,768};
		PojoArrayEx emp=new PojoArrayEx("ak18764","ty_ak_122", ar, 10);
		
		ObjectMapper map=new ObjectMapper();
		map.writeValue(new File("./Sample.json"), emp);
		
		}

}
