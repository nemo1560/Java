package Demo_interface;

public interface IShape {
	//1. Khai bao hang so (ten bien viet hoa ) - ko can static do interface duoc truy cap vao luon.
	//2. interface co the extends cac interface khac.
	String COLOR = "red"; //trong interface value la hang so. == pulic static final String COLOR = "red";
	//2.Dinh nghia cac phuong thuc truu tuong
	
	//2.1 Tinh dien tich
	public Double getArea(); // == public abstract Double getArea();
	//2.2 Tinh chu vi
	public Double getPerimeter(); // == public abstract Double getPerimeter();
	
}
