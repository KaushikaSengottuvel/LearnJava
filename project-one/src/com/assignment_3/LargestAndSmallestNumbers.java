package com.assignment_3;

import java.util.Scanner;

public class LargestAndSmallestNumbers {
	public void findLarge(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is the largest of " + n1 + " , " + n2 + " and " + n3);
		} else if (n2 > n3) {
			System.out.println(n2 + " is the largest of " + n1 + " , " + n2 + " and " + n3);
		} else {
			System.out.println(n3 + " is the largest of " + n1 + " , " + n2 + " and " + n3);
		}

	}

	public void findSmall(int n1, int n2, int n3) {
		if (n1 < n2 && n1 < n3) {
			System.out.println(n1 + " is the smallest of " + n1 + " , " + n2 + " and " + n3);
		} else if (n2 < n3) {
			System.out.println(n2 + " is the smallest of " + n1 + " , " + n2 + " and " + n3);
		} else {
			System.out.println(n3 + " is the smallest of " + n1 + " , " + n2 + " and " + n3);
		}

	}

	public static void main(String[] args) {
		LargestAndSmallestNumbers num = new LargestAndSmallestNumbers();
		System.out.println("Enter 3 numbers:");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		System.out.println("Select the option: \n 1.Largest of 3 numbers \n 2.Smallest of 3 numbers");
		int opt = scan.nextInt();
		switch (opt) {
		case 1:
			num.findLarge(n1, n2, n3);
			break;

		case 2:
			num.findSmall(n1, n2, n3);
			break;
		}
		scan.close();

	}

}
