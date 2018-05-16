package Demo.Demo_Enum_Model;

import java.util.LinkedList;

public class Database {
	private LinkedList<student> arrData = new LinkedList<>();
	
	public Database() {
		arrData.add(new student(1, "Nguyen Van A", 8.5d));
		arrData.add(new student(2, "Nguyen Van d", 8.5d));
		arrData.add(new student(3, "Nguyen Van sa", 1.5d));
		arrData.add(new student(4, "Nguyen Van sw", 6.5d));
		arrData.add(new student(5, "Nguyen Van sq", 8d));
		arrData.add(new student(6, "Nguyen Van c", 2d));
		arrData.add(new student(7, "Nguyen Van d", 0d));
		arrData.add(new student(8, "Nguyen Van w", 3d));
	}

	public LinkedList<student> getArrData() {
		return arrData;
	}
		
}
