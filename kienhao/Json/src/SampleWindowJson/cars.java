package SampleWindowJson;

public class cars {
	private String car1;
	private String car2;
	private String car3;

	public cars() {
		// TODO Auto-generated constructor stub
	}

	public String getCar1() {
		return car1;
	}

	public void setCar1(String car1) {
		this.car1 = car1;
	}

	public String getCar2() {
		return car2;
	}

	public void setCar2(String car2) {
		this.car2 = car2;
	}

	public String getCar3() {
		return car3;
	}

	public void setCar3(String car3) {
		this.car3 = car3;
	}

	public cars(String car1, String car2, String car3) {
		this.car1 = car1;
		this.car2 = car2;
		this.car3 = car3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "car1 "+car1+ " car2 "+car2+ " car3 "+car3;
	}
}
