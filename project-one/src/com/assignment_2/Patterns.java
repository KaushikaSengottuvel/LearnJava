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
		int pos = n * 2 - 1;
		int a = 0, h;
		int count = 1;
		space = n;
		star = 1;
		for (i = 1; i <= n; i++) {
			h = i;
			// for(h=0;;) {
			for (j = 0; j < space; j++) {
				System.out.print(" ");

			}

			for (k = 1; k < star; k++) {
				if (star == 1) {
					System.out.print(h);
				} else {
					for (h = i; h < 1; h++) {
						System.out.print(h);
					}

					if (h == 1) {
						System.out.print(h);
						h++;
					}
					if (h > 1) {
						System.out.print(h);
						h--;
					}
				}

			}

			space--;
			star += 2;

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
		p.pattern6(4);

	}

}
