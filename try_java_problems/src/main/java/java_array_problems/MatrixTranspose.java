package java_array_problems;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		m = sc.nextInt();
		System.out.println("Enter the no of columns :");
		n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[n][m];

		// Getting input from user for array
		System.out.println("Enter the array elements for array :");
		for (int i = 0; i < m; i++) {
			System.out.println(" Row " + i);
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
				b[j][i] = a[i][j];
			}
		}

		// Display

		System.out.println("Given Matrix is ");
		for (int[] i : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("After Transpose :");

		for (int[] i : b) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
