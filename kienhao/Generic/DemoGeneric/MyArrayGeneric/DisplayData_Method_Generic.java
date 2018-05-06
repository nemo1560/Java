package MyArrayGeneric;

public class DisplayData_Method_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] lstData = new Student[] {new Student("hao", 10d),new Student("Lun", 5d),new Student("Mi", 10d),new Student("Meo", 5d)};
		displayData(lstData);
		
		//AutoBoxing - tu dong dua value vao bien object de su dung toString(). thanh ra chuoi.
		int data = 100;
		Integer number = data;
		System.out.println(number.toString() + 200);
		
		//Auto UnBoxing
		int intNumber = number;
		System.out.println(intNumber + 200);
	}
	
	//2 viet generic o muc phuong thuc
	
	public static <H> void displayData(H[] lst) {
		H[] data = lst;
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
	
	

}
