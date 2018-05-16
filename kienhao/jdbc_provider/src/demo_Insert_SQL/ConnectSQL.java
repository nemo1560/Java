package demo_Insert_SQL;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class ConnectSQL {
	private Connection objConn;
	public ConnectSQL() {

		SQLServerDataSource objData = new SQLServerDataSource();
		
		objData.setServerName("127.0.0.1");
		objData.setUser("demo");
		objData.setPassword("kienhaO1");
		objData.setDatabaseName("DEMOBANKING");
		objData.setPortNumber(1433);
		
		try {
			objConn = objData.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public Connection getObjConn() {
		return objConn;
	}
	public void setObjConn(Connection objConn) {
		this.objConn = objConn;
	}
}
