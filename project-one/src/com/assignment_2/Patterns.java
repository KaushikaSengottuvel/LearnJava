package com.assignment_2;

public class Patterns {
	int i, j, k, space, star;

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
	public void pattern3(int n) {

		for (i = 1; i <= n; i++) {
			space = n - i;
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (; j <= n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	// Pattern 4
	public void pattern4(int n) {
		star = 1;
		for (i = 1; i <= n; i++) {
			space = n - i;

			for (j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= star; k++) {
				System.out.print("*");

			}
			System.out.println();
			star += 2;
		}

	}

	// Pattern 5
	public void pattern5(int n) {
		star = 1;
		int count = 1;
		for (i = 1; i <= n; i++) {
			space = n - i;

			for (j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= star; k++) {
				System.out.print(count);

			}
			System.out.println();
			star += 2;
			count += 1;
		}

	}

	// Pattern6
	public void pattern6(int n) {

		for (i = 1; i < n; i++) {

			for (j = 0; j < n - i; j++) {
				System.out.print("-");
			}
			for (int first = i; first >= 1; first--) {
				System.out.print(first);
			}
			for (int k = 2; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	// }

	public static void main(String[] args) {
		Patterns p = new Patterns();
		p.pattern1();
		System.out.println("=================");
		p.pattern2();
		System.out.println("=================");
		p.pattern3(5);
		System.out.println("=================");
		p.pattern4(5);
		System.out.println("=================");
		p.pattern5(5);
		System.out.println("=================");
		p.pattern6(7);

	}

}
