package Demo.Demo_Enum_Model;

public enum HanldeProcessDatabase {
	INSTANCE;
	private Database database = new Database();
	
	//Tao ra phuong thuc de get data 
	public Database getDataFromDB(){
		return this.database;
	}
}
