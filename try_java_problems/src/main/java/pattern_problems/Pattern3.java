package pattern_problems;

import java.util.Scanner;

public class Pattern3 {

	// A
	// B B
	// C C C
	// D D D D
	// E E E E E right angled triangle

	public static void main(String[] args) {
		int n;
		char a = 'A';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		n = sc.nextInt();

		for (int i = 0; i < n; i++, a++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
