/**
 * Lớp LOPHOC chứa danh sách sinh viên
 * @author Minh Truong
 * Create at: 24/5/2020
 * Version 1.0
 */

import java.util.LinkedList;
import java.util.Scanner;

public class LopHoc {
// 1. Thuộc tính
	private LinkedList<SinhVien> dsSinhVien;
// 2. Khởi tạo

public LopHoc() {
	dsSinhVien = new LinkedList<SinhVien>();
}
public LopHoc(LinkedList<SinhVien> dsSinhVien) {
	this.dsSinhVien = dsSinhVien;
}
	
// 3. get, set

// 4. Nhập xuất
	public void khoiTaoDanhSach() {
		SinhVien sv1 = new SinhVien("sv1", "Trịnh Thanh Duy" ,1, 2 ,3);
		SinhVien sv2 = new SinhVien("sv2", "Trần Công Minh" ,4 , 5 ,6);
		SinhVien sv3 = new SinhVien("sv3", "Nguyễn Vũ Anh Huy" ,7 , 9 ,8);
		SinhVien sv4 = new SinhVien("sv4", "Trần Tiến Huy" ,7 , 8 ,1);
		SinhVien sv5 = new SinhVien("sv5", "Lê Quang Song" ,4 , 7 ,8);
		SinhVien sv6 = new SinhVien("sv6", "Nguyễn Thị X" ,7 , 8 ,9);
		
		this.dsSinhVien.add(sv1);
		this.dsSinhVien.add(sv2);
		this.dsSinhVien.add(sv3);
		this.dsSinhVien.add(sv4);
		this.dsSinhVien.add(sv5);
		this.dsSinhVien.add(sv6);
	}
	public void nhap() {
		
		
	}
	
	public void xuat() {
		//cách 1: 
//		for(int i = 0; i<this.dsSinhVien.size();i++) {
//			this.dsSinhVien.get(i).xuat();
//		}
		//cách 2: 
		for (SinhVien sv:this.dsSinhVien) {
			sv.xuat();
		}
	}
	public void xuat(LinkedList<SinhVien>ds) {
		for(SinhVien sv:ds) {
			sv.xuat();
		}
	}
// 5. Nghiệp vụ
	public LinkedList<SinhVien> inDanhSachSinhVienCoDTBmax() {
		LinkedList<SinhVien> dsKetQua = new LinkedList<SinhVien>();
		//b1: tìm sv có điểm trung bình cao nhất
		float diemTBMax = 0f;
		for (int i = 0; i<this.dsSinhVien.size(); i++) {
			float dtb = this.dsSinhVien.get(i).tinhDTB();
			if (dtb > diemTBMax) {
				 diemTBMax = dtb;
			}
		}
		//b2: tìm sinh viên có điểm trung bình bằng với điểm trung bình cao nhất để đưa vào kết quả
		for (SinhVien sv: this.dsSinhVien) {
			if (sv.tinhDTB() == diemTBMax) {
				dsKetQua.add(sv);
			}
		}
		return dsKetQua;
	}
	public LinkedList<SinhVien> inDanhSachSinhVienyeu() {
		LinkedList<SinhVien> dsKetQua = new LinkedList<SinhVien>();
		//B1: Duyệt tất cả sinh viên có trong danh sách
		
		for (SinhVien sv: this.dsSinhVien) {
		//B2: Nếu sinh viên đó có loại "Yếu" thì đưa vào danh sách kết quả
			if(sv.xepLoai().equalsIgnoreCase("Yếu")) {
				dsKetQua.add(sv);
			}
		}
		return dsKetQua;
	}
	public LinkedList<SinhVien> timSinhVienTheoTen() {
		LinkedList<SinhVien> dsKetQua = new LinkedList<SinhVien>();
		Scanner input = new Scanner(System.in);
		String hoTenCanTim = input.nextLine();
		
		for (SinhVien sv:this.dsSinhVien) {
			if (sv.getTen().equalsIgnoreCase(hoTenCanTim)) {
				dsKetQua.add(sv);
			}
		}
		return dsKetQua;
	}
	
	public SinhVien timSinhVienTheoMa(String ma) {
//		SinhVien sv = new SinhVien();
		for(int i = 0; i<this.dsSinhVien.size();i++) {
			if(dsSinhVien.get(i).getMaSV().equalsIgnoreCase(ma)) {
				return dsSinhVien.get(i);
		}
	}
		return null;
	}
	
	public void xoaSV() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập mã SV cần xóa: ");
		String maSV = scan.nextLine();
		
		SinhVien sv = new SinhVien();
		sv = timSinhVienTheoMa(maSV);
		if (sv!=null) {
			this.dsSinhVien.remove(sv);
		} else {
			System.out.println("Không tìm thấy");
		}
	}
}