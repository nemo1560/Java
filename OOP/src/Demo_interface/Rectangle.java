package Demo_interface;

public class Rectangle implements IShape{
	
	private double height;
	private double weight;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public Double getArea() {
		return this.getHeight()*this.getWeight();
	}

	@Override
	public Double getPerimeter() {
		return (this.getHeight()+this.getWeight())*2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The rectangle has area is "+this.getArea() + " and perimeter is "+this.getPerimeter()+ " with height is: "+this.getHeight()+" and with is: "+this.getWeight();
	}
	
}
