package TINHCACCANH;

import java.util.Scanner;

public class Nhap {

	private static Scanner in;

	public static void main(String[] args) {
		
		Dai2canh nhap2canh = new  HinhChuNhat(); //tinh da hinh
		in = new Scanner(System.in);
		do {
			System.out.println("Nhap kich thuoc hinh");
			nhap2canh.chieuDoc = Integer.parseInt(in.nextLine());
			nhap2canh.chieuNgang = Integer.parseInt(in.nextLine());
		}
		while(nhap2canh.chieuDoc==0||nhap2canh.chieuNgang==0);
		String option = in.nextLine();
		switch (option) {
		case "v":
			
			
			break;

		default:
			break;
		}
	}

}
