
public class Custumer {
	private String cusName;
	private double[] cash;
	int vCount = 0;
	public Custumer() {
		// TODO Auto-generated constructor stub
	}

	public double[] getCash() {
		return cash;
	}

	public Custumer(String cusName, double money) {
		super();
		this.cusName = cusName;
		this.cash = new double[5];
		addCash(money);
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	
	//Add money
	public void addCash(double money) {
		cash[vCount++] = money;
	}
	

}
