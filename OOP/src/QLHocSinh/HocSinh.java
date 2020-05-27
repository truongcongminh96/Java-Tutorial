package QLHocSinh;


import java.util.Scanner;

public class HocSinh {
	//1. thuoc tinh attributes
	private String hoTen;
	private float diemToan;
	private float diemVan;

	//2. khoi tao
  public HocSinh() {
    this.hoTen = "";
    this.diemToan = 0;
    this.diemVan = 0;
  }

  public HocSinh(String hoTen, float diemToan, float van) {
    this.hoTen = hoTen;
    this.diemToan = diemToan;
    diemVan = van;
  }

	//3. get, set

	//4. nhap. xuat
	public void nhap() {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap ho ten: ");
		hoTen = input.nextLine();

		System.out.println("Nhap diem van: ");
		diemToan = input.nextFloat();

		System.out.println("Nhap diem toan: ");
		diemVan = input.nextFloat();
	}

	public void xuat() {

		float dTB = tinhDiemTrungBinh();
		String loai = xepLoai();

		System.out.println(dTB);
		System.out.println(loai);
	}

	//. nghiep vu
	public float tinhDiemTrungBinh() {
		return (this.diemToan + this.diemVan) / 2;
	}

	public String xepLoai() {
		String loai = null;
		float dTB = tinhDiemTrungBinh();

		if (dTB < 5) {
			loai = "Yeu";
		} else if(dTB >= 5 && dTB < 7) {
			loai = "Trung Binh";
		} else if(dTB >= 7 && dTB < 8) {
			loai = "Kha";
		} else if(dTB > 8) {
			loai = "Gioi";
		}

		return loai;
	}
}

