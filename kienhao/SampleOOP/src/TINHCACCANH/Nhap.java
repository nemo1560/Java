package TINHCACCANH;

import java.util.Scanner;

public class Nhap {

	private static Scanner in;

	public static void main(String[] args) {
		
		Dai2canh nhap2canh = new  HinhChuNhat(); //tinh da hinh
		System.out.println("Nhap kich thuoc hinh");
		in = new Scanner(System.in);
		nhap2canh.chieuDoc = Integer.parseInt(in.nextLine());
		nhap2canh.chieuNgang = Integer.parseInt(in.nextLine());
		System.out.println(nhap2canh.tinhChuvi());
	}

}
