package try_java_problems;

import java.util.Scanner;

public class power_of_number {

	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base :");
		a = sc.nextInt();
		System.out.println("Enter the power :");
		b = sc.nextInt();
		/*
		 * int x = (int) Math.pow(a, b); System.out.println(x);
		 */
		int c = a;
		for (int i = 1; i < b; i++) {

			c *= a;

		}
		System.out.println(c);
	}

}
