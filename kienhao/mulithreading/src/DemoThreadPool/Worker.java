package DemoThreadPool;

public class Worker  {
	
	private int index;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}

	public int getIndex() {
		return index;
	}
	
	//add synchronized keyword in function change value;
	public synchronized void setIndex(int index) {
		this.index += index;
	}
	
	
}
