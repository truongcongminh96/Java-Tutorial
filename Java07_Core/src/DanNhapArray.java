/**
 *
 * @author minhtruong
 *
 */

import java.util.Scanner;

public class DanNhapArray {

	public static void main(String[] args) {
		/**
		 * Viet chuong trinh tinh tong doanh thu cua mot chuoi cua hang gom 10 chi nhanh
		 *
		 * cho nguoi dung nhap vao doanh thu tung chi nhanh
		 *
		 * xuat ra tong doanh thu va doanh thu cua tung chi nhanh
		 *
		 */

	    Scanner scanner = new Scanner(System.in);

	    long[] doanhThu = new long[10];
	    long tongDoanhThu = 0;

	    for (int i = 0; i < doanhThu.length; i++) {
	      System.out.println("Nhap doanh thu chi nhanh: " + i + " : ");
	      doanhThu[i] = scanner.nextLong();
	    }

	    System.out.println("Doanh thu cac chi nhanh: ");

	    for (int i = 0; i < doanhThu.length; i++) {
	    	System.out.println("Chi nhanh " + (i + 1) + " : " + doanhThu[i]);
	    	tongDoanhThu = tongDoanhThu + doanhThu[i];
	    }

	   System.out.println("Tong doanh thu: " + tongDoanhThu);
	   System.out.println("======================================");

	   baiTapMang();
	   scanner.close();
	}

	public static void baiTapMang() {
		/**
		 * Cho nguoi dung nhap vao so phan tu cua mang (kiem tra)
		 * cho nguoi dung nhap phan tu
		 * xuat ra man hinh co bao nhieu so chia het cho 3
		 */

		 Scanner scanner = new Scanner(System.in);
		 int soPhanTu, dem = 0;
		 int[] phanTu;

		 do {
				System.out.println("Nhap so phan tu: ");
				soPhanTu = scanner.nextInt();
			} while (soPhanTu < 1);

		 phanTu = new int[soPhanTu];

		 for (int i = 0; i < soPhanTu; i++) {
			 System.out.println("Nhap phan tu: " + (i + 1) + " : ");
			 phanTu[i] = scanner.nextInt();

			 if (phanTu[i] %3 == 0) {
				 dem++;
			 }
		 }
		  System.out.println("So phan tu chia het cho 3: " + dem);
		 scanner.close();

	}
}

