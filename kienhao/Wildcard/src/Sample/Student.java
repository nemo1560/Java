package Sample;

public class Student extends Person {
	private double dMark;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(double dMark, String name, double weight) {
		super(name, weight);
		this.dMark = dMark;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ten la:" + this.getName()+" co diem "+ this.dMark ;
	}
	
}
