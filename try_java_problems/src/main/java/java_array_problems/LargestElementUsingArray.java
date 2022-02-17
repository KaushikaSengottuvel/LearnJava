package java_array_problems;

import java.util.Scanner;

public class LargestElementUsingArray {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers :");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i : a) {
			if (a[0] < i)
				a[0] = i;
		}
		System.out.println("Largest elementof the array is " + a[0]);
		sc.close();
	}

}
