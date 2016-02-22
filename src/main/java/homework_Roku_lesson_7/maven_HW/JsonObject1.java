package homework_Roku_lesson_7.maven_HW;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class JsonObject1 {

	public Driver[] driver;
	
	@JsonCreator
	public JsonObject1(@JsonProperty("driver")Driver[] driver){
		this.driver = driver;
	}

	public Driver[] getDriver() {
		return driver;
	}

	public void setDriver(Driver[] driver) {
		this.driver = driver;
	}
	
	
}
