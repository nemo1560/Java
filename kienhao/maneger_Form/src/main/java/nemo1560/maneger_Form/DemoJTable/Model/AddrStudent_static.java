package nemo1560.maneger_Form.DemoJTable.Model;

public class AddrStudent_static {
	private static int stdid;
	private static String stdAddress;
	private static int stdIDNumber;
	
	public static int getStdid() {
		return stdid;
	}
	public static void setStdid(int stdid) {
		AddrStudent_static.stdid = stdid;
	}
	public static String getStdAddress() {
		return stdAddress;
	}
	public static void setStdAddress(String stdAddress) {
		AddrStudent_static.stdAddress = stdAddress;
	}
	public static int getStdIDNumber() {
		return stdIDNumber;
	}
	public static void setStdIDNumber(int stdIDNumber) {
		AddrStudent_static.stdIDNumber = stdIDNumber;
	}
	public AddrStudent_static(int stdid, String stdAddress, int stdIDNumber) {
		AddrStudent_static.stdid = stdid;
		AddrStudent_static.stdAddress = stdAddress;
		AddrStudent_static.stdIDNumber = stdIDNumber;
	}
	
	public AddrStudent_static() {
		// TODO Auto-generated constructor stub
	}
	
	
}
