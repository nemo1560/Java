package Demo.Demo_Enum_Model;

public class student {
	private int id;
	private String sFullName;
	private double dMark;
	
	public student() {
		// TODO Auto-generated constructor stub
	}

	public student(int id, String sFullName, double dMark) {
		this.id = id;
		this.sFullName = sFullName;
		this.dMark = dMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", sFullName=" + sFullName + ", dMark=" + dMark + "]";
	}
	
}
