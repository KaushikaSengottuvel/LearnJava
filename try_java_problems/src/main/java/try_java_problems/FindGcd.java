package try_java_problems;

import java.util.Scanner;

public class FindGcd {

	public static void main(String[] args) {
		int a, b;
		FindGcd obj = new FindGcd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("GCD of 2 numbers is : " + obj.findGcd(a, b));

	}

	private int findGcd(int a, int b) {
		int c = 0;
		if (a > b) {
			for (c = b; c > 0; c--) {
				if (a % c == 0 && b % c == 0) {
					return c;
				}
			}
		} else {
			for (c = a; c > 0; c--) {
				if (a % c == 0 && b % c == 0) {
					return c;
				}
			}
		}
		return c;

	}
}
