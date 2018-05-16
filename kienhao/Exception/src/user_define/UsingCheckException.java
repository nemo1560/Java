package user_define;

public class UsingCheckException {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public UsingCheckException() {
		// TODO Auto-generated constructor stub
	}
	
	public UsingCheckException(int age) throws invalidAge {
		if(age<18) {
			//da cai doi tuong chua message ra ngoai.
			throw new invalidAge(age);
		}
		this.age = age;
	}
	
}
