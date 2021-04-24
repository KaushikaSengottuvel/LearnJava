package com.assignment_3;

import java.util.Scanner;

public class QuotientReminder {

	public void findQuotientReminder(int num1, int num2) {
		System.out.println("Quotient = " + num1 / num2 + "\nReminder = " + num1 % num2);
	}

	public static void main(String[] args) {
		QuotientReminder obj = new QuotientReminder();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		obj.findQuotientReminder(num1, num2);
		scan.close();

	}

}
