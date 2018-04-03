package TIINHKETHUA;

public class mainTest {

	public static void main(String[] args) {
		// Khoi tao doi tuong
		Student stu = new Student();
		Address addr = new Address("AA", "AA","AA","AA");
		//Truyen du lieu cu the vao doi tuong
		stu.setdMark(10);
		addr.displayInfoAddress();
		stu.setAge((short)20);
		stu.setHeight(170);
		stu.setsName("Nguyen Van A");
		stu.setWeight(75);
		//Goi toi ham tao lop cha
		Student stu2 = new Student(10, "Nguyen Van B",(short)20, 175, 80, addr);
		
		//In thong tin tu doi tuong
		System.out.println( "Ten sinh vien: "+ stu.getsName()+", Diem: "+stu.getdMark());
		System.out.println(stu2.getAddress().displayInfoAddress());
	}

}
