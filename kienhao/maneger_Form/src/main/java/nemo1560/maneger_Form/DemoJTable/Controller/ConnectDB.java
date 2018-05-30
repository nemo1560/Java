package nemo1560.maneger_Form.DemoJTable.Controller;

import java.sql.Connection;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class ConnectDB {
	private Connection objCon;
	
	public ConnectDB() {
		SQLServerDataSource sqlS = new SQLServerDataSource();
		sqlS.setServerName("127.0.0.1");
		sqlS.setUser("demo");
		sqlS.setPassword("kienhaO1");
		sqlS.setDatabaseName("DEMOBANKING");
		sqlS.setPortNumber(1433);
		
		try {
			this.objCon = sqlS.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getObjCon() {
		return objCon;
	}

	public void setObjCon(Connection objCon) {
		this.objCon = objCon;
	}
}
