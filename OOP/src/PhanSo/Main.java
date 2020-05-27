package PhanSo;

public class Main {
	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo(1, 2);
//		ps1.nhap();
		
		PhanSo ps2 = new PhanSo(3, 4);
//		ps2.nhap();
		
		PhanSo tong = new PhanSo();
		PhanSo hieu = new PhanSo();
		PhanSo tich = new PhanSo();
		PhanSo thuong = new PhanSo();
		
		tong = ps1.tongPhanSo(ps2);
		hieu = ps1.hieuPhanSo(ps2);
		tich = ps1.tichPhanSo(ps2);
		thuong = ps1.thuongPhanSo(ps2);
		
		System.out.println("Tong la: ");
		tong.xuat();
		
		System.out.println("Hieu: ");
		hieu.xuat();
		
		System.out.println("Tich: ");
		tich.xuat();
		
		System.out.println("Thuong: ");
		thuong.xuat();
	}
}
