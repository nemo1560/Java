package Account.Entity;


public class ListAccount {
	private Account[] arrAccount;
	private int choice;
	
	public ListAccount() {
		// TODO Auto-generated constructor stub
	}

	public ListAccount(Account[] arrAccount, int choice) {
		this.arrAccount = arrAccount;
		this.choice = choice;
	}



	public Account[] getArrAccount() {
		return arrAccount;
	}

	public void setArrAccount(Account[] arrAccount) {
		this.arrAccount = arrAccount;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

}
