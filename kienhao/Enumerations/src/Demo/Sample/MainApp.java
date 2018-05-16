package Demo.Sample;

public class MainApp {

	public static void main(String[] args) {
		//1. Goi toi enum
		Weekdays weekDays = Weekdays.ChuNhat; // goi don 1 gia tri.
		System.out.println("Gia tri cua weekDays la "+ weekDays); // Coi la value la const (hang so)
		
		//2. Goi 1 tap cac days trong weekdays - Dua ve mang voi kieu du lieu la ten class enum.
		
		Weekdays[] arrData = Weekdays.values();
		//3.Lap trong mang de print ra man hinh
		for (Weekdays days : arrData) {
			System.out.println(days);
		}
	}

}
