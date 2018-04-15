package Demo_MVC_Class.models;

import Demo_MVC_Class.entity.NumberEntity;

public class Models {
	//1. Method cong
	public double Add(NumberEntity objNumber) {
		return objNumber.getdNumberA()+objNumber.getdNumberB();
	}
	public double Sub(NumberEntity objNumber) {
		return objNumber.getdNumberA()-objNumber.getdNumberB();
	}
	public double Mul(NumberEntity objNumber) {
		return objNumber.getdNumberA()*objNumber.getdNumberB();
	}
	public double Div(NumberEntity objNumber) {
		return objNumber.getdNumberA()/objNumber.getdNumberB();
	}
}
