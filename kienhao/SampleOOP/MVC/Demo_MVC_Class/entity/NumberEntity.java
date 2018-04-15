package Demo_MVC_Class.entity;

public class NumberEntity {
	//Dinh nghia cac thanh phan can co
	private double dNumberA;
	private double dNumberB;
	private byte bOption; // 0 =>
	
	public NumberEntity() {
		// TODO Auto-generated constructor stub
	}

	public NumberEntity(double dNumberA, double dNumberB, byte bOption) {
		this.dNumberA = dNumberA;
		this.dNumberB = dNumberB;
		this.bOption = bOption;
	}

	public double getdNumberA() {
		return dNumberA;
	}

	public void setdNumberA(double dNumberA) {
		this.dNumberA = dNumberA;
	}

	public double getdNumberB() {
		return dNumberB;
	}

	public void setdNumberB(double dNumberB) {
		this.dNumberB = dNumberB;
	}

	public byte getbOption() {
		return bOption;
	}

	public void setbOption(byte bOption) {
		this.bOption = bOption;
	}
	
	

}
