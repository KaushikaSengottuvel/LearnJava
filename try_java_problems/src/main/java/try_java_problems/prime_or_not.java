package try_java_problems;

import java.util.Scanner;

public class prime_or_not {

	public static void main(String[] args) {
		int x, count = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				count = 1;
				break;
			} else
				continue;
		}
		if (count == 1)
			System.out.println("Not a prime number");
		else
			System.out.println("Prime number");

	}

}
