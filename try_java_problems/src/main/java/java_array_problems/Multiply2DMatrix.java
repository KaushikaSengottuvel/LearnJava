package java_array_problems;

import java.util.Scanner;

public class Multiply2DMatrix {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		m = sc.nextInt();
		System.out.println("Enter the no of columns :");
		n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int mul[][] = new int[m][n];

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
				mul[i][j] = a[i][j] * b[i][j];
			}
		}
		System.out.println("Multiplying 2 matrices :\n");

		// Print Using enhanced for loop( in sum[][], take i[](single array first) then
		// from i[], take elements
		for (int[] i : mul) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
