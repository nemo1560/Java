package MyArrayGeneric;

import java.util.Iterator;

public class MyGeneric<H> {
	private H[] arrData; // kieu mang la H
	private int size; // so phan tu thuc trong mang
	private static final int INITIAL_CAPACITY = 10;
	
	public MyGeneric() {
		this.size = 0;
		this.arrData = (H[]) new Object[10]; //do generic ko tuong minh nen fai new Object va ep kieu lai
	}

	public MyGeneric(H[] arrData, int size) {
		this.arrData = arrData;
		this.size = size;
	}

	public H[] getArrData() {
		return arrData;
	}

	public void setArrData(H[] arrData) {
		this.arrData = arrData;
		this.size = arrData.length; //chuyen mang vao 
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//tra ve vi tri phan tu cua mang
	public H getElement(int index) {
		H data = this.arrData[index];
		return data;
	}
	public <E> void displayArray(E[] e){
		for (E e2 : e) {
			System.out.println(e2);
		}
	}
	
}
