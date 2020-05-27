package Buoi2;
import java.util.Scanner;
public class DanNhapIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soNhap;
		
		System.out.println("Nhap vao mot so: ");
		soNhap = scan.nextInt();
		
		if(soNhap %2 ==  0 && soNhap != 0) {
			System.out.println("So chan");
		} else {
			System.out.println("So le");
		}
		
	}

}
