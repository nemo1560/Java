
public class Branch {
	private String branchName;
	private static final int INITIAL_CAPACITY = 20;
	private Custumer[] listCus = new Custumer[INITIAL_CAPACITY]; ;
	
	public Custumer[] getListCus() {
		return listCus;
	}

	public void setListCus(Custumer[] listCus) {
		this.listCus = listCus;
	}

	private int vCount;
	
	public Branch() {
		// TODO Auto-generated constructor stub
	}

	public Branch(String branchName) {
		this.setBranchName(branchName);
	}
	
	public int newCus(String name, double money) {
			listCus[vCount] = new Custumer(name,money);
			return vCount;
	}
	
	public void addCusDeposit(String name, double money) {
		if(findNameCustomer(name)!=-1) {
			listCus[vCount].addCash(money);  //vCount la vi tri cua user, ko lien quan cash
		}
	}
	
	public int findNameCustomer(String name) {
		for(int i=0;i<listCus.length;i++) {
			String getDBname = listCus[i].getCusName();
			if(name == getDBname) {
				return i;
			}
		}
		return -1;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
	
}
