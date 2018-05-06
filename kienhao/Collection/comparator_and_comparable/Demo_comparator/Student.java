package Demo_comparator;

//So sanh dc lop sinh vien phai the hien cac lop so sanh dc.
public class Student {
	private int id;
	private String name;
	private double dMark;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double dMark) {
		this.id = id;
		this.name = name;
		this.dMark = dMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return String.format("Ma: %s, Ten: %s, Diem: %s", this.getId(),this.getName(),getdMark());
	}

}
