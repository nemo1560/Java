
public class Student {
	private String name;
	private String sClass;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String sClass) {
		super();
		this.name = name;
		this.sClass = sClass;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sClass=" + sClass + "]";
	}
	
	
}
