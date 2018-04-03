package TINHCACCANH;

public abstract class Dai2canh {
	protected int chieuDoc;
	protected int chieuNgang;
	
	public int getChieuDoc() {
		return chieuDoc;
	}
	public void setChieuDoc(int chieuDoc) {
		this.chieuDoc = chieuDoc;
	}
	public int getChieuNgang() {
		return chieuNgang;
	}
	public void setChieuNgang(int chieuNgang) {
		this.chieuNgang = chieuNgang;
	}
	protected Dai2canh() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected Dai2canh(int chieuDoc, int chieuNgang) {
		this.chieuDoc = chieuDoc;
		this.chieuNgang = chieuNgang;
	}
	
	abstract int tinhChuvi();
	
	abstract int tinhDientich();

}
