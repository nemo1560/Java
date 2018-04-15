package Demo_interface;

public class AppMain {
	//add bien chung vao thi cac object kia moi sysout dc.
	public static void Display(IShape ishape) {
		System.out.println(ishape.toString());
	}

	public static void main(String[] args) {
		//1. dung tinh nang da hinhs
		IShape cricle = new Cricle(5.6); // tao doi tuong theo tinh da hinh
		Display(cricle);
		
		Cricle cricle2 = new Cricle();
		cricle2.setRadius(5.6);
		Display(cricle2);
		
		IShape cricle3 = new CricleBorder(5.6,2,"black");
		Cricle cricle4 = new CricleBorder(5.6, 2, "black");
		Display(cricle3);
		
//hinh chu nhat
		IShape rectangle = new Rectangle(5, 5.5);
		Display(rectangle);
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setHeight(5);
		rectangle2.setWeight(5.5);
		Display(rectangle2);
		
	}
	
}
