package SampleWindowJson;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class readJsonToObject {
	
	public readJsonToObject() throws JsonParseException, JsonMappingException, IOException {
		String path = new windowFile().openFile().getPath();
		ObjectMapper objmap = new ObjectMapper();
		person ps = objmap.readValue(new File(path), person.class);
		System.out.println(ps);
	}

}
