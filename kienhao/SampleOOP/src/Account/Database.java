package Account;

public class Database {
	private AccountInfo[]ent;
	
	public Database() {
		this.setEnt(new AccountInfo[] {new AccountInfo("admin", "admin"),
							  new AccountInfo("acc", "acc"),
							  new AccountInfo("local", "local"),
							  new AccountInfo("password", "password"),});
	}

	public AccountInfo[] getEnt() {
		return ent;
	}

	private void setEnt(AccountInfo[] ent) {
		this.ent = ent;
	}
}
