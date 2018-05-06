package BankDB;

import java.util.ArrayList;
import java.util.List;

/* Giai thich:
 	1 khach hang nhung co nhieu lan gui tien.
 	setKH
 	getKH
 	setTien => dua vao mang chua tien, co index nhay theo tung lan bo tien vao.
 	getTien => xuat ra mang tien.
*/

public class Customer {
	private String name;
	private List<Double> lstMoney = new ArrayList<Double>();
	private int indexMoney;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, double money) {
		super();
		this.name = name;
		setLstMoney(money);
	}

	public List<Double> getLstMoney() {
		return lstMoney;
	}

	public void setLstMoney(double money) {
		lstMoney.add(money);
		indexMoney++;
	}

	public int getIndexMoney() {
		return indexMoney;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}
	
}