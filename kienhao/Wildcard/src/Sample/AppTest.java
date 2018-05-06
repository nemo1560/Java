package Sample;

public class AppTest<T> {

	public static void main(String[] args) {
		Student std = new Student(10d, "Hao", 171d);
		StudentSpecial stdpec = new StudentSpecial();
		Person ps = new Person();
		
		ListPersosn<Student> student = new ListPersosn<>();
		student.setData(std);
		ListPersosn<Person> person = new ListPersosn<>();
		ListPersosn<StudentSpecial> studentspecail = new ListPersosn<>();
		
		//goi Display
		displayInfor(studentspecail);
		displayInfor(person);
		displayInfor(student);
		
	}
	
	//Phuong thuc demo truong hop 1(?)
	public static <T> void displayInfor(ListPersosn<? extends T>arrData) {
		
	}
	

}
