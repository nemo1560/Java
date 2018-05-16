package weatherJson;

import java.io.IOException;
import java.net.URL;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import weatherJson.Json_fields.weather_json;
import weatherJson.entity.link_Json;

public class Model {
	
	public Model() {
		
	}	
	
	public weather_json readJson() throws JsonParseException, JsonMappingException, IOException {
		URL url = new URL(new link_Json().getLink());
		ObjectMapper obj = new ObjectMapper();
		weather_json queryfile = obj.readValue(url, weather_json.class);
		return queryfile;
	}	
}
