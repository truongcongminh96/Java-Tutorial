package Buoi1;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int so;
		System.out.println("Nhap vao co hai chu so: ");
		so = scan.nextInt();
		
		int soHangDonVi = so % 10;
		int soHangChuc = so / 10;
		
		System.out.println("Tong hai ky so: " + (soHangDonVi + soHangChuc));
	}

}
