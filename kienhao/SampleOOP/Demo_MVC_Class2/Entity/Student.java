package Entity;

public class Student {
	private int id;
	private String name;
	private float fMark;
	
	//POJO == Plain Old Java Object (Doi tuong thuan tuy) == get set.
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float fMark) {
		super();
		this.id = id;
		this.name = name;
		this.fMark = fMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getfMark() {
		return fMark;
	}

	public void setfMark(float fMark) {
		this.fMark = fMark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fMark=" + fMark + "]";
	}
	

}
