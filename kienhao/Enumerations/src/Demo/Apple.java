package Demo;

public enum Apple {
	A(1), B(3), C, D(90); // lien quan toi enum
	
	private int size;//lien quan toi class
	
	private Apple() {
		this.size =0;
	}
	
	private Apple(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}
	
	//muon viet class gi duoi cung dc
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "doi tuong co size la: "+ this.size;
	}
}
