package Demo.Demo_Enum_Model;

import java.util.LinkedList;

public class AppTest {

	public static void main(String[] args) {
		
		ControllerGetData control = new ControllerGetData();
		
		LinkedList<student> data = control.getListStudent();
		
		for (student student : data) {
			System.out.println(student);
		}
	}

}
