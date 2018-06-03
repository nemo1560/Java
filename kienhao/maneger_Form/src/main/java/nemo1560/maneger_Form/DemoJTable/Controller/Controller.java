package nemo1560.maneger_Form.DemoJTable.Controller;

import java.util.ArrayList;
import java.util.List;

import nemo1560.maneger_Form.DemoJTable.Model.Student;

public class Controller {
	private List<Student>listData;
	
	public List<Student> getAllValue(String name,String ID, String Class,String Address, String IDnumber) {
		this.listData = new ArrayList<Student>();
		this.listData = new Business().getAllValue(name, ID, Class, Address, IDnumber);
		return listData;
	}
	
	public boolean insertDB( String StdName, String StdClass, String StdAddress, int StdIDNumber) {
		boolean done = new Business().insertValueInDB(StdName, StdClass, StdAddress, StdIDNumber);
		if(done) {
			System.out.println("Done");
		}
		return done;
	}
	
	public boolean deleteValue(int selectedRow) {
		boolean done = new Business().deleteValue(selectedRow);
		if(done) {
			System.out.println("Done");
		}
		return done;
	}
	
	public boolean updateValue (String ID, String name, String Class,String Address, String IDnumber) {
		boolean done = new Business().updateValue(ID, name, Class, Address, IDnumber);
		if(done) {
			System.out.println("Done");
		}
		return done;
	}
	
	public List<Student>getOutValue(){
		this.listData = new ArrayList<Student>();
		this.listData = new Business().getArrDataStd();
		return listData;
	}

}
