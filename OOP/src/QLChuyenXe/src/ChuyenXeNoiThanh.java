
public class ChuyenXeNoiThanh extends ChuyenXe {

	private int soTuyen;
	private int soKm;

	public ChuyenXeNoiThanh() {
		this.soTuyen = 0;
		this.soKm = 0;
	}

	public ChuyenXeNoiThanh(String maChuyen, String hoTenTaiXe, String soXe, float doanhThu, int soTuyen, int soKm) {
		super(maChuyen, hoTenTaiXe, soXe, doanhThu);
		// TODO Auto-generated constructor stub
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKm() {
		return soKm;
	}

	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}

	public void nhap() {

	}

	public void xuat() {
		super.xuat();
		System.out.println("So Tuyen: " + this.soTuyen);
		System.out.println("So Km: " + this.soKm);
	}
}
