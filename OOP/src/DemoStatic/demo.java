package DemoStatic;

public class demo {
	
	//demo add static keyword in function (when call to static function don't instance object)
	public static int tinhtong(int a, int b) {
		return (a+b);
	}
	
	//demo function not static keyword. We have instance object when to call function.
	public int tinhhieu(int a, int b) {
		return(a-b);
	}
	
	/*public static void main(String[] args) {
		System.out.println(tinhtong(5, 5));
		System.out.println(new demo().tinhhieu(10, 5));	
	}*/
}
