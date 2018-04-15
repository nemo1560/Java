import java.util.Arrays;

public class Bank {
	private String nameBank;
	private Branch[] listBranch;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String nameBank, Branch[] listBranch) {
		super();
		this.nameBank = nameBank;
		this.listBranch = listBranch;
	}

	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public Branch[] getListBranch() {
		return listBranch;
	}

	public void setListBranch(Branch[] listBranch) {
		this.listBranch = listBranch;
	}

	@Override
	public String toString() {
		return "Bank [nameBank=" + nameBank + ", listBranch=" + Arrays.toString(listBranch) + "]";
	}
	
	

}
