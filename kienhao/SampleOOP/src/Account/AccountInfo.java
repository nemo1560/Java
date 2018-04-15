package Account;

public class AccountInfo {
	private String user;
	private String password;
	
	public AccountInfo() {
		// TODO Auto-generated constructor stub
	}

	public AccountInfo(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	public AccountInfo(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Entities [user=" + user + ", password=" + password + "]";
	}
	
}
