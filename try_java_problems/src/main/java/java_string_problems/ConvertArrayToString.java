package java_string_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertArrayToString {

	public static void main(String[] args) {
		int n, r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Single Array String Conversion :\nEnter the range of numbers :");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers for single array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		// convert using toString function
		System.out.println(Arrays.toString(a));
		System.out.println("Multi Array String Conversion :\nEnter the no of rows :");
		r = sc.nextInt();
		System.out.println("Enter the no of columns :");
		c = sc.nextInt();
		int b[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			System.out.println(" Row " + i);
			for (int j = 0; j < c; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		// using deepToString, because toString prints only the address,since each
		// element in array contains another array

		System.out.println(Arrays.deepToString(b));
		sc.close();
	}

}
