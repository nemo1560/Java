package TIINHKETHUA;

public class Address {
	private String thon;
	private String xa;
	private String huyen;
	private String tinh;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String thon, String xa, String huyen, String tinh) {

		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}
	public String displayInfoAddress() {
		return "Dia chi"+ this.huyen + this.thon + this.xa + this.tinh;
	}
	
}
