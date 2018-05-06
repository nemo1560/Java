package SampleWindowJson;

import java.util.ArrayList;

public class person {
	private String name;
	private int age;
	private ArrayList<cars> cars;
	
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

	public ArrayList<cars> getCars() {
		return cars;
	}
	public void setCars(ArrayList<cars> cars) {
		this.cars = cars;
	}
	public person() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name "+ name + 
				", age "+ age + 
				", car "+ cars;
	}
	
}
