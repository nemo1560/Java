package Customer_manager;

public class Customer {
	//1.Thành phân dữ liệu (data field)
	private int cusID; //Mã KH
	private String sFullName; //Họ Tên KH
	private String sAddress; // Địa chỉ KH
	private String sMobile; // Số điện thoại
	private Double dblAmount; // Số tiền của KH
	
	//2. Hàm tạo
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int cusID, String sFullName, String sAddress, String sMobile, Double dblAmount) {
		this.cusID = cusID;
		this.sFullName = sFullName;
		this.sAddress = sAddress;
		this.sMobile = sMobile;
		this.dblAmount = dblAmount;
	}
	
	//3. Các hàm get set.
	public int getCusID() {
		return cusID;
	}
	public void setCusID(int cusID) {
		this.cusID = cusID;
	}
	public String getsFullName() {
		return sFullName;
	}
	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsMobile() {
		return sMobile;
	}
	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}
	public Double getDblAmount() {
		return dblAmount;
	}
	public void setDblAmount(Double dblAmount) {
		this.dblAmount = dblAmount;
	}
	
	//4. Overide hàm toString của lớp cha(object)
	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", sFullName=" + sFullName + ", sAddress=" + sAddress + ", sMobile="
				+ sMobile + ", dblAmount=" + dblAmount + "]";
	}
	
	
	
}
