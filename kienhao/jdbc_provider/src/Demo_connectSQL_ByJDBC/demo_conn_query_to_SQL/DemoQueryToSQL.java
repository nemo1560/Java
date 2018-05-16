package Demo_connectSQL_ByJDBC.demo_conn_query_to_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoQueryToSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1/Define bo ket noi
		Connection con = new ConnectSQL().getObjConn();
		String query = "select top(10) custid,custname from tblcustomers";
		try {
			ResultSet rsDataSet = null;
			PreparedStatement objCmst;
			
			objCmst = con.prepareStatement(query);
			rsDataSet = objCmst.executeQuery();
			
			while(rsDataSet.next()) {
				System.out.println(rsDataSet.getString("custid")+" "+rsDataSet.getString("custname"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
