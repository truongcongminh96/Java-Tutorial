package Buoi2;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float toan, ly, hoa;
		String name;
		
		System.out.println("Nhap vao ten: ");
		name = scan.nextLine();
		
		System.out.println("Nhap vao diem toan: ");
		toan = scan.nextFloat();
		
		System.out.println("Nhap vao diem ly: ");
		ly = scan.nextFloat();
		
		System.out.println("Nhap vao diem hoa: ");
		hoa = scan.nextFloat();
		
		float dtb = (toan+ly+hoa)/3;
		
		if (dtb < 5) {
			System.out.println("Sinh vien: " + name + " Xep loai yeu" );
		} else if (5 <= dtb && dtb <= 6.5) {
			System.out.println("Sinh vien: " + name + " Xep loai trung binh" );
		} else if (6.5 <= dtb && dtb <= 8.5) {
			System.out.println("Sinh vien: " + name + " Xep loai kha" );
		} else {
			System.out.println("Sinh vien: " + name + " Xep loai gioi" );
		}
	}

}
