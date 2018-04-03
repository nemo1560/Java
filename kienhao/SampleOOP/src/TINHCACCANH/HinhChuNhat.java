package TINHCACCANH;

public class HinhChuNhat extends Dai2canh {
	int chieudoc;
	int chieungang;
	int chuvi;
	int dientich;
	
	@Override
	int tinhChuvi() {
		this.chieudoc = super.getChieuDoc();
		this.chieungang = super.getChieuNgang();
		this.chuvi = (chieudoc+chieungang)*2;
		return chuvi;
	}

	@Override
	int tinhDientich() {
		this.chieudoc = super.getChieuDoc();
		this.chieungang = super.getChieuNgang();
		this.dientich = chieudoc * chieungang;
		return dientich;
	}
}
