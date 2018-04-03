package TINHTRUUTUONG;

public class HighEmployee extends People{
	private int manDay;
	private double rate;
	private double addRate;
	
	public HighEmployee() {
		// TODO Auto-generated constructor stub
		this.rate = 5.2;
	}
	
	
	
	public int getManDay() {
		return manDay;
	}



	public void setManDay(int manDay) {
		this.manDay = manDay;
	}



	public double getAddRate() {
		return addRate;
	}



	public void setAddRate(double addRate) {
		this.addRate = addRate;
	}



	public double salary() {
		// TODO Auto-generated method stub
		return this.manDay * 600000 * this.rate + this.addRate;
	}
	
	

}
