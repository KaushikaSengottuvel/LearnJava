package com.assignment_3;

import java.util.Scanner;

public class SumOfNumbers {
	public int findSumOfNumbers(int num) {
		int i, sum = 0;
		for (i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumbers obj = new SumOfNumbers();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scan.nextInt();
		System.out.println("Sum of all the numbers in " + num + " = " + obj.findSumOfNumbers(num));
		scan.close();
	}

}
