package Demo_interface;

//implements cung la instance.
public class Cricle implements IShape {
	private double radius;
	
	public Cricle() {
		
	}
	
	public Cricle(double radius) {
		this.radius = radius;
	}



	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public Double getArea() {
		return Math.pow(getRadius(), 2)*Math.PI;
	}

	@Override
	public Double getPerimeter() {
		return 2* Math.PI*this.getRadius();
	}
	
	//Hien thi thong tin ve hinh
	@Override
	public String toString() {
		
		return "The cricle has area is "+this.getArea() + " and perimeter is "+this.getPerimeter();
	}
	
}
