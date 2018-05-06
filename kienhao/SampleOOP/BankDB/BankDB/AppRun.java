package BankDB;

public class AppRun {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setBankName("HCM", "Hao", 200000);
		
		for(int i=0;i<bank.getListBranch().size();i++) {
			System.out.println(bank.getListBranch().get(0).getBranchName());
		}
	}
}

