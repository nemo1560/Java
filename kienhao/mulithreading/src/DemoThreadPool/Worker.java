package DemoThreadPool;

public class Worker implements Runnable  {
	
	private int index;
	private static int countIndex;
	
	public Worker(int index) {
		this.index = index;
	}
	
	public Worker() {
		
	}

	public int getCountIndex() {
		return countIndex+=index;
	}

	public int setCountIndex(int countIndex) {
		return countIndex;
	}

	@Override
	public synchronized void run() {
		getCountIndex();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
