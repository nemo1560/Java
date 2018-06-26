import java.awt.List;
import java.util.ArrayList;

public class run {

	public run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<user> user_List = new ArrayList<user>();
		user_List.add(new user("2", "nv"));
		user_List.add(new user("3", "bv"));
		
		Aparment aparment = new Aparment();
		aparment.setUser(user_List);
		
		for(int i=0;i< user_List.size();i++) {
			System.out.println(aparment.getUser().get(i).getPosition() );
		}
		
	}

}
