package Infomation;

public class RunMain {

	public static void main(String[] args) {
		Where where = new Where("HCM", "VN");
		Student stu = new Student("ABC", 28, 170, 78, where, "Java");
		stu.work();
	}

}
