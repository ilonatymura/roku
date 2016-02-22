package homework_Roku_lesson_7.maven_HW;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Driver 
{
	private String id;
    private String name;
    private int age;
    private Car car;
    
    @JsonCreator
    
    public Driver(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("age") int age, @JsonProperty("car") Car car){
    	this.id = id;
    	this.name = name;
    	this.age = age;
    	this.car = car;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
    
    
}
