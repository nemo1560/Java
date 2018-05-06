package Number_generic;

public class AppNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_generic<Double> genericNum = new Number_generic<Double>();
		
		System.out.println(genericNum.add(5.5, 22.4));
		System.out.println(genericNum.add(new Double(123), 22.4));
	}

}
