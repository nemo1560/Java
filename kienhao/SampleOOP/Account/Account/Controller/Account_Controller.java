package Account.Controller;

import Account.Entity.ListAccount;
import Account.Model.Account_Model;

public class Account_Controller {
	Account_Model accModel = new Account_Model();
	
	public int[] ChoiceMaxOrMin(ListAccount listAcc, int option) {
		int result = 0;
		switch (option) {
		case 1:
			result = FindMax(listAcc);
			break;
		case 0:
			result = FindMin(listAcc);
			break;
		default:
			break;
		}
		int[] arrResult = accModel.getFindedValue(listAcc, result);
		return arrResult;
	}
	
	public int FindMax(ListAccount listAcc) {
		int Max =  accModel.Max(listAcc);
		return Max;
	}
	
	public int FindMin(ListAccount listAcc) {
		int Min = accModel.Min(listAcc);
		return Min;
	}
	
}
