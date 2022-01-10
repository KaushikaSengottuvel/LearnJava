package try_java_problems;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int a, start = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		a = sc.nextInt();
		sc.close();
		System.out.println("The facors of the number " + a + " are ");
		for (; start <= a / 2; start++) {
			if (a % start == 0)
				System.out.print(start + " ");
		}

	}

}
