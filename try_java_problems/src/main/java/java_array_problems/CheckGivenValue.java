package java_array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGivenValue {

	public static void main(String[] args) {
		int n, value, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers :");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter the numbers");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the Value to be searched for :");
		value = sc.nextInt();

		System.out.println("Using Arrays.asList().contains() : " + Arrays.asList().contains(value));

		for (int i : a) {
			if (value == i) {
				count = 1;
				break;
			} else
				continue;
		}

		if (count == 1)
			System.out.println("The given Value has been found");
		else
			System.out.println("The given Value has not been found");

		sc.close();
	}

}
