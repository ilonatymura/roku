package homework_Roku_lesson_7.maven_HW;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonParser1 {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		InputStream inp = new FileInputStream("src/main/resources/drivers.json"); 
		  ObjectMapper obMapper = new ObjectMapper();
		  obMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		  obMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		  JsonObject1 json = obMapper.readValue(inp,JsonObject1.class);

		  System.out.println(json.getDriver()[0].getName());
		  System.out.println(json.getDriver()[1].getCar().getName());
		  }

}
