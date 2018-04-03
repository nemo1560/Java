package TIINHKETHUA;

public class Student extends Person { // moi quan he IS-A
	private double dMark;
	private static String strNameOfSchool = "Imic"; //tao luon giá trị tĩnh.
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(double dMark) {
		
		this.dMark = dMark;
	}
	
	public Student(double dMark, String sName, short age, double weight, double height, Address address) {
		
		//truyen du lieu nguoc vao lop cha, su dung keyword super.
		super(sName,age,height,weight,address);
		this.dMark = dMark;
	}

	protected double getdMark() {
		return dMark;
	}

	protected void setdMark(double dMark) {
		this.dMark = dMark;
	}

	protected String getStrNameOfSchool() {
		return strNameOfSchool;
	}

}
