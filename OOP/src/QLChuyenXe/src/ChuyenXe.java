/**
 * 
 * @author minhtruong
 *
 */


public class ChuyenXe {

	protected String maChuyen;
	protected String hoTenTaiXe;
	protected String soXe;
	protected float doanhThu;

	public ChuyenXe() {

	}

	public ChuyenXe(String maChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
		this.maChuyen = maChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public float getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}

	public void nhap() {

	}

	public void xuat() {
		System.out.println("\nMa chuyen: " + this.maChuyen);
		System.out.println("Ho Ten Tai Xe: " + this.hoTenTaiXe);
		System.out.println("So Xe: " + this.soXe);
		System.out.println("Doanh Thu: " + this.doanhThu);

	}

}
