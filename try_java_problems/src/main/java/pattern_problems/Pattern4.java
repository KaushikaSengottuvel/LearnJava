package pattern_problems;

import java.util.Scanner;

public class Pattern4 {

	// * * * * *
	// * * * *
	// * * *
	// * *
	// * inverted half pyramid

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		sc.close();
	}

}
