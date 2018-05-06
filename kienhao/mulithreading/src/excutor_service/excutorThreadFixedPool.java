package excutor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import mulithreading.Demo.thread_extends_thread.DisplayChar;
import mulithreading.Demo.thread_implements_runable.DisplayNumber;

public class excutorThreadFixedPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exc = Executors.newFixedThreadPool(3);
		exc.execute(new DisplayChar('a', 500));
		exc.execute(new DisplayChar('b', 400));
		exc.execute(new DisplayNumber(500));
		//da fix thread so luong lon hon thi ko da luong. se run sau khi cac thread trong so luong cho phep chay xong.
		exc.execute(new DisplayChar('c', 400));
		exc.shutdown();
	}

}
