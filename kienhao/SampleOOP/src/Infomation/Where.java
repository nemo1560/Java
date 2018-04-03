package Infomation;

public class Where extends Person {
	private String province;
	private String country;
	
	protected Where() {
		// TODO Auto-generated constructor stub
	}
	protected Where(String province, String country) {
		//super(country, age, weight, height); bao loi cac bien phai chuyen ve static Thay xem dum em
		super();
		this.province = province;
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
