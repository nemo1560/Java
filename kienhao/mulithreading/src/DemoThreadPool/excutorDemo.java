package DemoThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class excutorDemo {
	
	private static int i=0;
	private static Worker worker = new Worker(); //static for don't implement new objects
	
	public static void main(String[] args) {
		ExecutorService exc = Executors.newFixedThreadPool(100);
		while(i++<1000) {
			exc.execute(new addAmount());
		}
		exc.shutdown();
		while(!exc.isTerminated()) {
		}
		System.out.println(worker.getIndex());
	}
	public static class addAmount implements Runnable{ // class in class to implement runable.

		@Override
		public void run() {
			worker.setIndex(1);
		}
		
		
	}
}
