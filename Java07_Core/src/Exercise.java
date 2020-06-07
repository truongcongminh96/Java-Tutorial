/**
 *
 * @author minhtruong
 *
 */

import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Nhap so 1: ");
		num1 = scanner.nextInt();
		System.out.println("Nhap so 2: ");
		num2 = scanner.nextInt();
		System.out.println("Nhap so 3: ");
		num3 = scanner.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println("Tang dan");
		} else if (num1 > num2 && num2 > num3) {
			System.out.println("Giam");
		} else if (num1 == num2 && num2 == num3) {
			System.out.println("Day so bang nhau");
		} else {
       System.out.println("Day so chua sap xep");
    }

		System.out.println(docSo());
		System.out.println(docSoUseSwitchCase());

		scanner.close();
	}

	public static String docSo() {
		Scanner scanner = new Scanner(System.in);
		int number;
		String hangDonVi = null, hangChuc = null;
		System.out.println("Nhap so: ");
		number = scanner.nextInt();

		int soDonVi = number % 10;
		int soHangChuc = number / 10;
		scanner.close();

		if (soHangChuc == 0) {
			hangChuc = "";
		} else if (soHangChuc == 1) {
			hangChuc = "Muoi";
		} else if (soHangChuc == 2) {
			hangChuc = "Hai";
		} else if (soHangChuc == 3) {
			hangChuc = "Ba";
		} else if (soHangChuc == 4) {
			hangChuc = "Bon";
		} else if (soHangChuc == 5) {
			hangChuc = "Nam";
		}

		if (soDonVi == 0) {
			hangDonVi = "";
		} else if (soDonVi == 1) {
			hangDonVi = (soHangChuc == 1) ? "mo^t." : "mo^t'";
		} else if (soDonVi == 2) {
			hangDonVi = "hai";
		} else if (soDonVi == 3) {
			hangDonVi = "ba";
		} else if (soDonVi == 4) {
			hangDonVi = "bon";
		} else if (soDonVi == 5) {
			hangDonVi = (soHangChuc != 0) ? "lam" : "nam";
		}

		return hangChuc + " muoi " + hangDonVi;
	}

	public static String docSoUseSwitchCase() {
		Scanner scanner = new Scanner(System.in);
		int number;
		String hangDonVi = null, hangChuc = null;
		System.out.println("Nhap so: ");
		number = scanner.nextInt();

		int soDonVi = number % 10;
		int soHangChuc = number / 10;
		scanner.close();

		switch (soHangChuc) {
			case 1:
				hangChuc = "Muoi";
				break;
			case 2:
				hangChuc = "Hai";
				break;
			case 3:
				hangChuc = "Ba";
				break;
			case 4:
				hangChuc = "Bon";
				break;
			case 5:
				hangChuc = "Nam";
				break;
			default:
				hangChuc = "";
				break;
		}

		switch (soDonVi) {
			case 1:
				hangDonVi = (soHangChuc == 1) ? "mo^t." : "mo^t'";
				break;
			case 2:
				hangDonVi = "Hai";
				break;
			case 3:
				hangDonVi = "Ba";
				break;
			case 4:
				hangDonVi = "Bon";
				break;
			case 5:
				hangDonVi = (soHangChuc != 0) ? "lam" : "nam";
				break;
			default:
				hangChuc = "";
				break;
		}

		return hangChuc + " muoi " + hangDonVi;
	}

}

