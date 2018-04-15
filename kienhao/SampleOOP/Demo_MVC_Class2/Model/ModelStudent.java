package Model;

import Entity.StudentArray;

public class ModelStudent {
	
	//1 Viet ham tra ra diem thap nhat;
	private float FindMinMark(StudentArray stdArray) {
		//Giai thuat tim diem thap nhat
		float min = stdArray.getArrStudent()[0].getfMark();
		for(int i = 1;i<stdArray.getArrStudent().length;i++) {
			if(stdArray.getArrStudent()[i].getfMark()<min) {
				min = stdArray.getArrStudent()[i].getfMark();
			}
		}
		return min;
	}
	
	private float FindMaxMark(StudentArray stdArray) {
		//Giai thuat tim diem cao nhat
		float max = stdArray.getArrStudent()[0].getfMark();
		for(int i = 1;i<stdArray.getArrStudent().length;i++) {
			if(stdArray.getArrStudent()[i].getfMark()>max) {
				max = stdArray.getArrStudent()[i].getfMark();
			}
		}
		return max;
	}
	
	//Tuy theo tim min hay max == btIndexMaxorMin
	public int[] listIndex(StudentArray stdArray) {
		//1. dinh nghia mang chua chi so tra ra
		int[] arrReturn = null;
		//2. de dem so luong co gia tri min hoac max;
		int vCount=0;
		//3. khoi tao mang chua so luong student;
		int[] arrtemp = new int[stdArray.getArrStudent().length];
		//4 xac dinh chi so co gia max hay min
		for(int i=0;i<stdArray.getArrStudent().length;i++) {
			if(stdArray.getArrStudent()[i].getfMark()== this.FindMinMark(stdArray)) {
				arrtemp[vCount]= i;
				vCount++;
			}
		}
		//5 copy 
		System.arraycopy(arrtemp, 0, arrReturn, 0, vCount);
		
		return arrReturn;
	}
}
