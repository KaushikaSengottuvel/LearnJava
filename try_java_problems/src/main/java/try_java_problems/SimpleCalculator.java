package try_java_problems;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		int a, b;
		char n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an Operator : +, -, *, /");
		n = sc.next().charAt(0);
		System.out.println("Enter the number 1:");
		a = sc.nextInt();
		System.out.println("Enter the number 2:");
		b = sc.nextInt();

		switch (n) {
		case '+': {
			System.out.println("You have chosen Addition :" + (a + b));
			break;
		}
		case '-': {
			System.out.println("You have chosen Subtraction :" + (a - b));
			break;
		}
		case '*': {
			System.out.println("You have chosen Multiplication :" + a * b);
			break;
		}
		case '/': {
			System.out.println("You have chosen Division :" + a / b);
			break;
		}
		default: {
			System.out.println("Invalid Operator");
			break;
		}
		}

	}

}
