package Buoi2;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int so;
		
		String tenSoHangChuc = null;
		String tenSoHangDonVi = null;
		
		System.out.println("Nhap vao mot so: ");
		so = scan.nextInt();
		
		int soHangChuc = so / 10;
		int soHangDonVi = so % 10;

		if (soHangChuc == 1 && soHangDonVi == 0) {
			System.out.println("muoi");
		} else if (soHangChuc == 1) {
			tenSoHangChuc = "muoi";
		} else if (soHangChuc == 2) {
			tenSoHangChuc = "hai";
		} else if (soHangChuc == 3) {
			tenSoHangChuc = "ba";
		} else if (soHangChuc == 4) {
			tenSoHangChuc = "bon";
		} else if (soHangChuc == 5) {
			tenSoHangChuc = "nam";
		} else if (soHangChuc == 6) {
			tenSoHangChuc = "sau";
		} else if (soHangChuc == 7) {
			tenSoHangChuc = "bay";
		} else if (soHangChuc == 8) {
			tenSoHangChuc = "tam";
		} else if (soHangChuc == 9) {
			tenSoHangChuc = "chin";
		}
		
		if (soHangDonVi == 0) {
			tenSoHangDonVi = "muoi";
		} else if (soHangDonVi == 1) {
			tenSoHangDonVi = "mot";
		}
		else if (soHangDonVi == 2) {
			tenSoHangDonVi = "hai";
		}
		else if (soHangDonVi == 3) {
			tenSoHangDonVi = "ba";
		}
		else if (soHangDonVi == 4) {
			tenSoHangDonVi = "bon";
		}
		else if (soHangDonVi == 5) {
			tenSoHangDonVi = "nam";
		}
		else if (soHangDonVi == 6) {
			tenSoHangDonVi = "sau";
		}
		else if (soHangDonVi == 7) {
			tenSoHangDonVi = "bay";
		}
		else if (soHangDonVi == 8) {
			tenSoHangDonVi = "tam";
		}
		else if (soHangDonVi == 9) {
			tenSoHangDonVi = "chin";
		}
		
		System.out.println(tenSoHangChuc + " " + tenSoHangDonVi);
	}

}
