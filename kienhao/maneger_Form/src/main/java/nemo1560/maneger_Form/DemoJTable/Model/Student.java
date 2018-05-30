package nemo1560.maneger_Form.DemoJTable.Model;

public class Student extends AddrStudent {
	private int stdID;
	private String stdName;
	private String stdClass;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdClass() {
		return stdClass;
	}

	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}

	public Student(int stdID, String stdName, String stdClass,int stdid, String stdAddress, int stdIDNumber) {
		super(stdid, stdAddress, stdIDNumber);
		this.stdID = stdID;
		this.stdName = stdName;
		this.stdClass = stdClass;
	}

	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", stdName=" + stdName + ", stdClass=" + stdClass + "]";
	}
	
	
	
	
}
