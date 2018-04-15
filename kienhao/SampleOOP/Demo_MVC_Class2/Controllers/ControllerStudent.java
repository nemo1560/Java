package Controllers;


import Entity.StudentArray;
import Model.ModelStudent;

public class ControllerStudent {
	private ModelStudent mStd;
	private StudentArray arrstd;
	
	public ControllerStudent() {
		mStd = new ModelStudent();
	}
	
	public int[] getArrayIndex(StudentArray arrstd) {
		return mStd.listIndex(arrstd);
	}
}
