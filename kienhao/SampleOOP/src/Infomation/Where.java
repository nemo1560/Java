package Infomation;

public class Where {
	protected String province;
	protected String country;
	
	protected Where() {
		
	}
	protected Where(String province, String country) {
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
	public void printOut() {
		System.out.println(province + " "+ country);
	}
	
}
