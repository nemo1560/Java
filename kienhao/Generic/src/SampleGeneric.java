
public class SampleGeneric {

	public static void main(String[] args) {
		//khoi tao va add kieu du lieu vao.
		GenericClass<Integer> Gen = new GenericClass<>();
		//Dua du lieu vao.
		Gen.addValue(5);
		Gen.addValue(2);
		Gen.addValue(4);
		Gen.addValue(12);
		Gen.addValue(3);
		Gen.addValue(44);
		Gen.addValue(11);
		Gen.addValue(15);
		Gen.addValue(7);
		Gen.addValue(31);
		Gen.addValue(111);
		
		while(Gen.getSize()>0) {
			System.out.print(Gen.getValue()+" ");
		}
		
		GenericClass<Student> Gen2 = new GenericClass<>();

		Gen2.addValue(new Student("Hap", "GAFASF"));
		Gen2.addValue(new Student("Ha", "GAFasdasdasdASF"));
		
		for(int i=0;i<Gen2.getSize();i++) {
			System.out.println(Gen2.getValue());
		}
		
		
	}
}
