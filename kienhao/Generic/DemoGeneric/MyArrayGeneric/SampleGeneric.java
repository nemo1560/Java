package MyArrayGeneric;

public class SampleGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericSum<Double, Double> sum = new GenericSum<>();
		System.out.println(sum.total(10.5, 10.7));
	}
	
}
