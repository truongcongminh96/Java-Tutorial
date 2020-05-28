
public class HocSinh extends Nguoi {

	private float diemToan;
	private float diemVan;
	private float diemNgoaiNgu;
	
	public HocSinh() {
		// TODO Auto-generated constructor stub
		super();
		this.diemToan = 0;
		this.diemToan = 0;
		this.diemNgoaiNgu = 0;
	}

	public HocSinh(String hoTen, int namSinh, String noiSinh, float diemToan, float diemVan, float diemNgoaiNgu) {
		super(hoTen, namSinh, noiSinh);
		// TODO Auto-generated constructor stub
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemNgoaiNgu() {
		return diemNgoaiNgu;
	}

	public void setDiemNgoaiNgu(float diemNgoaiNgu) {
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	public void nhap() {
		
	}
	
	public void xuat() {
		super.xuat();
		
		System.out.println("\nDiem toan: " + this.diemToan);
		System.out.println("diem van: " + this.diemVan);
		System.out.println("diem ngoai ngu: " + this.diemNgoaiNgu);
	}
	
	public float tinhDiemTrungBinh() {
		return 1;
	}
}
