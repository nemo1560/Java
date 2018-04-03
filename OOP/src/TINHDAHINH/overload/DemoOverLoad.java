package TINHDAHINH.overload;

public class DemoOverLoad {

	public static void main(String[] args) {
		System.out.println(tinhtong(5.0, 6.0));
	}
	
	//Khi truyen du lieu theo kieu nao thi java se goi toi ham gan kieu du lieu do.
	public static double tinhtong(int a, int b) {
		return (a+b);
	}
	public static double tinhtong(double a, double b) {
		return(a+b);
	}
}
