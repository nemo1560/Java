
public class Branch {
	private String branchName;
	private Custumer[] listCus;
	public Custumer[] getListCus() {
		return listCus;
	}

	public void setListCus(Custumer[] listCus) {
		this.listCus = listCus;
	}

	private int vCount=0;
	
	public Branch() {
		// TODO Auto-generated constructor stub
	}

	public Branch(String branchName) {
		this.setBranchName(branchName);
		listCus = new Custumer[5];
	}
	
	public boolean newCus(String name, double money) {
		if(findNameCustomer(name).equals(null)){
			listCus[vCount++] = new Custumer(name,money);
			return true;
		}
		return false;
	}
	
	public boolean addCusDeposit(String name, double money) {
		if(!findNameCustomer(name).equals(null)) {
			new Custumer().addCash(money);
			return true;
		}
		return false;
	}
	
	public Custumer findNameCustomer(String name) {
		for(int i=0;i<listCus.length;i++) {
			if(name.equals(listCus[i].getCusName())) {
				return listCus[i];
			}
		}
		return null;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
	
}
