package demo;

public class Demo_Try_catch {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(div(a, b));
		} catch (Exception e) {
			// Xu ly loi o day
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		
		
	}
	
	public static int div(int a,int b) {
		return a/b;
	}
	
}
