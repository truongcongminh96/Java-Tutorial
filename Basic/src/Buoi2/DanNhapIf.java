package Buoi2;
import java.util.Scanner;
public class DanNhapIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soNhap;
		
		System.out.println("Nhap vao mot so: ");
		soNhap = scan.nextInt();
		
		if(soNhap < 0) {
			soNhap *= -1;
		}
		
		System.out.println("Ket qua cuoi cung: " + soNhap);
	}

}
