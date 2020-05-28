import java.util.LinkedList;

/**
 * 
 * @author minhtruong
 *
 */
public class Main {
	public static void main(String[] args) {
		TruongHoc truongHoc = new TruongHoc();
		
		truongHoc.khoiTaoDanhSachGiaoVienVaHocSinh();
		truongHoc.xuat();
		
		LinkedList<GiaoVien> dsGiaoVien = new LinkedList<GiaoVien>();
		
		dsGiaoVien.forEach(gv -> gv.xuat());
	}
}
