/**
 *
 * @author minhtruong
 *
 */

import java.util.Scanner;

public class DanNhapLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long number;

		do {
			System.out.println("Nhap so: ");
			number = scanner.nextInt();
		} while (number < 1);

		scanner.close();

		System.out.println("Tong: " + tinhTongUseWhile(number));
		System.out.println("Tong: " + tinhTongUseDoWhile(number));
	  System.out.println("Tong: " + tinhTongUseFor(number));
		System.out.println("Tong: " + tinhTongDaySo(number));
    System.out.println("Chu so: " + demChuSo(number));
  }

	public static int tinhTongUseWhile(long number) {
		int tong = 0, i = 1;

		while(i <= number) {
			tong += i;
			i++;
		}

		return tong;
	}

	public static int tinhTongUseDoWhile(long number) {
		int tong = 0, i = 1;

		do{
			tong += i;
			i++;
		} while (i <= number);

		return tong;
	}

	public static int demChuSo(long number) {
		//int dem = 0;

		// su dung de quy
		if ((number / 10) == 0) return 1;
		else return 1 + demChuSo(number / 10);

    // use for loop does not have body
    //for (number != 0; number /= 10; ++dem);
    //return dem;
	}

  public static int tinhTongUseFor(long number) {
    int tong = 0;

    //for (int i = 0; i <= number; i++) {
      //tong += i;
    //}

    for (int i = 0; i <= number; tong += i++);

    return tong;
  }

  public static float tinhTongDaySo(long number) {
    float tong = 0f;

    for (int i =1; i<= number; i++) {
      tong += 1f/(i*(i+1)*(i+2));
    }

    //for (int i = 0; i <= number; tong += 1f/(i++) * (i++ +1) * (i++ +2));

    return tong;
  }
}

