package excutor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import mulithreading.Demo.thread_extends_thread.DisplayChar;
import mulithreading.Demo.thread_implements_runable.DisplayNumber;

public class excutorServices {
	
	public static void main(String[] args) {
		//cho phep add nhieu thread vao de quan lay cac thread.
		ExecutorService exc = Executors.newCachedThreadPool();
		
		//add cac thread vao pood
		exc.execute(new DisplayChar('a', 500));
		exc.execute(new DisplayChar('b', 400));
		exc.execute(new DisplayNumber(500));
		
		//ko cho phep them moi nhiem vu khac vao.
		exc.shutdown();
	}
}	
