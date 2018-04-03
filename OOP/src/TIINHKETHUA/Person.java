package TIINHKETHUA;

public class Person {
	//Khai báo thuộc tính
	//protected thì phải extend class mới sử dụng được get/set
	private  String sName;
	private short age;
	private double height;
	private double weight;
	private Address address;
	
	//Dinh nghia ham tao 
	protected Person() {
		// TODO Auto-generated constructor stub
	}

	protected Person(String sName, short age, double height, double weight, Address address) {

		this.sName = sName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.address = address;
	}



	protected String getsName() {
		return sName;
	}

	protected void setsName(String sName) {
		this.sName = sName;
	}

	protected short getAge() {
		return age;
	}

	protected void setAge(short age) {
		this.age = age;
	}

	protected double getHeight() {
		return height;
	}

	protected void setHeight(double height) {
		this.height = height;
	}

	protected double getWeight() {
		return weight;
	}

	protected void setWeight(double weight) {
		this.weight = weight;
	}

	protected Address getAddress() {
		return address;
	}

	protected void setAddress(Address address) {
		this.address = address;
	}
	
	
}
