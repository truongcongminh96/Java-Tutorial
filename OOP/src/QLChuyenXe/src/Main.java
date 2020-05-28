import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CongTy congTy = new CongTy();
		
		congTy.khoiTaoDanhSachChuyenXe();
		congTy.xuat();
		
		float tongDoanhThuNoiThanh = 0;
		tongDoanhThuNoiThanh = congTy.tinhTongDoanhThuNoiThanh();
		
		System.out.println("Tong doanh thu noi thanh la: " + tongDoanhThuNoiThanh);
		
	}
}
