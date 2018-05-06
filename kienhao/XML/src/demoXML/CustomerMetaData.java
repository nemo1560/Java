package demoXML;

import java.util.List;

public class CustomerMetaData {
	private List<Customer> arrcus; //Chua danh sach cac field Customer
	private String strPath; // chua duong dan de luu mang arrcus xuong XML
	
	public CustomerMetaData() {
		// TODO Auto-generated constructor stub
	}

	public CustomerMetaData(List<Customer> arrcus, String strPath) {
		this.arrcus = arrcus;
		this.strPath = strPath;
	}

	public List<Customer> getArrcus() {
		return arrcus;
	}

	public void setArrcus(List<Customer> arrcus) {
		this.arrcus = arrcus;
	}

	public String getStrPath() {
		return strPath;
	}

	public void setStrPath(String strPath) {
		this.strPath = strPath;
	}
	
}
