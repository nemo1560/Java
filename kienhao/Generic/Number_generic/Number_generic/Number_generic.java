package Number_generic;

//Extend lai Number de generic hieu la so de tinh toan
public class Number_generic<T extends Number> { //(generic class bounded)
	
	//lay kieu du lieu T tu generic class di vao. (generic class)
	@SuppressWarnings("unchecked")
	public T add(T o1, T o2) {
		//check
		if(o1 == null||o2 == null) {
			return null;
		}
		// Kiem tra o1 va o2 co kieu du lieu la gi
		//instanceof la keyword: bien truyen vao co phai con cua kieu nao ko
		if(o1 instanceof Double && o2 instanceof Double ) {
			return (T)new Double((o1.doubleValue() + o2.doubleValue()));
		}
		if(o1 instanceof Integer && o2 instanceof Integer) {
			return (T)new Integer((o1.intValue() + o2.intValue()));
		}
		return null;
	}
	
	//lieu du lieu generic ko can check generic cua class (generic function)
	public static<E> void print(E[] arrData) {
		
	}
	
	// (generic bounded)
	public static <E extends String> void test() {
		
	}
}
