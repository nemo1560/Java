package LoanCalculator;

import java.util.Date;

public class Loan {
	private double intrate; // Lai suat vay
	private double balance; //No vay
	private int numberOfYear; // So nam di vay
	private Date createDateLoan; // so ngay vay
	
	public Loan() {
		this(4.5, 1000, 1);
	}

	public Loan(double intrate, double balance, int numberOfYear) {
		this.intrate = intrate;
		this.balance = balance;
		this.numberOfYear = numberOfYear;
		this.createDateLoan = new Date(); // lay dung ngay hien tai
	}

	public double getIntrate() {
		return intrate;
	}

	public void setIntrate(double intrate) {
		this.intrate = intrate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumberOfYear() {
		return numberOfYear;
	}

	public void setNumberOfYear(int numberOfYear) {
		this.numberOfYear = numberOfYear;
	}

	public Date getCreateDateLoan() {
		return createDateLoan;
	}

	public void setCreateDateLoan(Date createDateLoan) {
		this.createDateLoan = createDateLoan;
	}
	
	//Ham tinh ra lai hang thang
	public double getMonthlyInterest() {		
		return this.balance*this.intrate/12/100;
	}
	//Ham tinh tong lai cua tong so nam
	public double getTotalInterest() {
		return this.getMonthlyInterest()*this.numberOfYear*12;
	}
	
	
}
