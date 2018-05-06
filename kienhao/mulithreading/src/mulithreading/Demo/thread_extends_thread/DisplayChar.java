package mulithreading.Demo.thread_extends_thread;

public class DisplayChar extends Thread {
	//Nhiem vu cua class nay, code ra.
	
	private char character;
	private int index = 0;
	
	public DisplayChar(char character, int index) {
		this.character = character;
		this.index = index;
	}
	
	//ghi de viec can lam cua phuong thu run cua interface runable
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<this.index;i++) {
			System.out.println(this.character);
			try {
				Thread.sleep(2000); //nghi giua 2s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
