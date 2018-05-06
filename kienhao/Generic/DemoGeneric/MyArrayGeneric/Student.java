package MyArrayGeneric;

public class Student {
	private String name;
	private double dMark;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, double dMark) {
		super();
		this.name = name;
		this.dMark = dMark;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", dMark=" + dMark + "]";
	}
	
	
}
