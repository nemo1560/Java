package Infomation;

public class Person {
	private String name;
	protected int age;
	protected int weight;
	protected int height;
	
	protected Person() {
		// TODO Auto-generated constructor stub
	}

	protected Person(String name, int age, int weight, int height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected int getWeight() {
		return weight;
	}

	protected void setWeight(int weight) {
		this.weight = weight;
	}

	protected int getHeight() {
		return height;
	}

	protected void setHeight(int height) {
		this.height = height;
	}

	
}
