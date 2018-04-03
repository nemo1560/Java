package DemoStatic;

public class run {
	//public int n = 0;
	public static int m = 0;
	
	public run() {
		//n++;
		m++;
	}
	
	public static void main(String[] args) {
		// when non static variable will get default value after object end.
		//run demo1 = new run();
		//System.out.println(demo1.n);
		//run demo2 = new run();
		//System.out.println(demo2.n);
		
		//when static we will call variable don't need instance and variable get value at last use.
		for(int a=0;a<10;a++) {
			new run();
			System.out.println(m);
		}
		
	}
}
