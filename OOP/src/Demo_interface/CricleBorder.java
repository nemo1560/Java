package Demo_interface;

public class CricleBorder extends Cricle {
	private int boderWidth;
	private String colorBorder;
	
	public CricleBorder() {
		// TODO Auto-generated constructor stub
	}

	public CricleBorder(int boderWidth, String colorBorder) {
		this.boderWidth = boderWidth;
		this.colorBorder = colorBorder;
	}

	public int getBoderWidth() {
		return boderWidth;
	}

	public void setBoderWidth(int boderWidth) {
		this.boderWidth = boderWidth;
	}

	public String getColorBorder() {
		return colorBorder;
	}

	public void setColorBorder(String colorBorder) {
		this.colorBorder = colorBorder;
	}

	public CricleBorder(double radius,int borderWidth, String colorBorder) {
		super(radius);
		this.boderWidth = borderWidth;
		this.colorBorder = colorBorder;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " and with the border is "+ this.getBoderWidth();
	}
	
}
