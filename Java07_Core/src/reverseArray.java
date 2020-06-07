/**
 *
 * @author minhtruong
 *
 */

import java.util.Scanner;

public class reverseArray {

    public static void main(String[] args)
    {

		 Scanner scanner = new Scanner(System.in);
		 int sum;
		 int[] array;

		 do {
				System.out.println("Nhap so phan tu: ");
				sum = scanner.nextInt();
			} while (sum < 1);

		array = new int[sum];

		 for (int i = 0; i < sum; i++) {
			 System.out.println("Nhap phan tu: " + (i + 1) + " : ");
			 array[i] = scanner.nextInt();

		 }

     reverse(array, array.length);
		 scanner.close();
    }

	static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }

        if (a == b) {
        	System.out.println("mang doi xung");
        } else {
        	System.out.println("false");
        }
	}
}

