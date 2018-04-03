package TINHDAHINH.overiding;

public class person {
	private String name;
	private int age;
	
	public person() {
		// TODO Auto-generated constructor stub
	}

	public person(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	
}
