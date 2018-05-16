package Demo_connectSQL_ByJDBC.demo_conn_query_to_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoExecute_StoreProcedure {
	
	public static void main(String[] agrs) {
		String query = "{call getInfoCustomer()}";
		int index = 0;
		Connection con = new ConnectSQL().getObjConn();
		try {
			PreparedStatement objCmst = con.prepareStatement(query);
			ResultSet rsData = objCmst.executeQuery();
			while(rsData.next()) {
				index++;
				System.out.println(rsData.getString("custid")+" "+rsData.getString("custname")+" "+index);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
