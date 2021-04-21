package com.assignment_2;

public class Patterns {
	int i, j;

	// Pattern 1
	public void pattern1() {
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Pattern 2
	public void pattern2() {
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	// Pattern 3
	public void pattern3() {
		for (i = 5; i >= 0; i--) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		Patterns p = new Patterns();
		p.pattern1();
		System.out.println("=================");
		p.pattern2();
		System.out.println("=================");
		p.pattern3();
		System.out.println("=================");

	}

}
