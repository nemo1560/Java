import java.util.ArrayList;

public class GenericClass<E> {
	//<E> la keyword viet tat khi goi toi class Generic
	//1 Luu tru du lieu <E>
	private ArrayList<E> data = new ArrayList<E>();
	//2 Tra ra size cua mang data
	public int getSize() {
		return this.data.size();
	}
	//3 phuong thuc dua du lieu vao mang
	public void addValue(E e) {
		data.add(e);
		
	}
	//4 phuong thuc lay 1 phan tu ra
	public E getValue() {
		int size = this.data.size()-1; //lay index cua thang cuoi cung
		E value = this.data.get(size);
		//xoa phan tu da lay ra
		this.data.remove(size);
		return value;
	}
	//5 kiem tra ca stack con du lieu ko 
	public boolean inEmpty() {
		return this.data.isEmpty();
	}
}
