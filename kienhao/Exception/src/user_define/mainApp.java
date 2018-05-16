package user_define;

public class mainApp {

	public static void main(String[] args) {
		//Thiet lap tuoi.
		try {
			new UsingCheckException(17);
		} catch (invalidAge e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
