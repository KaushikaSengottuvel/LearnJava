package java_array_problems;

import java.util.Scanner;

public class SortAscendingArray {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers :");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter the numbers");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		/*
		 * for (int i : a) { int x; for (int j : a) { if (i < j) { x = i; i = j; j = x;
		 * }
		 *
		 * } }
		 */

		for (int i = 0; i < n; i++) {
			int x;
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					// swapping
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}

			}
		}
		System.out.println("After sorting in descending order:\n");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\nAfter sorting in ascending order:\n");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
