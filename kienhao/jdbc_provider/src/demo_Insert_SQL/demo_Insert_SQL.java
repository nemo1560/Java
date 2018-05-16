package demo_Insert_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class demo_Insert_SQL {
	
	public static void main (String[] args) {
		
		try {
			Connection con = new ConnectSQL().getObjConn();
			
				PreparedStatement pstm = con.prepareStatement("{call addCustomer(?,?)}");
				pstm.setString(1, "1");
				pstm.setString(2, "DEMO");
				pstm.execute();
				System.out.println("OK");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
