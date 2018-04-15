package Account;

public class Output {
	
	public static void print(AccountInfo[] ListAccount) {
		for (AccountInfo accountInfo : ListAccount) {
			System.out.println(accountInfo);
		}
	}

	public static void main(String[] args) {
		print(new GetAccountInfo().GetAccount());
		//print(new Database().getEnt()); //truy cap truc tiep vao database de lay data
	}

}
