import java.time.LocalDate;

public class GiaoVien extends Nguoi {

	private int namBatDau;
	private String chuyenMon;
	
	public GiaoVien() {
		// TODO Auto-generated constructor stub
		super();
		this.namBatDau = 0;
		this.chuyenMon = null;
	}

	public GiaoVien(String hoTen, int namSinh, String noiSinh, int namBatDau, String chuyenMon) {
		super(hoTen, namSinh, noiSinh);
		// TODO Auto-generated constructor stub
		this.namBatDau = namBatDau;
		this.chuyenMon = chuyenMon;
	}

	public int getNamBatDau() {
		return namBatDau;
	}

	public void setNamBatDau(int namBatDau) {
		this.namBatDau = namBatDau;
	}

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	
	public void nhap() {
		
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("\n Nam Bat Dau: " + this.namBatDau);
		System.out.println("Chuyen mon: " +this.chuyenMon);
	}
	
	public int tinhThamNien() {
		
		LocalDate currentDate =  LocalDate.now();
		int year = currentDate.getYear();
        
		return (year - this.namBatDau);
	}

}
