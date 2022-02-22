package basic_java_problems;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend :");
		a = sc.nextInt();
		System.out.println("Enter the Divisor :");
		b = sc.nextInt();
		System.out.println("Quotient : " + a / b + "\nRemainder : " + a % b);
		sc.close();
	}

}
