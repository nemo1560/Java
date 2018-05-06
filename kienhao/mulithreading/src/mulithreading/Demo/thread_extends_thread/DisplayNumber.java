package mulithreading.Demo.thread_extends_thread;

public class DisplayNumber extends Thread {
	private int num;
	
	public DisplayNumber(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=0;i<this.num;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
