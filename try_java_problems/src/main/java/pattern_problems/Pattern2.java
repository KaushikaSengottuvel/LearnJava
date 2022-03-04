package pattern_problems;

import java.util.Scanner;

public class Pattern2 {

	// 1
	// 12
	// 123
	// 1234 right angled triangle with numbers

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
