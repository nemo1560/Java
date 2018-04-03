package TINHCACCANH;

public class HinhVuong extends Dai2canh{
	int chieuNgang;
	int Chuvi;
	int Dientich;

	@Override
	int tinhChuvi() {
		this.chieuNgang = super.getChieuNgang();
		this.Chuvi = chieuNgang*4;
		return Chuvi;
	}

	@Override
	int tinhDientich() {
		this.chieuNgang = super.getChieuNgang();
		this.Dientich = chieuNgang * chieuNgang;
		return Dientich;
	}
	
}
