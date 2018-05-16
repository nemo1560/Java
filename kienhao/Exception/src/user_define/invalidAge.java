package user_define;

@SuppressWarnings("serial")

//extends exception de co the su dung throw de day loi ra ngoai
public class invalidAge extends Exception {
	private int age;
	
	public invalidAge() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		this.age = age;
	}
	
	public invalidAge(int ageX) {
		super("Ban chua du tuoi "+ ageX);
		this.age = ageX;
	}
	
}
