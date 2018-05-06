import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// Khai bao (tinh da hinh = List la interface)
		ArrayList<Double>lstData = new ArrayList<>();
		// Dua cac phan tu vao trong
		lstData.add(12234545567.4);
		lstData.add(124453522342.4);
		lstData.add(1223423424.4);
		lstData.add(12546567.4);
		lstData.add(11231232.4);
		lstData.add(1232423423.4);
		lstData.add(1234232.4);
		lstData.add(134242.4);
		
		//get chieu dai cua mang.
		//System.out.println(lstData.size());
		
		//duyet va in ra cac phan tu
		//for (Double double1 : lstData) {
		//	System.out.println(double1);
		//}
		
		//dung lop co san de sap xep mang
		Collections.sort(lstData);
		
		//for (Double double1 : lstData) {
		//	System.out.println(double1);
		//}
		
		//dung thuoc tinh lap(iterable) de duyet ra cac phan tu trong list - toi uu khi viet ung dung
		Iterator<Double> iter = lstData.iterator(); 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
