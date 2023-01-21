package ComplexObjectWithSpouse;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pogoClass.PogoClassParent;

public class DeserializationComplexObjectWithSpouse {
@Test

public void deserializationComplexObjectWithSpouse() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper map=new ObjectMapper();
	
	//PogoSpouseClass s=new PogoSpouseClass(null, null);
	File file=new File("./Sample.json");
	PogoClassParent p = map.readValue(file,PogoClassParent.class);
	System.out.println(p.getCreatedBy());
}
}
