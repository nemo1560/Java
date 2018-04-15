package Customer_manager;

public class GetAllCustumerImple implements IGetAllCustomerFromDB {
	private Database database;
	
	public GetAllCustumerImple() {
		database = new Database();
	}
		
	@Override
	public Customer[] getAllCustomer() {
			
		return this.database.getArrCustomer();
	}
	
}
