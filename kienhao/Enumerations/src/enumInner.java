import java.util.EnumSet;
import java.util.Iterator;

public class enumInner {

	enum size{
		S, M, L, XL, XXL, XXXL;
	}
	//enum ko dung arraylist dc.
	
	public static void main (String[] args) {
		//Demo  ve collection giong nhu collection framework.
		EnumSet<size> arrSize = EnumSet.of(size.XL, size.XXL, size.S, size.M);
		Iterator<size> objIt = arrSize.iterator(); //sap xep mang
		while(objIt.hasNext()) {
			System.out.println(objIt.next());
		}
	}
}
