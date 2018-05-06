package Demo_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class AppTest {

	public static void main(String[] args) {
		// 1. Khai bao 1 mang cac sinh vien
		ArrayList<Student> lstStudent = new ArrayList<>();
		lstStudent.add(new Student(1, "Hao", 10.0));
		lstStudent.add(new Student(2, "Ho", 3.5));
		lstStudent.add(new Student(3, "Ha", 5.6));
		lstStudent.add(new Student(4, "Lun", 7.6));
		lstStudent.add(new Student(5, "Meo", 8.0));
		lstStudent.add(new Student(6, "Mi", 5.8));
		lstStudent.add(new Student(7, "Mup", 8.9));
		//in ra khi chua sap xep
		showStudent(lstStudent);
		
		//sap xep 
		Collections.sort(lstStudent, new ComparatorStudent()); // do doi tuong student ko so sanh dc nen fai bien co compareTo trong entity thi sort moi so dc.
		showStudent(lstStudent);
		
		//Thu dung voi bieu thuc lambda Expression
		Collections.sort(lstStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getdMark() == o2.getdMark()) {
					return 0;
				}
				else if(o1.getdMark() > o2.getdMark()) {
					return 1;
				}
				else {
					return -1;
				}
			}
			
		});
		//Demo Lambda Expression
		Collections.sort(lstStudent, (o1, o2)->{
			if(o1.getdMark() == o2.getdMark()) {
				return 0;
			}
			else if(o1.getdMark() > o2.getdMark()) {
				return 1;
			}
			else {
				return -1;
			}
		});
		showStudent(lstStudent);
	}
	
	public static void showStudent(ArrayList<Student> arr) {
		Iterator<Student> copyData = (Iterator<Student>) arr.iterator();
		while(copyData.hasNext()) {
			System.out.println(copyData.next());
		}
		System.out.println();
	}

}
