package Buoi2;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float soLuong;
		float donGia;
		float giaSanPham;
		float dealPrice1 = (float) 0.08;
		float dealPrice2 = (float) 0.12;
		String ten;
		
		System.out.println("Nhap vao ten: ");
		ten = scan.nextLine();
		System.out.println("Nhap vao so luong mua: ");
		soLuong = scan.nextFloat();
		System.out.println("Nhap vao gia san pham: ");
		giaSanPham = scan.nextFloat();
		
		if (soLuong < 50) {
			donGia = (soLuong * giaSanPham);
			System.out.println("Thanh tien: " + donGia);
		} else if (soLuong >= 50 && soLuong <= 100){
			donGia = (soLuong * giaSanPham) * dealPrice1;
			System.out.println("Thanh tien: " + donGia);
		} else {
			donGia = (soLuong * giaSanPham) * dealPrice2;
			System.out.println("Thanh tien: " + donGia);
		}
	}

}
