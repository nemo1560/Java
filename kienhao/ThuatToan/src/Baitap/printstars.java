package Baitap;

public class printstars {
	
	public printstars() {
		int h = 5;
		int m=h,n = h;
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=h*2-1;j++) {
				if(j<=m && j>=n) //ve ra vi tri cua cac sao o tung dong.
					System.out.print("*");
				else
					System.out.print(" ");
				}
			m++;
			n--;
			System.out.print("\n");
		}
	}
}
