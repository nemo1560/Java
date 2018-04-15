package Account;

public class GetAccountInfo implements IGetAccountInfo {
	@Override
	public AccountInfo[] GetAccount() {
		AccountInfo[] db = new Database().getEnt();
		return db;
	}

}
