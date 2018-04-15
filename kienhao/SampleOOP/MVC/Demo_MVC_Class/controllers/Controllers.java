package Demo_MVC_Class.controllers;

import Demo_MVC_Class.entity.NumberEntity;
import Demo_MVC_Class.models.Models;

public class Controllers {
	//1.Ket noi sang class Models;
	private Models models;
	
	//2. su dung contructor der khoi tao doi tuong models;
	public Controllers() {
		models = new Models();
	}
	
	//3.xu ly nghiep vu.
	public Double excuteCalculator(NumberEntity objN) {
		byte bOption = objN.getbOption();
		Double dbresult=0.0;
		switch (bOption) {
		case 0:
			dbresult = models.Add(objN);
			break;
		case 1:
			dbresult = models.Sub(objN);
			break;	
		case 2:
			dbresult = models.Mul(objN);
			break;
		case 3:
			dbresult = models.Div(objN);
			break;
		default:
			break;
		}
		return dbresult;
	}
	
}
