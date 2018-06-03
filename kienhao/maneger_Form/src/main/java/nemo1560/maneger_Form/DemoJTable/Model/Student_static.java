package nemo1560.maneger_Form.DemoJTable.Model;

public class Student_static extends AddrStudent_static {
	private static int stdID;
	private static String stdName;
	private static String stdClass;
	
	public static int getStdID() {
		return stdID;
	}

	public static void setStdID(int stdID) {
		Student_static.stdID = stdID;
	}

	public static String getStdName() {
		return stdName;
	}

	public static void setStdName(String stdName) {
		Student_static.stdName = stdName;
	}

	public static String getStdClass() {
		return stdClass;
	}

	public static void setStdClass(String stdClass) {
		Student_static.stdClass = stdClass;
	}
	
	public Student_static() {
		// TODO Auto-generated constructor stub
	}
	
	public Student_static(int stdID, String stdName, String stdClass,int stdid, String stdAddress, int stdIDNumber ) {
		super(stdid, stdAddress, stdIDNumber);
		Student_static.stdID = stdID;
		Student_static.stdName = stdName;
		Student_static.stdClass = stdClass;
	}

	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", stdName=" + stdName + ", stdClass=" + stdClass + ", stdAddress=" + getStdAddress() + "]";
	}
	
	

}
