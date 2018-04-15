package Account.Model;

import Account.Entity.ListAccount;

public class Account_Model {
	private int[] findedValue;
	private int MaxorMin;

	public int Max(ListAccount listAcc) {
		this.MaxorMin = listAcc.getArrAccount()[0].getaCash();
		for(int i=0;i<listAcc.getArrAccount().length;i++) {
			if(listAcc.getArrAccount()[i].getaCash()> MaxorMin) {
				MaxorMin = listAcc.getArrAccount()[i].getaCash();
			}
		}
		return MaxorMin;
	}
	
	public int Min(ListAccount listAcc) { 
		this.MaxorMin = listAcc.getArrAccount()[0].getaCash();
		for(int i=0;i<listAcc.getArrAccount().length;i++) {
			if(listAcc.getArrAccount()[i].getaCash()<MaxorMin) {
				MaxorMin = listAcc.getArrAccount()[i].getaCash();
			}
		}
		return MaxorMin;
	}
	
	public int[] getFindedValue(ListAccount listAcc, int MaxorMin) {
		this.findedValue = new int[listAcc.getArrAccount().length];
		for(int i=0;i<listAcc.getArrAccount().length;i++) {
			if(listAcc.getArrAccount()[i].getaCash() == MaxorMin) {
				findedValue[i] = i;
			}
		}
		return findedValue;
	}
	
}
