package try_java_problems;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int first = 0, second = 1, a, third;
		System.out.println("fibonacci series till?");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.print(first + " " + second + " ");
		for (int i = 2; i <= a; i++) {
			third = first + second;
			first = second;
			second = third;
			System.out.print(third + " ");

		}

	}

}
