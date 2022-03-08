package pattern_problems;

import java.util.Scanner;

public class Pattern6 {

	// *
	// * * *
	// * * * * *
	// * * * * * * *
	// * * * * * * * * * full pyramid triangle using *

	public static void main(String[] args) {
		int n, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		n = sc.nextInt();
		x = n;
		for (int a = 1; a <= n; a++)// whole loop
		{

			for (int i = 1; i < x; i++) {// for gap
				System.out.print(" ");
			}
			for (int j = 0; j < a * 2 - 1; j += 2) {// fro printing star
				System.out.print(" * ");
			}
			System.out.println();// new line
			x--;
		}

		sc.close();
	}

}
