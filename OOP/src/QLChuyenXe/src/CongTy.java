/**
 * 
 * @author minhtruong
 *
 */

import java.util.LinkedList;

public class CongTy {
	private LinkedList<ChuyenXe> dsChuyenXe;
	
	public CongTy() {
		dsChuyenXe = new LinkedList<ChuyenXe>();
	}
	
	public CongTy(LinkedList<ChuyenXe> dsChuyenXe) {
		this.dsChuyenXe = dsChuyenXe;
	}
	
	public void nhap() {
		
	}
	
	public void khoiTaoDanhSachChuyenXe() {
		ChuyenXe chuyen1 = new ChuyenXeNoiThanh("NT1", "TCM", "66A", 1000, 1, 200);
		ChuyenXe chuyen2 = new ChuyenXeNoiThanh("NT2", "TCM11", "66A2", 2000, 4, 100);
		ChuyenXe chuyen3 = new ChuyenXeNoiThanh("NT3", "TCM12", "66A3", 5000, 5, 1000);
		ChuyenXe chuyen4 = new ChuyenXeNgoaiThanh("NgoaiT1", "PPP", "59A", 50000, "Da Lat", 1);
		ChuyenXe chuyen5 = new ChuyenXeNgoaiThanh("NgoaiT2", "PPPA", "59B", 70000, "Tay Nguyen", 2);
		ChuyenXe chuyen6 = new ChuyenXeNgoaiThanh("NgoaiT3", "PPPB", "59C", 90000, "Ha Noi", 5);
		ChuyenXe chuyen7 = new ChuyenXeNoiThanh("NT4", "TCM", "66A", 1000, 1, 200);
		
		this.dsChuyenXe.add(chuyen1);
		this.dsChuyenXe.add(chuyen4);
		this.dsChuyenXe.add(chuyen5);
		this.dsChuyenXe.add(chuyen7);
		this.dsChuyenXe.add(chuyen3);
		this.dsChuyenXe.add(chuyen6);
		this.dsChuyenXe.add(chuyen2);
	}
	
	public void xuat() {	
		dsChuyenXe.forEach((chuyenXe) -> chuyenXe.xuat());
	}

	public float tinhTongDoanhThuNoiThanh() {
		float tongDoanhThu = 0;
		
		for(ChuyenXe chuyenXe: this.dsChuyenXe) {
			if (chuyenXe instanceof ChuyenXeNoiThanh) {
				tongDoanhThu = tongDoanhThu + chuyenXe.getDoanhThu();
			}
		}
		
		return tongDoanhThu;
	}
	
}
