package mulithreading.Demo.thread_implements_runable;

public class DisplayNumber implements Runnable{
	private int num;
	
	public DisplayNumber(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=0;i<this.num;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
