package MyArrayGeneric;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGeneric<String> lst = new MyGeneric<>();
		
		//Tao gia tri vao mang
		String[]arrData = {"a","b","c","d"};
		lst.setArrData(arrData);
		
		//Hien thi data
		for(int i=0;i<lst.getSize();i++) {
			System.out.println(lst.getArrData()[i]);
		}
		MyGeneric<Student> lst2 = new MyGeneric<>();
		Student[] lstData = new Student[] {new Student("hao", 10d),new Student("Lun", 5d),new Student("Mi", 10d),new Student("Meo", 5d)};
		lst2.setArrData(lstData);
		lst2.displayArray(lst2.getArrData());
	}

}
