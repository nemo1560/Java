package DemoThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class excutorDemo {
	static int i=0;
	public static void main(String[] args) {
		ExecutorService exc = Executors.newFixedThreadPool(100);
		while(i++<1000) {
			exc.execute(new Worker(1));
		}
		exc.shutdown();
		while(!exc.isTerminated()) {
		}
		System.out.println(new Worker().getCountIndex()); // da bo vao synchronized nhung van ko du 1k
		System.out.println("Done");
	}

}
