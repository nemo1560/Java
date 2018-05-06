
public class Custumer {
	private String cusName;
	private static final int INITIAL_CAPACITY = 20;
	private double[] cash = new double[INITIAL_CAPACITY];
	private int size = 0; // so luong lan gui tien.
	public Custumer() {
	}

	public double[] getCash() {
		double[] getCash = new double[this.size];
		System.arraycopy(cash, 0, getCash, 0, this.getSize());
		return cash;
	}

	public Custumer(String cusName, double money) {
		super();
		this.cusName = cusName;
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
		ensureCapacity();
		cash[size++] = money;
	}
	
	public int getSize() {
		return size;
	}

	//Ham tu dong thay doi size cua mang cash
	public void ensureCapacity() {
		if(this.size >= this.cash.length) {
			//Thuc hien tang mang len
			double[] newData = new double[this.size*2];
			System.arraycopy(cash, 0, newData, 0, this.cash.length); //copy mang cu sang mang moi. de thay doi so luong
			this.cash = newData; // mang cu = tro lai mang moi se mang theo size cua mang moi
		}
	}

}
