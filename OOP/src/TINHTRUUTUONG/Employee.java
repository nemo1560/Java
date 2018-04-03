package TINHTRUUTUONG;

public class Employee extends People{
	private double rate; // he so nhan vien
	private int manDay; // ngay cong
	
	public Employee() {
		this.rate = 2.34;
		this.manDay = 26;
	}
	
	
	public int getManDay() {
		return manDay;
	}


	public void setManDay(int manDay) {
		this.manDay = manDay;
	}


	@Override
	public double salary() {
		return this.manDay * this.rate * 500;
	}
	
}
