
public class main {
	
	public void print(sinhvien sv1) {
		System.out.println("Thong tin sv1:" +" "+sv1.getTen()+" "+ sv1.getTuoi()+" "+ sv1.getLop());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sinhvien sv1 = new sinhvien("Kien Hao", 28, "Java");
		sinhvien sv2 = new sinhvien();
		sv2.setTen("Mi");
		sv2.setTuoi(26);
		sv2.setLop("QA");
		System.out.println("Thong tin sv2:"+" "+sv2.getTen()+" "+sv2.getTuoi()+" "+sv2.getLop());
		new main().print(sv1);
		
	}

}
