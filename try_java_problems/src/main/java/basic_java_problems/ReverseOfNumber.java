package basic_java_problems;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int a, b, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer :");
		a = sc.nextInt();
		while (a > 0) {
			b = a % 10;
			a = a / 10;
			c = b + c * 10;

		}
		System.out.println("Reverse of the number :" + c);

	}

}
