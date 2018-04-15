package Baitap;

import java.util.Scanner;

public class Printround {
	int n;
	int m;
	Scanner in;
	public Printround() {
		this.in = new Scanner(System.in);
		System.out.println("Nhap n: ");
		this.n = Integer.valueOf(in.nextLine());
		System.out.println("Nhap m: ");
		this.m = Integer.valueOf(in.nextLine());
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
