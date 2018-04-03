package TINHTRUUTUONG;

//Y nghia tao ra khuon mau san.
public abstract class People {
	private String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public abstract double salary();
}
