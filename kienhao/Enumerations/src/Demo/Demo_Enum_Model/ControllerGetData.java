package Demo.Demo_Enum_Model;

import java.util.LinkedList;

public class ControllerGetData {
	private LinkedList<student> lstData = new LinkedList<>();
	
	//Goi toi lop enum
	private Database database = HanldeProcessDatabase.INSTANCE.getDataFromDB();
	
	public ControllerGetData() {
		//add list database vao list data;
		this.lstData = this.database.getArrData();
	}
	
	public LinkedList<student>getListStudent(){
		return this.lstData;
	}
}
