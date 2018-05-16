package Demo;

public class AppMain {

	public static void main(String[] args) {
		//1.Khai bao cac doi tuong
		System.out.println("Size cua A la: "+Apple.A.getSize());
		System.out.println("Size cua B la: "+Apple.B.getSize());
		System.out.println("Size cua C la: "+Apple.C.getSize());
		System.out.println("Size cua D la: "+Apple.D.getSize());
		
		//2.dua vao 1 mang
		Apple[] arrApple = Apple.values();
		for (Apple apple : arrApple) {
			System.out.println(apple);
		}
	}

}
