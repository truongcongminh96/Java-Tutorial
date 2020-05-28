import java.time.LocalDate;
import java.util.LinkedList;

/**
 * 
 * @author minhtruong
 *
 */
public class TruongHoc {
	private LinkedList<Nguoi> dsNguoi;

	public TruongHoc() {
		dsNguoi = new LinkedList<Nguoi>();
	}

	public TruongHoc(LinkedList<Nguoi> dsNguoi) {
		super();
		this.dsNguoi = dsNguoi;
	}
	
	public void nhap() {
		
	}
	
	public void khoiTaoDanhSachGiaoVienVaHocSinh() {
		Nguoi nguoi1 = new HocSinh("Hoc sinh 1", 1996, "HCM", 1, 2, 3);
		Nguoi nguoi2 = new HocSinh("Hoc sinh 2", 1997, "DA LAT", 4, 5, 6);
		Nguoi nguoi3 = new HocSinh("Hoc sinh 3", 1998, "Ha Noi", 6, 5, 4);
		Nguoi nguoi4 = new HocSinh("Hoc sinh 3", 1999, "Dong Thap", 7, 8, 9);
		
		Nguoi nguoi5 = new GiaoVien("GV 1", 1988, "HCM", 2006, "tu nhien");
		Nguoi nguoi6 = new GiaoVien("GV 2", 1989, "an giang", 2007, "xa hoi");
		Nguoi nguoi7 = new GiaoVien("GV 3", 1990, "long an", 2008, "the duc");
		Nguoi nguoi8 = new GiaoVien("GV 4", 1991, "nghe an", 2009, "dao duc");
		
		this.dsNguoi.add(nguoi1);
		this.dsNguoi.add(nguoi7);
		this.dsNguoi.add(nguoi8);
		this.dsNguoi.add(nguoi6);
		this.dsNguoi.add(nguoi4);
		this.dsNguoi.add(nguoi2);
		this.dsNguoi.add(nguoi3);
		this.dsNguoi.add(nguoi5);
	}
	
	public void xuat() {
//		this.dsNguoi.forEach(n -> xuat());
		for (Nguoi nguoi: this.dsNguoi) {
			nguoi.xuat();
		}
	}
	
	public LinkedList<GiaoVien> timGiaoVienLauNam() {
		LinkedList<GiaoVien> dsKetQua = new LinkedList<GiaoVien>();
		
		dsKetQua.stream().filter(gv -> gv.tinhThamNien() > 5)
					 	 .filter(gv -> gv.getChuyenMon().equalsIgnoreCase("tu nhien"))
					 	 .forEach(gv -> dsKetQua.add(gv));
		
		return dsKetQua;
		
	}
	
//	public LinkedList<GiaoVien> timGiaoVienLauNam() {
//		LinkedList<GiaoVien> dsKetQua = new LinkedList<GiaoVien>();
//		
//		for (Nguoi ng:this.dsNguoi) {
//			if(ng instanceof GiaoVien) {
//				if(((GiaoVien) ng).tinhThamNien() > 5 && ((GiaoVien) ng).getChuyenMon().equalsIgnoreCase("tu nhien")) {
//					dsKetQua.add((GiaoVien)ng);
//				}
//			}
//		}
//		
//		return dsKetQua;
//	}
}
