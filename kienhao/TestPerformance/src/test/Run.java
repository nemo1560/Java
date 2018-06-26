package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
	private static int index = 1;
	private static count_Index count = new count_Index();
	
	public static class action implements Runnable{

		@Override
		public void run() {
			count.setIndex(index);
		}
		
	}

	public static void main(String[] args) {
		ExecutorService exc_Service = Executors.newCachedThreadPool();
		while(index++>0) {
			exc_Service.execute(new action());
			System.out.println(count.getIndex());
		}
	}

}
