package Buoi2;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String tenSinhVien1, tenSinhVien2, tenSinhVien3;
		int namSinhS1, namSinhS2, namSinhS3, year = 2020;
	

		System.out.println("Nhap vao ten sinh vien 1: ");
		tenSinhVien1 = scan.nextLine();
		System.out.println("Nhap vao ten sinh vien 2: ");
		tenSinhVien2 = scan.nextLine();
		System.out.println("Nhap vao ten sinh vien 3: ");
		tenSinhVien3 = scan.nextLine();
		
		System.out.println("Nhap vao nam sinh sinh vien 1: ");
		namSinhS1 = scan.nextInt();
		System.out.println("Nhap vao nam sinh sinh vien 2: ");
		namSinhS2 = scan.nextInt();
		System.out.println("Nhap vao nam sinh sinh vien 3: ");
		namSinhS3 = scan.nextInt();
		
		if ((namSinhS1 >= namSinhS2 && namSinhS1 >=namSinhS3) && namSinhS2 >= namSinhS3) {
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien1);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS1));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien2);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS2));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien3);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS3));
			
		} else if ((namSinhS1 >= namSinhS2 && namSinhS1 >= namSinhS3) && namSinhS3 >= namSinhS2) {
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien1);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS1));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien3);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS3)); 
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien2);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS2));
					
		} else if ((namSinhS2 >= namSinhS1 && namSinhS2 >= namSinhS3) && namSinhS1 >= namSinhS3) {
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien2);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS2));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien1);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS1));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien3);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS3));
			
		} else if ((namSinhS2 >= namSinhS1 && namSinhS2 >= namSinhS3) && namSinhS3 >= namSinhS1){
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien2);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS2));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien3);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS3));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien1);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS1));
			
		} else if (namSinhS2 >= namSinhS1){
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien3);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS3));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien2);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS2));
	
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien1);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS1));
			
		} else {
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien3);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS3));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien1);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS1));
			
			System.out.println("Ten sinh vien trer nhat: " + tenSinhVien2);
			System.out.println("Tuoi sinh vien trer nhat: " + (year - namSinhS2));
	
		}
		
	}

}
