/**
 * Lớp GiamDoc kế thừa lớp NhanSu, có thuộc tính soCoPhan
 * @author minhtruong
 * 31-05-2020
 */
public class GiamDoc extends NhanSu {
	//1. attributes
	private float soCoPhan;
	private final float LUONG_1_NGAY = 300;
	
	//2. constructors
	public GiamDoc() {
		super();
		this.soCoPhan = 0;
		this.luong1Ngay = LUONG_1_NGAY;
	}

	public GiamDoc(String maSo, String hoTen, String sdt, int soNgayLam, float soCoPhan) {
		super(maSo, hoTen, sdt, soNgayLam);
		this.luong1Ngay = LUONG_1_NGAY;
		this.soCoPhan = soCoPhan;
	}
	
	//3. get - set
	public float getSoCoPhan() {
		return soCoPhan;
	}
	public void setSoCoPhan(float soCoPhan) {
		this.soCoPhan = soCoPhan;
	}
	
	//4. Input - Output
	public void nhap() {
		
	}
	public void xuat() {
		super.xuat();
		System.out.println("Số cổ phần: " + this.soCoPhan);
	}
	
	@Override
	public float tinhLuong() {
		return this.luong1Ngay * this.soNgayLam;
	}
	

}