package com.assignment_4;

public class OddEvenTernaryOperator {

	public static void main(String[] args) {
		int n;
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " - ");
			System.out.println((i % 2 == 0) ? "Even" : "Odd");
		}

	}

}
