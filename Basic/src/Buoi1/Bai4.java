package Buoi1;
import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float dai;
		System.out.println("Nhap vao chieu dai: ");
		dai = scan.nextFloat();
		
		float rong;
		System.out.println("Nhap vao chieu rong: ");
		rong = scan.nextFloat();
		
		System.out.println("Dien tich: " + (dai * rong));
		System.out.println("Chu vi: " + (dai + rong)/2);
	}
}
