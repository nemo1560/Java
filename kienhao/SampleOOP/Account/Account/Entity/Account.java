package Account.Entity;


public class Account {
	private int aId;
	private String aName;
	private int aCash;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int id, String aName, int aCash) {
		this.aId = id;
		this.aName = aName;
		this.aCash = aCash;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public int getaCash() {
		return aCash;
	}

	public void setaCash(int aCash) {
		this.aCash = aCash;
	}

	@Override
	public String toString() {
		return "Account [aId=" + aId + ", aName=" + aName + ", aCash=" + aCash + "]";
	}
	
	
}
