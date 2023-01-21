package ComplexObjectWithSpouse;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pogoClass.PogoClassParent;
import pogoClass.PogoSpouseClass;

public class SerializationOfComplexObjectWithSpouse {
@Test
public void serializationEx() throws JsonGenerationException, JsonMappingException, IOException
{
	String[] projectName= {"ty_ak_12344","ty_ak_12344"};
	PogoSpouseClass s=new PogoSpouseClass("ram",projectName);
	
	PogoClassParent p=new PogoClassParent("ratna", "jharkahand", "Karnataka", s);
	
	ObjectMapper map=new ObjectMapper();
	map.writeValue(new File("./Sample.json"), p);

}
}
