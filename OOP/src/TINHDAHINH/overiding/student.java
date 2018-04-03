package TINHDAHINH.overiding;

public class student extends person{
	private static final String nameOfSchool = "IMIC";
	private double dMark;
	private String id;
	
	public student() {
		// TODO Auto-generated constructor stub
	}
	
	public student(String name, int age) {
		super(name, age);
	}
	
	public student(String name, int age, String id, double dMark) {
		super(name, age);
		this.id = id;
		this.dMark = dMark;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// Ghi de ham toString()  cua doi tuong object.
	@Override
	public String toString() {
		return "Họ và tên sinh viên "+ this.getName()+ " có điểm: "+ this.getdMark();
	}
}
