package Demo_comparator;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student>{

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
	
}
