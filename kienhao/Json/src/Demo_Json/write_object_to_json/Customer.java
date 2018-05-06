package Demo_Json.write_object_to_json;

public class Customer {
	private String name;
	private int yearOfbirth;
	private double salary;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	

	public Customer(String name, int yearOfbirth, double salary) {
		this.name = name;
		this.yearOfbirth = yearOfbirth;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfbirth() {
		return yearOfbirth;
	}

	public void setYearOfbirth(int yearOfbirth) {
		this.yearOfbirth = yearOfbirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "WriteObjectToJson [name=" + name + ", yearOfbirth=" + yearOfbirth + ", salary=" + salary + "]";
	}
	
}	
