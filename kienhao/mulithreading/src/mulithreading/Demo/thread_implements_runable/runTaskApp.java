package mulithreading.Demo.thread_implements_runable;

public class runTaskApp {

	public static void main(String[] args) {
		//Tao ra cac doi tuong nhiem vu
		DisplayChar task1 = new DisplayChar('a', 500);
		DisplayChar task2 = new DisplayChar('b', 400);
		DisplayNumber task3 = new DisplayNumber(500);
		
		//add task vao luong de java thuc hien
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);
		
		// thread theo bieu thuc lambda
		Thread t4 = new Thread(()->{ 
			for(int i=0;i<100;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		//start len;
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
