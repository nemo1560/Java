package nemo1560.maneger_Form.DemoJTable.GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import nemo1560.maneger_Form.DemoJTable.Controller.Controller;
import nemo1560.maneger_Form.DemoJTable.Model.Student;

public class tableModel extends AbstractTableModel {
	
	private List<Student> listData;
	String[]column = {"ID","Ho va Ten","Lop","Dia chi","So CMND"};
	
	//Set get values from getOutValue()
	public tableModel() {
		listData = new ArrayList<Student>();
		listData = new Controller().getOutValue();
	}
	
	public int getColumnCount() {
		return this.column.length;
	}
	//get header column.
	@Override
	public String getColumnName(int column) {
		return this.column[column];
	}
	
	public int getRowCount() {
		return this.listData.size();
	}

	public Object getValueAt(int rowIndex, int colIndex) {
		Student student = this.listData.get(rowIndex);
		
		switch (colIndex) {
		case 0: 
			return student.getStdID();
		case 1:
			return student.getStdName();
		case 2:
			return student.getStdClass();
		case 3:
			return student.getStdAddress();
		case 4:
			return student.getStdIDNumber();
		default:
			return null;
		}

	}
	
	public void UpdateTable() {
		fireTableDataChanged();
	}

}
