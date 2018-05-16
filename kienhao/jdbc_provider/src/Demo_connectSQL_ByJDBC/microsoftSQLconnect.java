package Demo_connectSQL_ByJDBC;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class microsoftSQLconnect {

	public static void main(String[] args) {
		
		//1. Khai bao doi tuong thuc hien ket noi SQL
		Connection objConn = null;
		
		//2. Khoi tao lop ket noi
		SQLServerDataSource objData = new SQLServerDataSource();
		
		//Dung cac phuong thuc de thiet lap cac thong so
		objData.setServerName("127.0.0.1");
		objData.setUser("demo");
		objData.setPassword("kienhaO1");
		objData.setDatabaseName("DEMOBANKING");
		objData.setPortNumber(1433);
		
		//3.Ket noi thu
		try {
			objConn = objData.getConnection();
			if(!objConn.isClosed()) {
				System.out.println("OK");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
