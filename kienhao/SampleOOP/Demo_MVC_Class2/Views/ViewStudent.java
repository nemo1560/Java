package Views;

import Controllers.ControllerStudent;
import Entity.Student;
import Entity.StudentArray;

public class ViewStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sv1 = new Student(1, "a", 5.5f);
		Student sv2 = new Student(2, "b", 7.4f);
		Student sv3 = new Student(3, "c", 3.4f);
		
		Student[] Std = new Student[13];
		Std[0] = sv1;
		Std[1] = sv2;
		Std[2] = sv3;
		
		StudentArray arrStd = new StudentArray();
		arrStd.setArrStudent(Std);
		arrStd.setBtIndexMaxorMin((byte)0);
		arrStd.setDmaxOrMin(0);
		
		ControllerStudent control = new ControllerStudent();
		int[]arrReturn = control.getArrayIndex(arrStd);
		for(int i=0;i<arrReturn.length;i++) {
			System.out.println(arrReturn[i]);
		}
	}

}
