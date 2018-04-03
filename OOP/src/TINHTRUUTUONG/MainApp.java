package TINHTRUUTUONG;

public class MainApp {

	public static void main(String[] args) {
		// Khoi tao doi tuong nhan
		People emp = new Employee();
		emp.setName("Nguyen Van A");
		System.out.println(emp.getName()+" "+ emp.salary());
		
		People highemp = new HighEmployee();
		highemp.setName("Tran Van Boss");
		System.out.println(highemp.getName()+ " "+highemp.salary());
	}

}
