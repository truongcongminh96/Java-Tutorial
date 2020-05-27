package Buoi1;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dates;
		System.out.println("Nhap vao so ngay lam: ");
		Scanner scan = new Scanner(System.in);
		dates = scan.nextInt();
		System.out.println("Tien luong thang nay cua ban: " + (100000 * dates));

	}

}
