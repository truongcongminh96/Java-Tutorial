package Buoi1;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float so1, so2, so3, so4, so5;
		System.out.println("Nhap so: ");
		Scanner scan = new Scanner(System.in);
		so1 = scan.nextFloat();
		so2 = scan.nextFloat();
		so3 = scan.nextFloat();
		so4 = scan.nextFloat();
		so5 = scan.nextFloat();
		System.out.println("Trung binh cong cua 5 so: " + ((so1 + so2 + so3 + so4 + so5)/5));
	}

}
