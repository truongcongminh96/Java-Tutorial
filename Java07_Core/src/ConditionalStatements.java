/**
 *
 * @author minhtruong
 *
 */

import java.util.Calendar;
import java.util.Scanner;
public class ConditionalStatements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String ten;
		int tuoi;
		int namSinh;
		String message = null;
		String msg = null;

		int year = Calendar.getInstance().get(Calendar.YEAR);

		System.out.println("Nhap ten: ");
		ten = scanner.nextLine();

		System.out.println("Tuoi: ");
		tuoi = scanner.nextInt();

		System.out.println("Nam Sinh: ");
		namSinh = scanner.nextInt();

//		if (tuoi < 18) {
//			System.out.println("chao: " + ten + "\ntuoi: " + tuoi + "\nYou are not allowed!");
//		} else {
//			System.out.println("chao: " + ten + "\ntuoi: " + tuoi + "\nYou are allowed!");
//		}

		message = (tuoi < 18) ? "chao: " + ten + "\ntuoi: " + tuoi + "\nYou are not allowed!"
							  : "chao: " + ten + "\ntuoi: " + tuoi + "\nYou are allowed!";

		msg = ((year - namSinh) < 24) ? "Chao em" : "Chao anh/chi";

		System.out.println(msg + message);

		scanner.close();
	}
}
