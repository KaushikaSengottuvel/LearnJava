package java_array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenat2Arrays {

	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);

		// 1st Array

		System.out.println("Enter the range of numbers for array 1:");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter the numbers for array 1 :");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		// 2nd Array

		System.out.println("Enter the range of numbers for array 2:");
		m = sc.nextInt();
		int b[] = new int[m];

		System.out.println("Enter the numbers for array 2 :");
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		// 3rd array
		int res[] = new int[m + n];

		// arraycopy, a predefined function mentioned with positions, from where to be
		// copied and pasted.
		System.arraycopy(a, 0, res, 0, a.length);
		System.arraycopy(b, 0, res, a.length, b.length);

		System.out.println(Arrays.toString(res));

		sc.close();
	}

}
