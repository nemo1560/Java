
public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch branch = new Branch("Ngan hang ACB - CN Phan Ton");
		branch.newCus("H�o", 5000d);
		branch.addCusDeposit("H�o", 5100000d);
		branch.addCusDeposit("H�o", 5100000d);
		
		branch.newCus("H�", 5000d);
		branch.addCusDeposit("H�", 5100000d);
		branch.addCusDeposit("H�", 5100000d);
		
		for(int i=0;i<branch.getListCus().length;i++) {
			System.out.println(branch.getListCus()[i].getCusName());
			for(int j=0;j<branch.getListCus()[i].getSize();j++) {
				System.out.println(branch.getListCus()[i].getCash()[j]);
			}
		}
		System.exit(0);

	}
}
