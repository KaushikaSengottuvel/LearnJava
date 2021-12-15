package try_java_problems;

import java.util.Scanner;

public class compute_quotient_and_remainder {

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
