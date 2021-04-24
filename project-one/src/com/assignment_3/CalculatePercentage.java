package com.assignment_3;

import java.util.Scanner;

public class CalculatePercentage {

	public void findPercentage(int num) {
		Scanner scan = new Scanner(System.in);
		int i, no = 1, sum = 0;

		for (i = 1; i <= num; i++) {
			System.out.println("Enter Mark of Subject " + i + " - ");
			int x = scan.nextInt();
			sum += x;

		}
		float average = (sum / num);
		System.out.println("Average : " + average);
		if (average > 90) {
			System.out.println("Grade : A");
		} else if (average > 80) {
			System.out.println("Grade : B");
		} else if (average > 70) {
			System.out.println("Grade : C");
		} else if (average > 60) {
			System.out.println("Grade : D");
		} else if (average > 50) {
			System.out.println("Grade : E");
		} else if (average < 50) {
			System.out.println("Grade : FAIL");
		}

	}

	public static void main(String[] args) {
		CalculatePercentage obj = new CalculatePercentage();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Subjects:");
		int num = scan.nextInt();
		obj.findPercentage(num);
		scan.close();

	}

}
