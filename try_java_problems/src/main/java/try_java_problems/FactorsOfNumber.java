package try_java_problems;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int a, start = 1;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		a = sc.nextInt();
		sc.close();
		System.out.print("The factors of the number " + a + " are ");
		for (; start <= a / 2; start++) { // it is enough to check half of the given number. so a/2
			if (a % start == 0) {
				System.out.print(start + " ");
				isPrime = false;
			}
		}
		if (isPrime == true)
			System.out.print(a + ". Its a Prime Number.");
		else
			System.out.print(a);

	}

}
