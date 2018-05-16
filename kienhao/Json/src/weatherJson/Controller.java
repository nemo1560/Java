package weatherJson;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class Controller {
	
	public Controller() throws JsonParseException, JsonMappingException, IOException {
		
	}
	
	public double getcurrentTemp() throws JsonParseException, JsonMappingException, IOException {
		double temp = new Model().readJson().getQuery().getResults().getChannel().getItem().getCondition().getTemp();
		return temp;
	}
	
	public String getCurrentWeather() throws JsonParseException, JsonMappingException, IOException {
		String weather = new Model().readJson().getQuery().getResults().getChannel().getItem().getCondition().getText();
		return weather;
	}

	public String getCurrentDate() throws JsonParseException, JsonMappingException, IOException {
		String date = new Model().readJson().getQuery().getResults().getChannel().getItem().getCondition().getDate();
		return date;
	}
}
