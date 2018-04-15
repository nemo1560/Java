package Customer_manager;

public class MainApp {
	//Sử dụng tính đa hình để khời tạo interface thông qua lớp dẫn suất.
	private IGetAllCustomerFromDB listCustomer2;
	
	public MainApp() {
		listCustomer2 = new GetAllCustumerImple();
		displayInfoCustomer(listCustomer2.getAllCustomer());
	}
	
	public static void displayInfoCustomer(Customer[] arrCustomer) {
		//sử dụng foreach
		for (Customer customer : arrCustomer) {
			System.out.println(customer.getsFullName());
		}
	}

	public static void main(String[] args) {
		new MainApp();
	}

}
