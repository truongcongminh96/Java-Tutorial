/**
 * Lớp NhanSu: lớp cha để các lớp con kế thừa
 * @author minhtruong
 * 31 - 05 - 2020
 */

public abstract class NhanSu {
	//1. attributes
	protected String maSo;
	protected String hoTen;
	protected String sdt;
	protected int soNgayLam;
	protected float luong1Ngay;
	
	//2. constructors
	public NhanSu() {
		this.maSo = null;
		this.hoTen = null;
		this.sdt = null;
		this.soNgayLam = 0;
	}
	
	public NhanSu(String maSo, String hoTen, String sdt, int soNgayLam) { // ko có thuộc tính luong1Ngay vì có nhiều loại nhân viên => sẽ gán cho từng đối tượng
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.soNgayLam = soNgayLam;
	}
	
	//3. get - set
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getSoNgayLam() {
		return soNgayLam;
	}

	public void setSoNgayLam(int soNgayLam) {
		this.soNgayLam = soNgayLam;
	}

	public float getLuong1Ngay() {
		return luong1Ngay;
	}

	public void setLuong1Ngay(float luong1Ngay) {
		this.luong1Ngay = luong1Ngay;
	}
	
	//4. Input - Output
	public void nhap() {
		
	}
	
	public void xuat() {
		System.out.println("\nMã số: " + this.maSo);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Số điện thoại: " + this.sdt);
		System.out.println("Số ngày làm: " + this.soNgayLam);
		System.out.println("Lương 1 ngày: " + this.luong1Ngay);
	}
	
	//5. Business methods
	public abstract float tinhLuong(); // phương thức trừu tượng
}