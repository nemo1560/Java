package Entity;

public class StudentArray {
	private Student[] arrStudent;
	private double dmaxOrMin;
	private byte btIndexMaxorMin; // cho biet tra ra danh sach max hay min cua diem (0: Min, 1:Max); switch case chon
	
	public Student[] getArrStudent() {
		return arrStudent;
	}
	public void setArrStudent(Student[] arrStudent) {
		this.arrStudent = arrStudent;
	}
	public double getDmaxOrMin() {
		return dmaxOrMin;
	}
	public void setDmaxOrMin(double dmaxOrMin) {
		this.dmaxOrMin = dmaxOrMin;
	}
	public byte getBtIndexMaxorMin() {
		return btIndexMaxorMin;
	}
	public void setBtIndexMaxorMin(byte btIndexMaxorMin) {
		this.btIndexMaxorMin = btIndexMaxorMin;
	}
	
	
}
