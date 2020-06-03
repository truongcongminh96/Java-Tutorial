/**
 * Lớp CongTy chứa các thuộc tính: tên công ty, mã số thuế, doanh thu và danh sách nhân sự
 * @author minhtruong
 * 31-05-2020
 */

import java.util.LinkedList;
import java.util.Scanner;

public class CongTy {
	//1. attributes
	private String tenCongTy;
	private String maSoThue;
	private double doanhThu;

	private LinkedList<NhanSu> dsNhanSu;

	//2. constructors
	public CongTy() {
		dsNhanSu = new LinkedList<NhanSu>();
	}

	public CongTy(LinkedList<NhanSu> dsNhanSu) {
		super();
		this.dsNhanSu = dsNhanSu;
	}
	public CongTy(String tenCongTy, String maSoThue, double doanhThu, LinkedList<NhanSu> dsNhanSu) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		this.doanhThu = doanhThu;
		this.dsNhanSu = dsNhanSu;
		this.dsNhanSu = dsNhanSu;
	}


	//3. get - set
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	public LinkedList<NhanSu> getDsNhanSu() {
		return dsNhanSu;
	}

	public void setDsNhanSu(LinkedList<NhanSu> dsNhanSu) {
		this.dsNhanSu = dsNhanSu;
	}

	//4. Input - Output
	public void nhap() {

	}

	public void khoiTaoDanhSachNhanSu() {
		NhanSu ns1 = new TruongPhong("TP1", "Trưởng phòng 1", "09090909", 28);
		NhanSu ns2 = new NhanVien("NV1", "Nhân viên 1", "0808080", 20, "TP1");
		NhanSu ns3 = new NhanVien("NV2", "Nhân viên 2", "0808080", 23, "TP1");
		NhanSu ns4 = new TruongPhong("TP2", "Trưởng phòng 2", "0707077", 30);
		NhanSu ns5 = new NhanVien("NV3", "Nhân viên 3", "04040404", 30, "TP2");
		NhanSu ns6 = new NhanVien("NV4", "Nhân viên 4", "05050505", 25, "TP2");
		NhanSu ns7 = new GiamDoc("GD1", "Giám đốc điều hành", "759438759", 30, 30);
		NhanSu ns8 = new GiamDoc("GD2", "Giám đốc tài chính", "732874829", 29, 25);
		NhanSu ns9 = new GiamDoc("GD3", "Tổng Giám đốc", "232434829", 25, 31);

		this.dsNhanSu.add(ns1);
		this.dsNhanSu.add(ns2);
		this.dsNhanSu.add(ns3);
		this.dsNhanSu.add(ns4);
		this.dsNhanSu.add(ns5);
		this.dsNhanSu.add(ns6);
		this.dsNhanSu.add(ns7);
		this.dsNhanSu.add(ns8);
		this.dsNhanSu.add(ns9);

		capNhatSoLuongNhanVienDuoiQuyen();
	}
	public void xuat() {
		for(NhanSu ns : this.dsNhanSu) {
			ns.xuat();
		}
	}

	public void xuatTruongPhong(LinkedList<TruongPhong> dsTruongPhong) {
		for(TruongPhong tp : dsTruongPhong) {
			tp.xuat();
		}
	}

	public void xuatGiamDoc(LinkedList<GiamDoc> dsGiamDoc) {
		for(GiamDoc gd : dsGiamDoc) {
			gd.xuat();
		}
	}
	//5. Business Methods
	public float tinhTongLuongCongTy() {
		float tong = 0;
		for(NhanSu ns : this.dsNhanSu) {
			tong += ns.tinhLuong();
		}
		return tong;
	}

	// danh sách trưởng phòng có lương cao nhất
	public LinkedList<TruongPhong> timTruongPhongCoLuongMax(){
		LinkedList<TruongPhong> dsKetQua = new LinkedList<TruongPhong>();
		float max = 0;
		for(NhanSu ns : this.dsNhanSu) {
			if(ns instanceof TruongPhong) {
				if(ns.tinhLuong() > max) {
					max = ns.tinhLuong();
				}
			}
		}
		for(NhanSu ns : this.dsNhanSu) {
			if(ns instanceof TruongPhong) {
				if(ns.tinhLuong() == max) {
					dsKetQua.add((TruongPhong)ns);
				}
			}
		}
		return dsKetQua;
	}

	public void capNhatSoLuongNhanVienDuoiQuyen() {

		LinkedList<NhanVien> dsNhanVien = new LinkedList<NhanVien>();

		//Tao danh sach chi chua nhan vien
		for (NhanSu nS:this.dsNhanSu) {
			if(nS instanceof NhanVien) {
				dsNhanVien.add((NhanVien)nS);
			}
		}

		//Duyet het tat ca nhan vien co trong danh sach nhan vien de cap nhat
		//cho truong phong
		for(NhanSu nS:this.dsNhanSu) {
			if(nS instanceof TruongPhong) {
				for(NhanVien nV:dsNhanVien) {
					if(nV.getMaTruongPhong().equalsIgnoreCase(nS.maSo)) {
						((TruongPhong) nS).setSoNhanVien(((TruongPhong) nS).getSoNhanVien() + 1);
					}
				}
			}
		}
	}

	public void xoaTruongPhong() {
		//B1 Nhap ma truong phong can xoa
		//B2 Duyet qua het tat ca nhan vien trong danh sach nhan su
		// Neu ma truong phong cua nhan vien bang voi ma truong phong can xoa tji
			//cap nhat lai ma truong phong cua nhan vien la null

		//B1
		try {
		String maTruongPhong = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien cua truong phong can xoa: ");
		maTruongPhong = input.nextLine();

		TruongPhong tP = new TruongPhong();
		tP = timTruongPhongTheoMa(maTruongPhong);

		//B2
		for (NhanSu nS:this.dsNhanSu) {
			if (nS instanceof NhanVien) {
				if (((NhanVien) nS).getMaTruongPhong().equalsIgnoreCase(maTruongPhong)) {
					((NhanVien) nS).setMaTruongPhong(null);
				}
			}
		}

		this.dsNhanSu.remove(tP);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
	}

	public TruongPhong timTruongPhongTheoMa(String maTruongPhong) {
		TruongPhong tP = new TruongPhong();

		for (NhanSu nS:this.dsNhanSu) {
			if(nS instanceof TruongPhong) {
				if (nS.maSo.contentEquals(maTruongPhong)) {
					tP = (TruongPhong) nS;
					break;
				}
			}
		}
		return tP;
	}

	public void xoaNhanSu() {
		//Neu la nhan vien hay giam doc thi xoa binh thuong
		//Neu la nhan vien thi cap nhat lai so nhan vien cua truong phong quan ly nhan vien do
		//Neu la truong phong thi phai cap nhat lai ma nhan vien duoi quyen la null

		try {
			String maNhanVien;
			Scanner input = new Scanner(System.in);
			System.out.println("Nhap ma nhan vien can xoa: ");
			maNhanVien = input.nextLine();

		} catch (Exception e) {

		}
	}

//	public void capNhatTrangThai(NhanVien nv) {
//		for (NhanSu nhanSu: this.dsNhanSu) {
//			if (nhanSu instanceof TruongPhong) {
//				if (nv.getMaTruongPhong().equalsIgnoreCase(((TruongPhong)nhanSu).maSo) {
//					((TruongPhong)nhanSu).setMaSo(((TruongPhong)nhanSu).maSo);
//				}
//			}
//		}
//	}

	// Danh sách giám đốc có cổ phần cao nhất
	public LinkedList<GiamDoc> timGiamDocCoPhanMax(){
		LinkedList<GiamDoc> dsKetQua = new LinkedList<GiamDoc>();
		float max = 0;
		for(NhanSu ns : this.dsNhanSu) {
			if(ns instanceof GiamDoc) {
				dsKetQua.add((GiamDoc)ns);
			}
		}
		for(int i = 0; i < dsKetQua.size(); i++) {
			float soCoPhan = dsKetQua.get(i).getSoCoPhan();
			if(soCoPhan > max) {
				max = soCoPhan;
			}
		}
		for(GiamDoc gd : dsKetQua) {
			if(gd.getSoCoPhan() < max) {
				dsKetQua.remove(gd);
			}
		}
		return dsKetQua;
	}
}
