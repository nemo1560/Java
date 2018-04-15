package Infomation;

public abstract class Person{
	private String name;
	protected int age;
	protected int weight;
	protected int height;
	protected Where where; //instance lai class where de truyen gia tri HAS-A
	
	protected Person() {
		// TODO Auto-generated constructor stub
	}
	
	protected Person(String name, int age, int weight, int height, Where where) {
		this.where = where;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	// khi dung super(tham so) thi phai truyen tham so cua class cha vao contructor cua class con, neu ko co java se yeu cau static
	protected Person(String name, int age, int weight, int height, String province, String country) { 
		super(); 
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public Where getWhere() {
		return where;
	}

	public void setWhere(Where where) {
		this.where = where;
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
	
	abstract void eat();
	abstract void walk();
	abstract void talk();
	abstract void work();
	
}
