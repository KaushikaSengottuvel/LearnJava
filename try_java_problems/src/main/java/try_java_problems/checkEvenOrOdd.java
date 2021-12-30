package try_java_problems;

import java.util.Scanner;

public class checkEvenOrOdd {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		a = sc.nextInt();
		if (a % 2 != 0) {
			System.out.println("Odd Number");
		} else
			System.out.println("Even Number");
		sc.close();

	}

}
