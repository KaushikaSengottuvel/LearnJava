package basic_java_problems;

import java.util.Scanner;

public class GenerateMultiplicationTable {
	public static void main(String[] args) {
		int a, till;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multiplicant :");
		a = sc.nextInt();
		System.out.println("table needed till :");
		till = sc.nextInt();
		for (int i = 1; i <= till; i++) {
			System.out.println(i + " * " + a + " = " + i * a);
		}
	}

}
