package basic_java_problems;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d;
		System.out.println("Enter no 1 :");
		a = sc.nextInt();
		System.out.println("Enter no 2 :");
		b = sc.nextInt();
		System.out.println("Enter no 3 :");
		c = sc.nextInt();
		d = a > (b > c ? b : c) ? a : b > c ? b : c;
		System.out.println("Largest of 3 numbers :" + d);
	}

}
