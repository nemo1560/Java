package demo;

public class Demo_throw {
	
	public static void main(String[] args) {
		try {
			new LoginController().checklogin("", "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	static class LoginController{
		public boolean checklogin( String userName, String passWord) {
			try {
				String sValue = null;
				int iValue = Integer.valueOf(sValue);
			} catch (Exception e) {
				throw e; //ko truc tiep xu ly o day
			}
			return true;
		}
	}

}

