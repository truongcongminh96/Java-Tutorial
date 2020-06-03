/**
 * 
 * @author minhtruong
 *
 */

public class TruongPhong extends NhanSu {
	//1. attributes
	private int soNhanVien;
	private final float LUONG_1_NGAY = 200;

	//2. constructors
	public TruongPhong() {
		super();
		this.luong1Ngay = LUONG_1_NGAY;
	}

	public TruongPhong(String maSo, String hoTen, String sdt, int soNgayLam) { // ko thêm thuộc tính soNhanVien vì sẽ thiết kế hàm cập nhật số nhân viên
		super(maSo, hoTen, sdt, soNgayLam);
		this.luong1Ngay = LUONG_1_NGAY;
	}

	//3. get - set
	public int getSoNhanVien() {
		return soNhanVien;
	}

	public void setSoNhanVien(int soNhanVien) {
		this.soNhanVien = soNhanVien;
	}

	//4. Input - Output
	public void nhap() {

	}

	public void xuat() {
		super.xuat();
		System.out.println("Số nhân viên: " + this.soNhanVien);
	}
	@Override
	public float tinhLuong() {
		return this.luong1Ngay * this.soNgayLam + (100 * this.soNhanVien);
	}


}
