package Buoi2;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap vao so nguyen a: ");
		m = scan.nextInt();
		
		System.out.println("Nhap vao so nguyen b: ");
		n = scan.nextInt();
		
		if (m < n) {
			System.out.println(n);
		} else if (m == n) {
			System.out.println("Hai so bang nhau");
		} else {
			System.out.println(n);
		}
	}
}
