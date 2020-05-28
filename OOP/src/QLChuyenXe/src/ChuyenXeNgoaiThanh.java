
public class ChuyenXeNgoaiThanh extends ChuyenXe {
	
	private String noiDen;
	private int soNgay;

	public ChuyenXeNgoaiThanh() {
		// TODO Auto-generated constructor stub
		this.noiDen = null;
		this.soNgay = 0;
	}

	public ChuyenXeNgoaiThanh(String maChuyen, String hoTenTaiXe, String soXe, float doanhThu, String noiDen, int soNgay) {
		super(maChuyen, hoTenTaiXe, soXe, doanhThu);
		// TODO Auto-generated constructor stub
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

	
	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public void nhap() {
		
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("\nNoi den: " +this.noiDen);
		System.out.println("So Ngay: " + this.soNgay);
	}

}
