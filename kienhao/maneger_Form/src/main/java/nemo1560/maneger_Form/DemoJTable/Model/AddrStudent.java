package nemo1560.maneger_Form.DemoJTable.Model;

public class AddrStudent {
	private int stdid;
	private String stdAddress;
	private int stdIDNumber;
	
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public int getStdIDNumber() {
		return stdIDNumber;
	}
	public void setStdIDNumber(int stdIDNumber) {
		this.stdIDNumber = stdIDNumber;
	}
	public AddrStudent(int stdid, String stdAddress, int stdIDNumber) {
		this.stdid = stdid;
		this.stdAddress = stdAddress;
		this.stdIDNumber = stdIDNumber;
	}
	
	public AddrStudent() {
		// TODO Auto-generated constructor stub
	}
}
