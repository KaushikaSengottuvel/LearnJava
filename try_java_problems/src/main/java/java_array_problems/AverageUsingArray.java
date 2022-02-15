package java_array_problems;

import java.util.Scanner;

public class AverageUsingArray {

	public static void main(String[] args) {
		int n, avg1 = 0, avg2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers :");
		n = sc.nextInt();
		double num[] = new double[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextDouble();
			avg1 += num[i];
		}
		System.out.println("Average using normal for loop : " + avg1 / n);

		for (double a : num) {
			avg2 += a;
		}
		System.out.println("Using enhanced for loop : " + avg2 / n);
	}

}
