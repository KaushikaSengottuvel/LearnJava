package java_array_problems;

import java.util.Scanner;

public class Add2Matrix2D {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		m = sc.nextInt();
		System.out.println("Enter the no of columns :");
		n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int sum[][] = new int[m][n];

		// Getting input from user for array 1
		System.out.println("Enter the array elements for array 1 :");
		for (int i = 0; i < m; i++) {
			System.out.println(" Row " + i);
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		// Getting input from user for array 2
		System.out.println("Enter the array elements for array 2 :");
		for (int i = 0; i < m; i++) {
			System.out.println(" Row " + i);
			for (int j = 0; j < n; j++) {
				b[i][j] = sc.nextInt();
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Adding 2 matrices :\n");
		for (int[] i : sum) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
