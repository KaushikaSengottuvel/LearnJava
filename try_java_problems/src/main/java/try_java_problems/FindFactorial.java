package try_java_problems;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		int numm, fact = 1;
		Scanner sc = new Scanner(System.in);
		numm = sc.nextInt();

		for (int i = 1; i <= numm; i++) {
			fact *= i;
		}

		System.out.println("factorial : " + fact);

	}

}
