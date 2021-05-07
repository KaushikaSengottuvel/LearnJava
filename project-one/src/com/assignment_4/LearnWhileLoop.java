package com.assignment_4;

import java.util.Scanner;

public class LearnWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n;
		do {
			n = scan.nextInt();
			if (n == 5) {
				System.out.println("You are exited from the program");
				break;
			} else if (n < 11) { // Why ?
				System.out.println("Re-enter the number : ");
				continue;
			} else {
				System.out.println("Wrong number");
			}

		} while (n < 11);
		scan.close();
	}

}
