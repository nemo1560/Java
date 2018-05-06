package BankDB;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String bankName;
	private List<Branch>listBranch = new ArrayList<>();
	private int indexBank;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName, String name, int money) {
		this.bankName = bankName;
		setListBranch(name, money);
	}

	public List<Branch> getListBranch() {
		return listBranch;
	}

	public void setListBranch(String name, int money) {
		listBranch.add(new Branch().setListCus(name, money));
		indexBank++;
	}

	public int getIndexBank() {
		return this.indexBank;
	}
	
	

}
