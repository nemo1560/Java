package Baitap;

import java.util.Scanner;

public class ATM {
	int sotien;
	int k500;
	int tempk500;
	int k200;
	int tempk200;
	int k100;
	int tempk100;
	int k50;
	int tempk50;
	int k20;
	int tempk20;
	Scanner in;
	
	public ATM() {
		System.out.println("Input your cash more 50.000");
		do {
			System.out.println("Cash input please: ");
			this.in = new Scanner(System.in);
			this.sotien = Integer.valueOf(in.nextLine());
		}
		while(this.sotien < 50000);
		Check(sotien);
	}
	public void Check(int total) {
		k500 = total/500000;
		tempk500 =total%500000;
		if(tempk500 > 0) {
			k200 = tempk500/200000;
			tempk200=tempk500%200000;
		}
		if(tempk200>0) {
			k100 = tempk200/100000;
			tempk100= tempk200%100000;
		}
		if(tempk100>0) {
			k50 = tempk100/50000;
			tempk50=tempk100%50000;
		}
		if(tempk50>0) {
			k20 = tempk50/20000;
			tempk20 = tempk50%20000;
		}
		System.out.println("Your cash: "+"500.000 have "+k500);
		System.out.println(" 200.000 have "+k200);
		System.out.println(" 100.000 have "+k100);
		System.out.println(" 50.000 have "+k50);
		System.out.println(" 20.000 have "+k20);
	}
}
