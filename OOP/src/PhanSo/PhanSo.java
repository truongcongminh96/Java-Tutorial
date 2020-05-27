package PhanSo;

import java.util.Scanner;
public class PhanSo {
	//1. thuoc tinh attributes
	private int tuSo;
	private int mauSo;

	//2. khoi tao
   public PhanSo() {
     this.tuSo = 0;
     this.mauSo = 1;
   }

   public PhanSo(int tuSo, int mauSo) {
     this.tuSo = tuSo;
     this.mauSo = mauSo;
   }

	//3. get, set
  

	//4. nhap. xuat
	public void nhap() {
		Scanner input = new Scanner(System.in);


		System.out.println("Nhap tu so: ");
		tuSo = input.nextInt();

		System.out.println("Nhap mau so: ");
		mauSo = input.nextInt();
	}

	public void xuat() {
		System.out.println(this.tuSo + "/" + this.mauSo);
	}

	//. nghiep vu
	public PhanSo tongPhanSo(PhanSo ps2) {
		PhanSo tong = new PhanSo();
		
		tong.tuSo = (this.tuSo * ps2.mauSo) + (this.mauSo * ps2.tuSo);
		tong.mauSo = this.mauSo * ps2.mauSo;
		
		PhanSo kqRutGon = new PhanSo();
		kqRutGon = rutGon(tong);
		
		return kqRutGon;
	}
	
	public PhanSo hieuPhanSo(PhanSo ps2) {
		PhanSo hieu = new PhanSo();
		
		hieu.tuSo = (this.tuSo * ps2.mauSo) - (this.mauSo * ps2.tuSo);
		hieu.mauSo = this.mauSo * ps2.mauSo;
		
		PhanSo kqRutGon = new PhanSo();
		kqRutGon = rutGon(hieu);
		
		return kqRutGon;
	}
	
	public PhanSo tichPhanSo(PhanSo ps2) {
		PhanSo tich = new PhanSo();
		
		tich.tuSo = this.tuSo * ps2.mauSo;
		tich.mauSo = this.mauSo * ps2.mauSo;
		
		PhanSo kqRutGon = new PhanSo();
		kqRutGon = rutGon(tich);
		
		return kqRutGon;
	}
	
	public PhanSo thuongPhanSo(PhanSo ps2) {
		PhanSo thuong = new PhanSo();
		
		thuong.tuSo = this.tuSo * ps2.mauSo;;
		thuong.mauSo = this.mauSo * ps2.tuSo;
		
		PhanSo kqRutGon = new PhanSo();
		kqRutGon = rutGon(thuong);
		return kqRutGon;
	}
	
	public PhanSo rutGon(PhanSo ps) {
		
		PhanSo ketQua = new PhanSo();
		int UCLN = timUCLN(ps.tuSo, ps.mauSo);
		
		ketQua.tuSo = ps.tuSo/UCLN;
		ketQua.tuSo = ps.mauSo/UCLN;
		
		return ketQua;
	}
	
	public int timUCLN (int a, int b) {
		
		while(a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		
		return a;
	}
	
}
