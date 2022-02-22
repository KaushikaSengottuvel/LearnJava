package basic_java_problems;

import java.util.Scanner;

public class Add2Integers {
	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer 1 :");
		a = sc.nextInt();
		System.out.println("Enter integer 2 :");
		b = sc.nextInt();
		System.out.println("Sum of 2 integers : " + (a + b));
		sc.close();
	}
}
