package Buoi1;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dolars;
		System.out.println("Nhap vao so tien $: ");
		Scanner scan = new Scanner(System.in);
		dolars = scan.nextDouble();
		System.out.println("Gia tri quy doi: " + (int)(23500 * dolars));
	}

}
