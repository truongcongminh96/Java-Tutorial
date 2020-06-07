/**
 *
 * @author minhtruong
 *
 */

import java.util.Scanner;
public class NhapXuat {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String ten;
		int tuoi;

		try {
		System.out.println("Nhap ten: ");
		ten = scanner.nextLine();

		System.out.println("Tuoi: ");
		tuoi = scanner.nextInt();

		System.out.println("chao: " + ten + "\ntuoi: " + tuoi);
		} finally {
			scanner.close();
		}
	}

}
