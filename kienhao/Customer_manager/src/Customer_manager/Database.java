package Customer_manager;

public class Database {
	//1. Định nghĩa thuộc tính chứa 1 mảng các đối tượng là KH.
	private Customer[] arrCustomer;
	
	//2. Dùng hạm tạo để truyền danh sách KH.
	public Database() {
		arrCustomer = new Customer[]{new Customer(1, "A", "Q1, THCM", "090000000", (double) 1000000),
				new Customer(2, "B", "Q2, THCM", "090000000", (double) 5000000),
				new Customer(3, "C", "Q3, THCM", "090000000", (double) 8000000),
				new Customer(4, "D", "Q4, THCM", "090000000", (double) 2000000),
				new Customer(5, "E", "Q5, THCM", "090000000", (double) 6000000),};
	}	
	
	//3. Xây dựng hàm get để return mảng ra ngoài (cho đối tượng khác dùng)
	public Customer[] getArrCustomer(){
		return arrCustomer;
	}
}


