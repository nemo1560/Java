package Write_Read_Misc_Object;

import java.util.ArrayList;

import Demo_Json.write_object_to_json.Customer;

public class MetaListCustomer {
	private int returnCode;
	private String errorMessage;
	private int totalRecode;
	private ArrayList<Customer> arrCus;
	
	public MetaListCustomer() {
		// TODO Auto-generated constructor stub
	}

	public int getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getTotalRecode() {
		return totalRecode;
	}

	public void setTotalRecode(int totalRecode) {
		this.totalRecode = totalRecode;
	}

	public ArrayList<Customer> getArrCus() {
		return arrCus;
	}

	public void setArrCus(ArrayList<Customer> arrCus) {
		this.arrCus = arrCus;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return returnCode +" "+errorMessage+" "+totalRecode+" "+arrCus;
	}
	
	
}
