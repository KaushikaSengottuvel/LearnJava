package basic_java_problems;

import java.util.Scanner;

public class NoExperessedAsSumOf2PrimeNo {

	public static void main(String[] args) {
		int a, res, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		a = sc.nextInt();

		// ******************
		if (a % 2 != 0) {
			res = checkPrime(a - 2);
			if (res != 1) {
				System.out.println(a - 2 + " + 2 = " + a);
			} else
				System.out.println("No match");
		}
		// *****************
		else {
			int checked;
			for (int pr = 3; pr <= a / 2; pr += 2) {
				checked = checkPrime(pr);
				if (checked != 1) {
					res = a - pr;
					checked = checkPrime(res);
					if (checked != 1) {
						System.out.println(a + " = " + pr + " + " + res);
					}
				}

			}

		}

		sc.close();
	}

	public static int checkPrime(int x) {
		int count = 0;
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0) {
				return 1;
			} else
				continue;
		}
		if (count == 0) {
			return 0;
		} else
			return 1;
	}

}
