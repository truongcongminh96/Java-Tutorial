import java.util.Scanner;

public class HinhChuNhat {
	//1. thuoc tinh attributes
	private float chieuDai;
	private float chieuRong;

		//2. khoi tao
	  public HinhChuNhat() {
	    this.chieuDai = 5;
	    this.chieuRong = 2;
	  }

	  public HinhChuNhat(float chieuDai, float chieuRong) {
	    this.chieuDai = chieuDai;
	    this.chieuRong = chieuRong;

	  }

		//3. get, set

		//4. nhap. xuat
		public void nhap() {
			Scanner input = new Scanner(System.in);

			System.out.println("Nhap chieu dai: ");
			chieuDai = input.nextFloat();

			System.out.println("Nhap dieu rong: ");
			chieuRong = input.nextFloat();

		}

		public void xuat() {

			float chuVi = tinhChuVI();
			float dienTich = tinhDienTich();

			System.out.println("Chieu dai: " + this.chieuDai);
			System.out.println("Chieu dai: " + this.chieuRong);
			System.out.println("Chu vi la: " + chuVi);
			System.out.println("dien tich la: " + dienTich);
		}

		//. nghiep vu
		public float tinhChuVI() {
			return (this.chieuDai + this.chieuRong) * 2;
		}

		public float tinhDienTich() {
			return (this.chieuDai * this.chieuRong);
		}
}
