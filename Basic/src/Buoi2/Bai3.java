package Buoi2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int le = 0;
		int chan = 0;
		
		int a, b, c, d, e;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap vao so 1: ");
		a = scan.nextInt();
		System.out.println("Nhap vao so 2: ");
		b = scan.nextInt();
		System.out.println("Nhap vao so 3: ");
		c = scan.nextInt();
		System.out.println("Nhap vao so 4: ");
		d = scan.nextInt();
		System.out.println("Nhap vao so 5: ");
		e = scan.nextInt();
		
		if (a%2==0) {
			chan+=1;
		} else {
			le+=1;
		}
		
		if (b%2==0) {
			chan+=1;
		} else {
			le+=1;
		}
		
		if (c%2==0) {
			chan+=1;
		} else {
			le+=1;
		}
		
		if (d%2==0) {
			chan+=1;
		} else {
			le+=1;
		}
		
		if (e%2==0) {
			chan+=1;
		} else {
			le+=1;
		}
		
		System.out.println("so chan la: " + chan);
		System.out.println("so le la: " + le);
	}

}
