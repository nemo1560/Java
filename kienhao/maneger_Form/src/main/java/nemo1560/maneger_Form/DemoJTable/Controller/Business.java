package nemo1560.maneger_Form.DemoJTable.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import nemo1560.maneger_Form.DemoJTable.Model.Student;

public class Business {
	
	private Connection objCon;
	private PreparedStatement rptm;
	private ResultSet rs;
	private static int index;
	private static List<Student> arrDataStd;
	public Business() {
	}
	
	// function get all Value in DB and get value with reuests
	public List<Student> getAllValue(String name,String ID, String Class,String Address, String IDnumber){
		    arrDataStd = new ArrayList<Student>();
			String query = "{call getRequestValue(?,?,?,?,?)}";
			try {
				this.objCon = new ConnectDB().getObjCon();
				this.rptm = objCon.prepareCall(query);
				rptm.setString(1,name );
				rptm.setString(2, ID);
				rptm.setString(3, Class);
				rptm.setString(4, Address);
				rptm.setString(5, IDnumber);
				this.rs = rptm.executeQuery();
				while(rs.next()) {
					Student Std = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
					arrDataStd.add(Std);
				}
				index = arrDataStd.size();
				rptm.close();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			return arrDataStd;
		}
		
	public List<Student> getArrDataStd() {
		return arrDataStd;
	}

	//function get value on GUI add in DB
	public boolean insertValueInDB(String StdName, String StdClass, String StdAddress, int StdIDNumber) {
		String query = "{call insertValue(?,?,?,?)}";
		try {
			this.objCon = new ConnectDB().getObjCon();
			this.rptm = this.objCon.prepareStatement(query);
			this.rptm.setString(1, StdName);
			this.rptm.setString(2, StdClass);
			this.rptm.setString(3, StdAddress);
			this.rptm.setString(4, String.valueOf(StdIDNumber));
			this.rptm.execute();
			rptm.close();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public int getIndex() {
		return index++;
	}

	// function delete value in DB
	public boolean deleteValue(int selectedRow) {
		this.objCon = new ConnectDB().getObjCon();
		String query = "{call deleteRequestValue(?)}";
		try {
			this.rptm = objCon.prepareStatement(query);
			rptm.setInt(1, selectedRow);
			rptm.execute();
			rptm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	// function update value in DB
	public boolean updateValue(String ID, String name, String Class, String Address, String IDnumber) {
		this.objCon = new ConnectDB().getObjCon();
		String query = "{call updateValue(?,?,?,?,?)}";
		try {
			this.rptm = objCon.prepareStatement(query);
			rptm.setString(1,ID);
			rptm.setString(2, name);
			rptm.setString(3, Class);
			rptm.setString(4, Address);
			rptm.setString(5, IDnumber);
			rptm.execute();
			rptm.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	//function update again value after update or delete
	public List<Student> getAgainValue(){
		arrDataStd = new ArrayList<Student>();
		this.objCon = new ConnectDB().getObjCon();
		String query = "{call getAgainValue()}";
		try {
			this.rptm = objCon.prepareStatement(query);
			this.rs = rptm.executeQuery();
			while(rs.next()) {
				Student std = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
				arrDataStd.add(std);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arrDataStd;
	}

}
