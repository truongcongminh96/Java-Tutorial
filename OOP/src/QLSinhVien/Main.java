
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LopHoc lop = new LopHoc();
		
		lop.khoiTaoDanhSach();
		
		/*
		System.out.println("danh sách sinh viên yếu");
		LinkedList<SinhVien> dsSVYeu = new LinkedList<SinhVien>();
		dsSVYeu = lop.inDanhSachSinhVienyeu();
		lop.xuat(dsSVYeu);
		*/
		/*
		System.out.println("Tìm danh sách sinh viên theo tên");
		LinkedList<SinhVien> dsSVCungTen = new LinkedList<SinhVien>();
		dsSVCungTen = lop.timSinhVienTheoTen();
		lop.xuat(dsSVCungTen);
		*/
		/*
		System.out.println("Sinh Viên có điểm Trung Bình cao nhất: ");
		LinkedList<SinhVien> dsSVDiemTBMax = new LinkedList<SinhVien>();
		dsSVDiemTBMax = lop.inDanhSachSinhVienCoDTBmax();
		lop.xuat(dsSVDiemTBMax);
		*/
		SinhVien sv = new SinhVien();
		Scanner scan = new Scanner(System.in);
		
		lop.xoaSV();
		lop.xuat();
		
		
	}

}
