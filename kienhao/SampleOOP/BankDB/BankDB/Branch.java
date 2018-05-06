package BankDB;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	private String branchName;
	private List<Customer> listCus = new ArrayList<>();
	private int indexCus;
	public Branch() {
		// TODO Auto-generated constructor stub
	}
	
	public Branch(String branchName, String name, double money) {
		this.branchName = branchName;
		setListCus(name, money);
	}

	public String getBranchName() {
		return branchName;
	}

	public String setBranchName(String branchName) {
		this.branchName = branchName;
		return branchName;
	}

	public Branch setListCus( String name, double money) {
		listCus.add(new Customer(name, money));
		indexCus++;
		return null;
	}
	
	public List<Customer> getListCus() {
		return listCus;
	}

	public int getIndexCus() {
		return indexCus;
	}
}
