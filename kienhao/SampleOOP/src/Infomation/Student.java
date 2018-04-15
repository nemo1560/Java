package Infomation;

public class Student extends Person{
	
	private String homework;
	
	

	protected Student(String name,int age,int weight,int height,Where where,String homework) {
		super(name, age, weight, height, where);
		this.homework = homework;
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void work() {
		System.out.println(getHomework());
		
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

}
