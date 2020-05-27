package Buoi2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap vao mot so a: ");
		a = scan.nextFloat();
		
		System.out.println("Nhap vao mot so b: ");
		b = scan.nextFloat();
		
		System.out.println("Nhap vao mot so c: ");
		c = scan.nextFloat();
		
		a = (a < 0) ? ((-1) * a) : a;
		b = (b < 0) ? ((-1) * b) : b;
		c = (c < 0) ? ((-1) * c) : c;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}

}
