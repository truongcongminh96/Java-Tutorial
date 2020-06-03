/*Lớp NhanVien kế thừa từ lớp NhanSu, có thuộc tính maTruongPhong
@Author: Dat
Ngày tạo: 31-05-2020
Phiên bản: 1.0*/
public class NhanVien extends NhanSu {
	//1. attributes
	private String maTruongPhong;
	private final float LUONG_1_NGAY = 100; // hằng số lương nhân viên = 100

	//2. constructors
	public NhanVien() {
		super();
		this.maTruongPhong = null;
		this.luong1Ngay = LUONG_1_NGAY;
	}

	public NhanVien(String maSo, String hoTen, String sdt, int soNgayLam, String maTruongPhong) {
		super(maSo, hoTen, sdt, soNgayLam);
		this.maTruongPhong = maTruongPhong;
		this.luong1Ngay = LUONG_1_NGAY;
	}

	//3. get - set
	public String getMaTruongPhong() {
		return maTruongPhong;
	}

	public void setMaTruongPhong(String maTruongPhong) {
		this.maTruongPhong = maTruongPhong;
	}

	//4. Input - Output
	public void nhap() {

	}
	public void xuat() {
		super.xuat();
		System.out.println("Mã trưởng phòng: " + this.maTruongPhong);
	}

	@Override
	public float tinhLuong() {
		return this.luong1Ngay * this.soNgayLam;
	}

}

